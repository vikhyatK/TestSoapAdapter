
package com.adapter.cppadapter.model;

import java.util.HashMap;
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
 * The Userdefinedtags Schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TradeTypeIndicator",
    "DaysToSettlement",
    "TradeSequence",
    "SecondaryTransactTime",
    "SettlCurrNetMoney",
    "BTDSPriceChangeCode",
    "ReportedPxDiff",
    "OriginatorType",
    "ExternalExchangeRef",
    "FMTradeStatus",
    "DisseminatedStatus",
    "AccountOriginType"
})
public class UserDefinedTags {

    /**
     * The Tradetypeindicator Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeTypeIndicator")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String tradeTypeIndicator = "";
    /**
     * The Daystosettlement Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("DaysToSettlement")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer daysToSettlement = 0;
    /**
     * The Tradesequence Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeSequence")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer tradeSequence = 0;
    /**
     * The Secondarytransacttime Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SecondaryTransactTime")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String secondaryTransactTime = "";
    /**
     * The Settlcurrnetmoney Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SettlCurrNetMoney")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Double settlCurrNetMoney = 0.0D;
    /**
     * The Btdspricechangecode Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("BTDSPriceChangeCode")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer bTDSPriceChangeCode = 0;
    /**
     * The Reportedpxdiff Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("ReportedPxDiff")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String reportedPxDiff = "";
    /**
     * The Originatortype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OriginatorType")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String originatorType = "";
    /**
     * The Externalexchangeref Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("ExternalExchangeRef")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String externalExchangeRef = "";
    /**
     * The Fmtradestatus Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("FMTradeStatus")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer fMTradeStatus = 0;
    /**
     * The Disseminatedstatus Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("DisseminatedStatus")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer disseminatedStatus = 0;
    /**
     * The Accountorigintype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AccountOriginType")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String accountOriginType = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Tradetypeindicator Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeTypeIndicator")
    public String getTradeTypeIndicator() {
        return tradeTypeIndicator;
    }

    /**
     * The Tradetypeindicator Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeTypeIndicator")
    public void setTradeTypeIndicator(String tradeTypeIndicator) {
        this.tradeTypeIndicator = tradeTypeIndicator;
    }

    public UserDefinedTags withTradeTypeIndicator(String tradeTypeIndicator) {
        this.tradeTypeIndicator = tradeTypeIndicator;
        return this;
    }

    /**
     * The Daystosettlement Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("DaysToSettlement")
    public Integer getDaysToSettlement() {
        return daysToSettlement;
    }

    /**
     * The Daystosettlement Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("DaysToSettlement")
    public void setDaysToSettlement(Integer daysToSettlement) {
        this.daysToSettlement = daysToSettlement;
    }

    public UserDefinedTags withDaysToSettlement(Integer daysToSettlement) {
        this.daysToSettlement = daysToSettlement;
        return this;
    }

    /**
     * The Tradesequence Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeSequence")
    public Integer getTradeSequence() {
        return tradeSequence;
    }

    /**
     * The Tradesequence Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("TradeSequence")
    public void setTradeSequence(Integer tradeSequence) {
        this.tradeSequence = tradeSequence;
    }

    public UserDefinedTags withTradeSequence(Integer tradeSequence) {
        this.tradeSequence = tradeSequence;
        return this;
    }

    /**
     * The Secondarytransacttime Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SecondaryTransactTime")
    public String getSecondaryTransactTime() {
        return secondaryTransactTime;
    }

    /**
     * The Secondarytransacttime Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SecondaryTransactTime")
    public void setSecondaryTransactTime(String secondaryTransactTime) {
        this.secondaryTransactTime = secondaryTransactTime;
    }

    public UserDefinedTags withSecondaryTransactTime(String secondaryTransactTime) {
        this.secondaryTransactTime = secondaryTransactTime;
        return this;
    }

    /**
     * The Settlcurrnetmoney Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SettlCurrNetMoney")
    public Double getSettlCurrNetMoney() {
        return settlCurrNetMoney;
    }

    /**
     * The Settlcurrnetmoney Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SettlCurrNetMoney")
    public void setSettlCurrNetMoney(Double settlCurrNetMoney) {
        this.settlCurrNetMoney = settlCurrNetMoney;
    }

    public UserDefinedTags withSettlCurrNetMoney(Double settlCurrNetMoney) {
        this.settlCurrNetMoney = settlCurrNetMoney;
        return this;
    }

    /**
     * The Btdspricechangecode Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("BTDSPriceChangeCode")
    public Integer getBTDSPriceChangeCode() {
        return bTDSPriceChangeCode;
    }

    /**
     * The Btdspricechangecode Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("BTDSPriceChangeCode")
    public void setBTDSPriceChangeCode(Integer bTDSPriceChangeCode) {
        this.bTDSPriceChangeCode = bTDSPriceChangeCode;
    }

    public UserDefinedTags withBTDSPriceChangeCode(Integer bTDSPriceChangeCode) {
        this.bTDSPriceChangeCode = bTDSPriceChangeCode;
        return this;
    }

    /**
     * The Reportedpxdiff Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("ReportedPxDiff")
    public String getReportedPxDiff() {
        return reportedPxDiff;
    }

    /**
     * The Reportedpxdiff Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("ReportedPxDiff")
    public void setReportedPxDiff(String reportedPxDiff) {
        this.reportedPxDiff = reportedPxDiff;
    }

    public UserDefinedTags withReportedPxDiff(String reportedPxDiff) {
        this.reportedPxDiff = reportedPxDiff;
        return this;
    }

    /**
     * The Originatortype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OriginatorType")
    public String getOriginatorType() {
        return originatorType;
    }

    /**
     * The Originatortype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OriginatorType")
    public void setOriginatorType(String originatorType) {
        this.originatorType = originatorType;
    }

    public UserDefinedTags withOriginatorType(String originatorType) {
        this.originatorType = originatorType;
        return this;
    }

    /**
     * The Externalexchangeref Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("ExternalExchangeRef")
    public String getExternalExchangeRef() {
        return externalExchangeRef;
    }

    /**
     * The Externalexchangeref Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("ExternalExchangeRef")
    public void setExternalExchangeRef(String externalExchangeRef) {
        this.externalExchangeRef = externalExchangeRef;
    }

    public UserDefinedTags withExternalExchangeRef(String externalExchangeRef) {
        this.externalExchangeRef = externalExchangeRef;
        return this;
    }

    /**
     * The Fmtradestatus Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("FMTradeStatus")
    public Integer getFMTradeStatus() {
        return fMTradeStatus;
    }

    /**
     * The Fmtradestatus Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("FMTradeStatus")
    public void setFMTradeStatus(Integer fMTradeStatus) {
        this.fMTradeStatus = fMTradeStatus;
    }

    public UserDefinedTags withFMTradeStatus(Integer fMTradeStatus) {
        this.fMTradeStatus = fMTradeStatus;
        return this;
    }

    /**
     * The Disseminatedstatus Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("DisseminatedStatus")
    public Integer getDisseminatedStatus() {
        return disseminatedStatus;
    }

    /**
     * The Disseminatedstatus Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("DisseminatedStatus")
    public void setDisseminatedStatus(Integer disseminatedStatus) {
        this.disseminatedStatus = disseminatedStatus;
    }

    public UserDefinedTags withDisseminatedStatus(Integer disseminatedStatus) {
        this.disseminatedStatus = disseminatedStatus;
        return this;
    }

    /**
     * The Accountorigintype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AccountOriginType")
    public String getAccountOriginType() {
        return accountOriginType;
    }

    /**
     * The Accountorigintype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("AccountOriginType")
    public void setAccountOriginType(String accountOriginType) {
        this.accountOriginType = accountOriginType;
    }

    public UserDefinedTags withAccountOriginType(String accountOriginType) {
        this.accountOriginType = accountOriginType;
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

    public UserDefinedTags withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tradeTypeIndicator).append(daysToSettlement).append(tradeSequence).append(secondaryTransactTime).append(settlCurrNetMoney).append(bTDSPriceChangeCode).append(reportedPxDiff).append(originatorType).append(externalExchangeRef).append(fMTradeStatus).append(disseminatedStatus).append(accountOriginType).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserDefinedTags) == false) {
            return false;
        }
        UserDefinedTags rhs = ((UserDefinedTags) other);
        return new EqualsBuilder().append(tradeTypeIndicator, rhs.tradeTypeIndicator).append(daysToSettlement, rhs.daysToSettlement).append(tradeSequence, rhs.tradeSequence).append(secondaryTransactTime, rhs.secondaryTransactTime).append(settlCurrNetMoney, rhs.settlCurrNetMoney).append(bTDSPriceChangeCode, rhs.bTDSPriceChangeCode).append(reportedPxDiff, rhs.reportedPxDiff).append(originatorType, rhs.originatorType).append(externalExchangeRef, rhs.externalExchangeRef).append(fMTradeStatus, rhs.fMTradeStatus).append(disseminatedStatus, rhs.disseminatedStatus).append(accountOriginType, rhs.accountOriginType).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
