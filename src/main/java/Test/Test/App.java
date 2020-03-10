package Test.Test;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

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

	public static Document validateWithIntXSDUsingDOM(String responseXml, String xsdFile)
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
			InputSource inputSource = new InputSource(responseXml);
			Document document = builder.parse(inputSource);
			return document;
		} catch (ParserConfigurationException pce) {
			throw pce;
		} catch (IOException io) {
			throw io;
		} catch (SAXException se) {
			throw se;
		}
	}

	private static void processResults1074(Document document) throws JsonProcessingException {
		NodeList FIXML = document.getElementsByTagNameNS(NAMESPACE, "FIXML");
		Node fixmlNode = FIXML.item(0);
		NamedNodeMap attributes = fixmlNode.getAttributes();
		String xr = attributes.getNamedItem("xr").getNodeValue();
		int orderId = Integer.parseInt(xr.split("|")[xr.split("|").length - 1]);
		System.out.println(String.format("Order id after parsing is : %d", orderId));

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

	private static void processResults9999(Document document) throws JsonProcessingException {
		NodeList userRsp = document.getElementsByTagNameNS(NAMESPACE, "UserRsp");
		Node fixmlNode = userRsp.item(0);
		NamedNodeMap attributes = fixmlNode.getAttributes();
		String userStatText = attributes.getNamedItem("UserStatText").getNodeValue();
		System.out.println(String.format("The token recieved in response of Service9999 is: \n%s", userStatText));
	}

	private static void convertToJsonToSendToKafka(Element mktDataFullElement) throws JsonProcessingException {
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
		Document document1074 = validateWithIntXSDUsingDOM(App.class.getClassLoader().getResource("response.xml").getFile(),
				"/wsdl/schemas/FIXML/fixml-marketdata-impl-5-0.xsd");
		processResults1074(document1074);

		Document document9999 = validateWithIntXSDUsingDOM(App.class.getClassLoader().getResource("response9999.xml").getFile(),
				"/wsdl/schemas/FIXML/fixml-components-base-5-0.xsd");
		processResults9999(document9999);
	}
}
