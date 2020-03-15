package Test.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
//SAX
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
//SAX and external XSD
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

import com.columbia.adapter.soap.dto.Header;
import com.columbia.adapter.soap.dto.Info;
import com.columbia.adapter.soap.dto.MDEntryPx;
import com.columbia.adapter.soap.dto.MktData;
import com.columbia.adapter.soap.dto.MktDataDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	private static final String NAMESPACE = "http://www.fixprotocol.org/FIXML-5-0";
	private static Integer orderId = 0;

	// validate SAX and external XSD
	public static boolean validateWithExtXSDUsingSAX(String xml, String xsd)
			throws ParserConfigurationException, IOException {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setValidating(false);
			factory.setNamespaceAware(true);

			SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
			SAXParser parser = null;
			try {
				factory.setSchema(schemaFactory.newSchema(new Source[] { new StreamSource(xsd) }));
				parser = factory.newSAXParser();
			} catch (SAXException se) {
				System.out.println("SCHEMA : " + se.getMessage()); // problem in the XSD itself
				return false;
			}

			XMLReader reader = parser.getXMLReader();
			reader.setErrorHandler(new ErrorHandler() {
				public void warning(SAXParseException e) throws SAXException {
					System.out.println("WARNING: " + e.getMessage()); // do nothing
				}

				public void error(SAXParseException e) throws SAXException {
					System.out.println("ERROR : " + e.getMessage());
					throw e;
				}

				public void fatalError(SAXParseException e) throws SAXException {
					System.out.println("FATAL : " + e.getMessage());
					throw e;
				}
			});
			reader.parse(new InputSource(xml));
			return true;
		} catch (ParserConfigurationException pce) {
			throw pce;
		} catch (IOException io) {
			throw io;
		} catch (SAXException se) {
			return false;
		}
	}

	public Document validateWithIntXSDUsingDOM(String responseXml, String xsdFile)
			throws ParserConfigurationException, IOException, SAXException {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(false);
			factory.setNamespaceAware(true);

			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			URL schemaUrl = new URL("file:" + App.class.getClass().getResource(xsdFile).getFile());
			Schema schema = schemaFactory.newSchema(schemaUrl);
			factory.setSchema(schema);

			DocumentBuilder builder = factory.newDocumentBuilder();
			builder.setErrorHandler(new ErrorHandler() {
				public void warning(SAXParseException e) throws SAXException {
					System.out.println("WARNING: " + e.getMessage()); // do nothing
				}

				public void error(SAXParseException e) throws SAXException {
					System.out.println("ERROR: " + e.getMessage());
					throw e;
				}

				public void fatalError(SAXParseException e) throws SAXException {
					System.out.println("FATAL: " + e.getMessage());
					throw e;
				}
			}

			);
			Document document = builder.parse(new InputSource(new StringReader(responseXml)));
			return document;
		} catch (ParserConfigurationException pce) {
			throw pce;
		} catch (IOException io) {
			throw io;
		} catch (SAXException se) {
			throw se;
		}
	}

	private void processResults1074(Document document) throws JsonProcessingException {
		NodeList FIXML = document.getElementsByTagNameNS(NAMESPACE, "FIXML");
		Node fixmlNode = FIXML.item(0);
		NamedNodeMap attributes = fixmlNode.getAttributes();
		String xr = attributes.getNamedItem("xr").getNodeValue();
		orderId = Integer.parseInt(xr.split("|")[xr.split("|").length - 1]);
		System.out.println(String.format("Order id after parsing is : %d", orderId));
		writeOrderIdToFile();

		NodeList mktDataFullList = document.getElementsByTagNameNS(NAMESPACE, "MktDataFull");
		if (mktDataFullList.getLength() == 1) {
			Element mktDataFullElement = (Element) mktDataFullList.item(0);
			NamedNodeMap hdrAttributes = mktDataFullElement.getElementsByTagNameNS(NAMESPACE, "Hdr").item(0)
					.getAttributes();
			if (hdrAttributes.getNamedItem("MdlMsg").getNodeValue()
					.equals("No existen respuestas aser entregadas al afiliado")) {
				System.out.println(String.format("Message recieved with for SID : %s",
						hdrAttributes.getNamedItem("SID").getNodeValue()));
				return;
			}
			convertToJsonToSendToKafka(mktDataFullElement);
		} else {
			for (int i = 0; i < mktDataFullList.getLength(); i++) {
				Element mktDataFullElement = (Element) mktDataFullList.item(i);
				convertToJsonToSendToKafka(mktDataFullElement);
			}
			System.out.println("All the data pushed to Kafka successfully.");
		}

	}
	
	private Integer getOrderIdStringFromFile() {
		if (orderId == 0) {
			File file = new File("F:\\\\Java_stuff\\\\orderid.txt");
			if(file.exists()) {
				try (Scanner sc = new Scanner(file)) {
					if (sc.hasNext()) {
						orderId = Integer.parseInt(sc.next());
					}
				} catch (FileNotFoundException e) {
					System.out.println("Error occurred file opening the orderid file." + e);
				}
			}
		}
		return orderId;
	}
	
	private void writeOrderIdToFile() {
		File file = new File("F:\\\\Java_stuff\\\\orderid.txt");
		try {
			file.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			System.out.println("Writing order id to file: " + orderId);
			fw.write("" + orderId);
		} catch (IOException e) {
			System.out.println("Error occurred file writing the orderid to file." + e);
		} finally {
			try {
				fw.flush();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void processResults9999(Document document) throws JsonProcessingException {
		NodeList userRsp = document.getElementsByTagNameNS(NAMESPACE, "UserRsp");
		Node fixmlNode = userRsp.item(0);
		NamedNodeMap attributes = fixmlNode.getAttributes();
		String userStatText = attributes.getNamedItem("UserStatText").getNodeValue();
		System.out.println(String.format("The token recieved in response of Service9999 is: \n%s", userStatText));
	}

	private void convertToJsonToSendToKafka(Element mktDataFullElement) throws JsonProcessingException {
		NamedNodeMap hdrAttributes = mktDataFullElement.getElementsByTagNameNS(NAMESPACE, "Hdr").item(0)
				.getAttributes();
		NamedNodeMap instrmtAttributes = mktDataFullElement.getElementsByTagNameNS(NAMESPACE, "Instrmt").item(0)
				.getAttributes();
		NamedNodeMap fullAttributes = mktDataFullElement.getElementsByTagNameNS(NAMESPACE, "Full").item(0)
				.getAttributes();
		NodeList infoNodes = mktDataFullElement.getElementsByTagNameNS(NAMESPACE, "Info");

		Header header = new Header();
		header.setExecTime(hdrAttributes.getNamedItem("OrigSnt").getNodeValue());
		header.setMdlMsg(hdrAttributes.getNamedItem("MdlMsg").getNodeValue());

		MDEntryPx first = new MDEntryPx();
		first.setMDEntryType("8");
		first.setMDEntryPx(Double.parseDouble(fullAttributes.getNamedItem("LowPx").getNodeValue()));

		MDEntryPx second = new MDEntryPx();
		second.setMDEntryType("t");
		second.setMDEntryPx(Double.parseDouble(fullAttributes.getNamedItem("PxDelta").getNodeValue()));

		MktData mktData = new MktData();
		mktData.setSymbol(instrmtAttributes.getNamedItem("Sym").getNodeValue());
		mktData.setLastPx(Double.parseDouble(fullAttributes.getNamedItem("Px").getNodeValue()));
		mktData.setMDEntryPx(Arrays.asList(first, second));

		Info info = new Info();
		for (int i = 0; i < 2; i++) {
			Node infoNode = infoNodes.item(i);
			String infoType = infoNode.getAttributes().getNamedItem("InfoTyp").getNodeValue();
			String infoId = infoNode.getAttributes().getNamedItem("InfoID").getNodeValue();
			if (infoType.equals("70")) {
				info.setDuration(Double.parseDouble(infoId));
			} else {
				info.setTir(Double.parseDouble(infoId));
			}
		}

		MktDataDto dto = new MktDataDto();
		dto.setHeader(header);
		dto.setMktData(mktData);
		dto.setInfo(info);
		
		ObjectMapper obj = new ObjectMapper();
		System.out.println(String.format("Data which will be pushed to Kafka is: \n%s", obj.writeValueAsString(dto)));
	}

	public static void main(String args[]) throws Exception {
		App app = new App();
		
		Map<Integer, String> responseListFor1074 = app.getResponseListFor1074();
		
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Read from file: " + app.getOrderIdStringFromFile());
			if(responseListFor1074.get(app.getOrderIdStringFromFile()) != null) {
				Document document1074 = app.validateWithIntXSDUsingDOM(responseListFor1074.get(app.getOrderIdStringFromFile()),
						"/wsdl/schemas/FIXML/fixml-marketdata-impl-5-0.xsd");
				app.processResults1074(document1074);
			}
		}

		Document document9999 = app.validateWithIntXSDUsingDOM("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<SOAP-ENV:Envelope\r\n" + 
				"	xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"	<SOAP-ENV:Body>\r\n" + 
				"	<ns0:UserRsp\r\n" + 
				"		xmlns:ns0=\"http://www.fixprotocol.org/FIXML-5-0\" UserReqID=\" \"\r\n" + 
				"		Username=\"davivalores\" UserStat=\"1\"\r\n" + 
				"		UserStatText=\"f91c4990-4f75-11ea-8619-f0921c1762f0\" />\r\n" + 
				"</SOAP-ENV:Body>\r\n" + 
				"</SOAP-ENV:Envelope>",
				"/wsdl/schemas/FIXML/fixml-components-base-5-0.xsd");
		app.processResults9999(document9999);
	}
	
	private Map<Integer, String> getResponseListFor1074() {
		Map<Integer, String> responseMap = new HashMap<>();
		responseMap.put(0, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"   <SOAP-ENV:Body>\r\n" + 
				"      <ns0:FIXML xmlns:ns0=\"http://www.fixprotocol.org/FIXML-5-0\" v=\"5.0\" s=\"20071228\" xr=\"004003-1|004003-2\">\r\n" + 
				"         <ns0:Batch>\r\n" + 
				"            <ns0:MktDataFull TrdDt=\"2020-02-14\">\r\n" + 
				"               <ns0:Hdr SID=\"MEC+\" SSub=\"IB\" OrigSnt=\"2020-02-14T09:58:24.000267\" MdlMsg=\"I am 1\" />\r\n" + 
				"               <ns0:Instrmt Sym=\"CTCP\" SecTyp=\"PZFJ\" />\r\n" + 
				"               <ns0:Full Typ=\"3\" Px=\"257.8\" Dt=\"2020-02-14\" Tm=\"09:58:24\" PxDelta=\"0.01\" Txt=\"CTCP\" LowPx=\"257.77\" />\r\n" + 
				"               <ns0:Info InfoID=\"2.678\" InfoTyp=\"70\" />\r\n" + 
				"               <ns0:Info InfoID=\"4.826\" InfoTyp=\"219\" />\r\n" + 
				"            </ns0:MktDataFull>\r\n" + 
				"            <ns0:MktDataFull TrdDt=\"2020-02-14\">\r\n" + 
				"               <ns0:Hdr SID=\"MEC+\" SSub=\"IB\" OrigSnt=\"2020-02-14T09:58:24.000268\" MdlMsg=\"I am 2\" />\r\n" + 
				"               <ns0:Instrmt Sym=\"CTES\" SecTyp=\"PZFJ\" />\r\n" + 
				"               <ns0:Full Typ=\"3\" Px=\"297.01\" Dt=\"2020-02-14\" Tm=\"09:58:24\" PxDelta=\"0.01\" Txt=\"CTES\" LowPx=\"296.98\" />\r\n" + 
				"               <ns0:Info InfoID=\"5.141\" InfoTyp=\"70\" />\r\n" + 
				"               <ns0:Info InfoID=\"5.369\" InfoTyp=\"219\" />\r\n" + 
				"            </ns0:MktDataFull>\r\n" + 
				"         </ns0:Batch>\r\n" + 
				"      </ns0:FIXML>\r\n" + 
				"   </SOAP-ENV:Body>\r\n" + 
				"</SOAP-ENV:Envelope>");
		responseMap.put(2, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 
				"<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"   <SOAP-ENV:Body>\r\n" + 
				"      <ns0:FIXML xmlns:ns0=\"http://www.fixprotocol.org/FIXML-5-0\" v=\"5.0\" s=\"20071228\" xr=\"004003-3|004003-4\">\r\n" + 
				"         <ns0:Batch>\r\n" + 
				"            <ns0:MktDataFull TrdDt=\"2020-02-14\">\r\n" + 
				"               <ns0:Hdr SID=\"MEC+\" SSub=\"IB\" OrigSnt=\"2020-02-14T09:58:24.000267\" MdlMsg=\"I am 3\" />\r\n" + 
				"               <ns0:Instrmt Sym=\"CTCP\" SecTyp=\"PZFJ\" />\r\n" + 
				"               <ns0:Full Typ=\"3\" Px=\"257.8\" Dt=\"2020-02-14\" Tm=\"09:58:24\" PxDelta=\"0.01\" Txt=\"CTCP\" LowPx=\"257.77\" />\r\n" + 
				"               <ns0:Info InfoID=\"2.678\" InfoTyp=\"70\" />\r\n" + 
				"               <ns0:Info InfoID=\"4.826\" InfoTyp=\"219\" />\r\n" + 
				"            </ns0:MktDataFull>\r\n" + 
				"            <ns0:MktDataFull TrdDt=\"2020-02-14\">\r\n" + 
				"               <ns0:Hdr SID=\"MEC+\" SSub=\"IB\" OrigSnt=\"2020-02-14T09:58:24.000268\" MdlMsg=\"I am 4\" />\r\n" + 
				"               <ns0:Instrmt Sym=\"CTES\" SecTyp=\"PZFJ\" />\r\n" + 
				"               <ns0:Full Typ=\"3\" Px=\"297.01\" Dt=\"2020-02-14\" Tm=\"09:58:24\" PxDelta=\"0.01\" Txt=\"CTES\" LowPx=\"296.98\" />\r\n" + 
				"               <ns0:Info InfoID=\"5.141\" InfoTyp=\"70\" />\r\n" + 
				"               <ns0:Info InfoID=\"5.369\" InfoTyp=\"219\" />\r\n" + 
				"            </ns0:MktDataFull>\r\n" + 
				"         </ns0:Batch>\r\n" + 
				"      </ns0:FIXML>\r\n" + 
				"   </SOAP-ENV:Body>\r\n" + 
				"</SOAP-ENV:Envelope>");
		return responseMap;
	}
}
