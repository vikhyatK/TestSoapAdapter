
package com.adapter.cppadapter.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * The Root Schema
 * <p>
 * The root schema comprises the entire JSON document.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TradeDate",
    "TransactTime",
    "AvgPx",
    "Quantity",
    "GrossTradeAmt",
    "TradeInputSource",
    "AccruedInterestRate",
    "RefAllocID",
    "Side",
    "TradingSessionID",
    "AvgParPx",
    "SettlDate",
    "ExecAllocGrp",
    "OrdAllocGrp",
    "Instrument",
    "YieldData",
    "Quote",
    "TradeCaptureReport",
    "UserDefinedTags",
    "AMPFields"
})
public class TradeExample {

    /**
     * The Tradedate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeDate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String tradeDate = "";
    /**
     * The Transacttime Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TransactTime")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String transactTime = "";
    /**
     * The Avgpx Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AvgPx")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer avgPx = 0;
    /**
     * The Quantity Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Quantity")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer quantity = 0;
    /**
     * The Grosstradeamt Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("GrossTradeAmt")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer grossTradeAmt = 0;
    /**
     * The Tradeinputsource Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeInputSource")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String tradeInputSource = "";
    /**
     * The Accruedinterestrate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AccruedInterestRate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Double accruedInterestRate = 0.0D;
    /**
     * The Refallocid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("RefAllocID")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String refAllocID = "";
    /**
     * The Side Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Side")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String side = "";
    /**
     * The Tradingsessionid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradingSessionID")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String tradingSessionID = "";
    /**
     * The Avgparpx Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AvgParPx")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Double avgParPx = 0.0D;
    /**
     * The Settldate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SettlDate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String settlDate = "";
    /**
     * The Execallocgrp Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("ExecAllocGrp")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private ExecAllocGrp execAllocGrp;
    /**
     * The Ordallocgrp Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OrdAllocGrp")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private List<OrdAllocGrp> ordAllocGrp = new ArrayList<OrdAllocGrp>();
    /**
     * The Instrument Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Instrument")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Instrument instrument;
    /**
     * The Yielddata Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("YieldData")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private YieldData yieldData;
    /**
     * The Quote Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Quote")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Quote quote;
    /**
     * The Tradecapturereport Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeCaptureReport")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private TradeCaptureReport tradeCaptureReport;
    /**
     * The Userdefinedtags Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("UserDefinedTags")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private UserDefinedTags userDefinedTags;
    /**
     * The Ampfields Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AMPFields")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private AMPFields aMPFields;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Tradedate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeDate")
    public String getTradeDate() {
        return tradeDate;
    }

    /**
     * The Tradedate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeDate")
    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public TradeExample withTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    /**
     * The Transacttime Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TransactTime")
    public String getTransactTime() {
        return transactTime;
    }

    /**
     * The Transacttime Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TransactTime")
    public void setTransactTime(String transactTime) {
        this.transactTime = transactTime;
    }

    public TradeExample withTransactTime(String transactTime) {
        this.transactTime = transactTime;
        return this;
    }

    /**
     * The Avgpx Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AvgPx")
    public Integer getAvgPx() {
        return avgPx;
    }

    /**
     * The Avgpx Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AvgPx")
    public void setAvgPx(Integer avgPx) {
        this.avgPx = avgPx;
    }

    public TradeExample withAvgPx(Integer avgPx) {
        this.avgPx = avgPx;
        return this;
    }

    /**
     * The Quantity Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Quantity")
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * The Quantity Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public TradeExample withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The Grosstradeamt Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("GrossTradeAmt")
    public Integer getGrossTradeAmt() {
        return grossTradeAmt;
    }

    /**
     * The Grosstradeamt Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("GrossTradeAmt")
    public void setGrossTradeAmt(Integer grossTradeAmt) {
        this.grossTradeAmt = grossTradeAmt;
    }

    public TradeExample withGrossTradeAmt(Integer grossTradeAmt) {
        this.grossTradeAmt = grossTradeAmt;
        return this;
    }

    /**
     * The Tradeinputsource Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeInputSource")
    public String getTradeInputSource() {
        return tradeInputSource;
    }

    /**
     * The Tradeinputsource Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeInputSource")
    public void setTradeInputSource(String tradeInputSource) {
        this.tradeInputSource = tradeInputSource;
    }

    public TradeExample withTradeInputSource(String tradeInputSource) {
        this.tradeInputSource = tradeInputSource;
        return this;
    }

    /**
     * The Accruedinterestrate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AccruedInterestRate")
    public Double getAccruedInterestRate() {
        return accruedInterestRate;
    }

    /**
     * The Accruedinterestrate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AccruedInterestRate")
    public void setAccruedInterestRate(Double accruedInterestRate) {
        this.accruedInterestRate = accruedInterestRate;
    }

    public TradeExample withAccruedInterestRate(Double accruedInterestRate) {
        this.accruedInterestRate = accruedInterestRate;
        return this;
    }

    /**
     * The Refallocid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("RefAllocID")
    public String getRefAllocID() {
        return refAllocID;
    }

    /**
     * The Refallocid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("RefAllocID")
    public void setRefAllocID(String refAllocID) {
        this.refAllocID = refAllocID;
    }

    public TradeExample withRefAllocID(String refAllocID) {
        this.refAllocID = refAllocID;
        return this;
    }

    /**
     * The Side Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Side")
    public String getSide() {
        return side;
    }

    /**
     * The Side Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Side")
    public void setSide(String side) {
        this.side = side;
    }

    public TradeExample withSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * The Tradingsessionid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradingSessionID")
    public String getTradingSessionID() {
        return tradingSessionID;
    }

    /**
     * The Tradingsessionid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradingSessionID")
    public void setTradingSessionID(String tradingSessionID) {
        this.tradingSessionID = tradingSessionID;
    }

    public TradeExample withTradingSessionID(String tradingSessionID) {
        this.tradingSessionID = tradingSessionID;
        return this;
    }

    /**
     * The Avgparpx Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AvgParPx")
    public Double getAvgParPx() {
        return avgParPx;
    }

    /**
     * The Avgparpx Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AvgParPx")
    public void setAvgParPx(Double avgParPx) {
        this.avgParPx = avgParPx;
    }

    public TradeExample withAvgParPx(Double avgParPx) {
        this.avgParPx = avgParPx;
        return this;
    }

    /**
     * The Settldate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SettlDate")
    public String getSettlDate() {
        return settlDate;
    }

    /**
     * The Settldate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SettlDate")
    public void setSettlDate(String settlDate) {
        this.settlDate = settlDate;
    }

    public TradeExample withSettlDate(String settlDate) {
        this.settlDate = settlDate;
        return this;
    }

    /**
     * The Execallocgrp Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("ExecAllocGrp")
    public ExecAllocGrp getExecAllocGrp() {
        return execAllocGrp;
    }

    /**
     * The Execallocgrp Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("ExecAllocGrp")
    public void setExecAllocGrp(ExecAllocGrp execAllocGrp) {
        this.execAllocGrp = execAllocGrp;
    }

    public TradeExample withExecAllocGrp(ExecAllocGrp execAllocGrp) {
        this.execAllocGrp = execAllocGrp;
        return this;
    }

    /**
     * The Ordallocgrp Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OrdAllocGrp")
    public List<OrdAllocGrp> getOrdAllocGrp() {
        return ordAllocGrp;
    }

    /**
     * The Ordallocgrp Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OrdAllocGrp")
    public void setOrdAllocGrp(List<OrdAllocGrp> ordAllocGrp) {
        this.ordAllocGrp = ordAllocGrp;
    }

    public TradeExample withOrdAllocGrp(List<OrdAllocGrp> ordAllocGrp) {
        this.ordAllocGrp = ordAllocGrp;
        return this;
    }

    /**
     * The Instrument Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Instrument")
    public Instrument getInstrument() {
        return instrument;
    }

    /**
     * The Instrument Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Instrument")
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public TradeExample withInstrument(Instrument instrument) {
        this.instrument = instrument;
        return this;
    }

    /**
     * The Yielddata Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("YieldData")
    public YieldData getYieldData() {
        return yieldData;
    }

    /**
     * The Yielddata Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("YieldData")
    public void setYieldData(YieldData yieldData) {
        this.yieldData = yieldData;
    }

    public TradeExample withYieldData(YieldData yieldData) {
        this.yieldData = yieldData;
        return this;
    }

    /**
     * The Quote Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Quote")
    public Quote getQuote() {
        return quote;
    }

    /**
     * The Quote Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Quote")
    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public TradeExample withQuote(Quote quote) {
        this.quote = quote;
        return this;
    }

    /**
     * The Tradecapturereport Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeCaptureReport")
    public TradeCaptureReport getTradeCaptureReport() {
        return tradeCaptureReport;
    }

    /**
     * The Tradecapturereport Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeCaptureReport")
    public void setTradeCaptureReport(TradeCaptureReport tradeCaptureReport) {
        this.tradeCaptureReport = tradeCaptureReport;
    }

    public TradeExample withTradeCaptureReport(TradeCaptureReport tradeCaptureReport) {
        this.tradeCaptureReport = tradeCaptureReport;
        return this;
    }

    /**
     * The Userdefinedtags Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("UserDefinedTags")
    public UserDefinedTags getUserDefinedTags() {
        return userDefinedTags;
    }

    /**
     * The Userdefinedtags Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("UserDefinedTags")
    public void setUserDefinedTags(UserDefinedTags userDefinedTags) {
        this.userDefinedTags = userDefinedTags;
    }

    public TradeExample withUserDefinedTags(UserDefinedTags userDefinedTags) {
        this.userDefinedTags = userDefinedTags;
        return this;
    }

    /**
     * The Ampfields Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AMPFields")
    public AMPFields getAMPFields() {
        return aMPFields;
    }

    /**
     * The Ampfields Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AMPFields")
    public void setAMPFields(AMPFields aMPFields) {
        this.aMPFields = aMPFields;
    }

    public TradeExample withAMPFields(AMPFields aMPFields) {
        this.aMPFields = aMPFields;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TradeExample withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tradeDate).append(transactTime).append(avgPx).append(quantity).append(grossTradeAmt).append(tradeInputSource).append(accruedInterestRate).append(refAllocID).append(side).append(tradingSessionID).append(avgParPx).append(settlDate).append(execAllocGrp).append(ordAllocGrp).append(instrument).append(yieldData).append(quote).append(tradeCaptureReport).append(userDefinedTags).append(aMPFields).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradeExample) == false) {
            return false;
        }
        TradeExample rhs = ((TradeExample) other);
        return new EqualsBuilder().append(tradeDate, rhs.tradeDate).append(transactTime, rhs.transactTime).append(avgPx, rhs.avgPx).append(quantity, rhs.quantity).append(grossTradeAmt, rhs.grossTradeAmt).append(tradeInputSource, rhs.tradeInputSource).append(accruedInterestRate, rhs.accruedInterestRate).append(refAllocID, rhs.refAllocID).append(side, rhs.side).append(tradingSessionID, rhs.tradingSessionID).append(avgParPx, rhs.avgParPx).append(settlDate, rhs.settlDate).append(execAllocGrp, rhs.execAllocGrp).append(ordAllocGrp, rhs.ordAllocGrp).append(instrument, rhs.instrument).append(yieldData, rhs.yieldData).append(quote, rhs.quote).append(tradeCaptureReport, rhs.tradeCaptureReport).append(userDefinedTags, rhs.userDefinedTags).append(aMPFields, rhs.aMPFields).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
