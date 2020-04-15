
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
 * The Statics Schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "buyorderid.speedIndex",
    "sellorderid.speedIndex",
    "secboardId.securityIdType",
    "secboardId.speedIndex",
    "value.decimals",
    "settlementValue.value",
    "settlementValue.decimals",
    "details.yield.decimals",
    "details.buyCharge1",
    "details.sellCharge1",
    "details.buyCharge2",
    "details.sellCharge2",
    "accruedInterest.decimals",
    "underlyingPrice.value",
    "underlyingPrice.decimals",
    "buyStrategyOrderId.orderDate",
    "buyStrategyOrderId.ordeNo",
    "buyStrategyOrderId.orderNoSuffix",
    "buyStrategyOrderId.speedIndex",
    "sellStrategyOrderId.orderDate",
    "sellStrategyOrderId.ordeNo",
    "sellStrategyOrderId.orderNoSuffix",
    "sellStrategyOrderId.speedIndex",
    "originalTradeId.TradeId",
    "originalTradeId.TradeDate",
    "originalTradeId.tradeNoSuffix",
    "tradeConditions***",
    "siteSpecific***",
    "repoAssociatedTradeid.tradeNoSuffix",
    "baseCurrValue.decimals",
    "buyPositionType",
    "sellPositionType",
    "secondaryPrice.decimals",
    "repoPrice.decimals"
})
public class Statics {

    /**
     * The Buyorderid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyorderid.speedIndex")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer buyorderidSpeedIndex = 0;
    /**
     * The Sellorderid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellorderid.speedIndex")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer sellorderidSpeedIndex = 0;
    /**
     * The Secboardid.securityidtype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("secboardId.securityIdType")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String secboardIdSecurityIdType = "";
    /**
     * The Secboardid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("secboardId.speedIndex")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer secboardIdSpeedIndex = 0;
    /**
     * The Value.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("value.decimals")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer valueDecimals = 0;
    /**
     * The Settlementvalue.value Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("settlementValue.value")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Double settlementValueValue = 0.0D;
    /**
     * The Settlementvalue.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("settlementValue.decimals")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer settlementValueDecimals = 0;
    /**
     * The Details.yield.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.yield.decimals")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer detailsYieldDecimals = 0;
    /**
     * The Details.buycharge1 Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.buyCharge1")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String detailsBuyCharge1 = "";
    /**
     * The Details.sellcharge1 Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.sellCharge1")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String detailsSellCharge1 = "";
    /**
     * The Details.buycharge2 Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.buyCharge2")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String detailsBuyCharge2 = "";
    /**
     * The Details.sellcharge2 Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.sellCharge2")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String detailsSellCharge2 = "";
    /**
     * The Accruedinterest.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("accruedInterest.decimals")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer accruedInterestDecimals = 0;
    /**
     * The Underlyingprice.value Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("underlyingPrice.value")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Double underlyingPriceValue = 0.0D;
    /**
     * The Underlyingprice.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("underlyingPrice.decimals")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer underlyingPriceDecimals = 0;
    /**
     * The Buystrategyorderid.orderdate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyOrderId.orderDate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String buyStrategyOrderIdOrderDate = "";
    /**
     * The Buystrategyorderid.ordeno Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyOrderId.ordeNo")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer buyStrategyOrderIdOrdeNo = 0;
    /**
     * The Buystrategyorderid.ordernosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyOrderId.orderNoSuffix")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer buyStrategyOrderIdOrderNoSuffix = 0;
    /**
     * The Buystrategyorderid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyOrderId.speedIndex")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer buyStrategyOrderIdSpeedIndex = 0;
    /**
     * The Sellstrategyorderid.orderdate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyOrderId.orderDate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String sellStrategyOrderIdOrderDate = "";
    /**
     * The Sellstrategyorderid.ordeno Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyOrderId.ordeNo")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer sellStrategyOrderIdOrdeNo = 0;
    /**
     * The Sellstrategyorderid.ordernosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyOrderId.orderNoSuffix")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer sellStrategyOrderIdOrderNoSuffix = 0;
    /**
     * The Sellstrategyorderid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyOrderId.speedIndex")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer sellStrategyOrderIdSpeedIndex = 0;
    /**
     * The Originaltradeid.tradeid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("originalTradeId.TradeId")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer originalTradeIdTradeId = 0;
    /**
     * The Originaltradeid.tradedate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("originalTradeId.TradeDate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String originalTradeIdTradeDate = "";
    /**
     * The Originaltradeid.tradenosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("originalTradeId.tradeNoSuffix")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer originalTradeIdTradeNoSuffix = 0;
    /**
     * The Tradeconditions*** Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("tradeConditions***")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String tradeConditions = "";
    /**
     * The Sitespecific*** Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("siteSpecific***")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String siteSpecific = "";
    /**
     * The Repoassociatedtradeid.tradenosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("repoAssociatedTradeid.tradeNoSuffix")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer repoAssociatedTradeidTradeNoSuffix = 0;
    /**
     * The Basecurrvalue.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("baseCurrValue.decimals")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer baseCurrValueDecimals = 0;
    /**
     * The Buypositiontype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyPositionType")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String buyPositionType = "";
    /**
     * The Sellpositiontype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellPositionType")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String sellPositionType = "";
    /**
     * The Secondaryprice.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("secondaryPrice.decimals")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String secondaryPriceDecimals = "";
    /**
     * The Repoprice.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("repoPrice.decimals")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer repoPriceDecimals = 0;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Buyorderid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyorderid.speedIndex")
    public Integer getBuyorderidSpeedIndex() {
        return buyorderidSpeedIndex;
    }

    /**
     * The Buyorderid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyorderid.speedIndex")
    public void setBuyorderidSpeedIndex(Integer buyorderidSpeedIndex) {
        this.buyorderidSpeedIndex = buyorderidSpeedIndex;
    }

    public Statics withBuyorderidSpeedIndex(Integer buyorderidSpeedIndex) {
        this.buyorderidSpeedIndex = buyorderidSpeedIndex;
        return this;
    }

    /**
     * The Sellorderid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellorderid.speedIndex")
    public Integer getSellorderidSpeedIndex() {
        return sellorderidSpeedIndex;
    }

    /**
     * The Sellorderid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellorderid.speedIndex")
    public void setSellorderidSpeedIndex(Integer sellorderidSpeedIndex) {
        this.sellorderidSpeedIndex = sellorderidSpeedIndex;
    }

    public Statics withSellorderidSpeedIndex(Integer sellorderidSpeedIndex) {
        this.sellorderidSpeedIndex = sellorderidSpeedIndex;
        return this;
    }

    /**
     * The Secboardid.securityidtype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("secboardId.securityIdType")
    public String getSecboardIdSecurityIdType() {
        return secboardIdSecurityIdType;
    }

    /**
     * The Secboardid.securityidtype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("secboardId.securityIdType")
    public void setSecboardIdSecurityIdType(String secboardIdSecurityIdType) {
        this.secboardIdSecurityIdType = secboardIdSecurityIdType;
    }

    public Statics withSecboardIdSecurityIdType(String secboardIdSecurityIdType) {
        this.secboardIdSecurityIdType = secboardIdSecurityIdType;
        return this;
    }

    /**
     * The Secboardid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("secboardId.speedIndex")
    public Integer getSecboardIdSpeedIndex() {
        return secboardIdSpeedIndex;
    }

    /**
     * The Secboardid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("secboardId.speedIndex")
    public void setSecboardIdSpeedIndex(Integer secboardIdSpeedIndex) {
        this.secboardIdSpeedIndex = secboardIdSpeedIndex;
    }

    public Statics withSecboardIdSpeedIndex(Integer secboardIdSpeedIndex) {
        this.secboardIdSpeedIndex = secboardIdSpeedIndex;
        return this;
    }

    /**
     * The Value.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("value.decimals")
    public Integer getValueDecimals() {
        return valueDecimals;
    }

    /**
     * The Value.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("value.decimals")
    public void setValueDecimals(Integer valueDecimals) {
        this.valueDecimals = valueDecimals;
    }

    public Statics withValueDecimals(Integer valueDecimals) {
        this.valueDecimals = valueDecimals;
        return this;
    }

    /**
     * The Settlementvalue.value Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("settlementValue.value")
    public Double getSettlementValueValue() {
        return settlementValueValue;
    }

    /**
     * The Settlementvalue.value Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("settlementValue.value")
    public void setSettlementValueValue(Double settlementValueValue) {
        this.settlementValueValue = settlementValueValue;
    }

    public Statics withSettlementValueValue(Double settlementValueValue) {
        this.settlementValueValue = settlementValueValue;
        return this;
    }

    /**
     * The Settlementvalue.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("settlementValue.decimals")
    public Integer getSettlementValueDecimals() {
        return settlementValueDecimals;
    }

    /**
     * The Settlementvalue.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("settlementValue.decimals")
    public void setSettlementValueDecimals(Integer settlementValueDecimals) {
        this.settlementValueDecimals = settlementValueDecimals;
    }

    public Statics withSettlementValueDecimals(Integer settlementValueDecimals) {
        this.settlementValueDecimals = settlementValueDecimals;
        return this;
    }

    /**
     * The Details.yield.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.yield.decimals")
    public Integer getDetailsYieldDecimals() {
        return detailsYieldDecimals;
    }

    /**
     * The Details.yield.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.yield.decimals")
    public void setDetailsYieldDecimals(Integer detailsYieldDecimals) {
        this.detailsYieldDecimals = detailsYieldDecimals;
    }

    public Statics withDetailsYieldDecimals(Integer detailsYieldDecimals) {
        this.detailsYieldDecimals = detailsYieldDecimals;
        return this;
    }

    /**
     * The Details.buycharge1 Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.buyCharge1")
    public String getDetailsBuyCharge1() {
        return detailsBuyCharge1;
    }

    /**
     * The Details.buycharge1 Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.buyCharge1")
    public void setDetailsBuyCharge1(String detailsBuyCharge1) {
        this.detailsBuyCharge1 = detailsBuyCharge1;
    }

    public Statics withDetailsBuyCharge1(String detailsBuyCharge1) {
        this.detailsBuyCharge1 = detailsBuyCharge1;
        return this;
    }

    /**
     * The Details.sellcharge1 Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.sellCharge1")
    public String getDetailsSellCharge1() {
        return detailsSellCharge1;
    }

    /**
     * The Details.sellcharge1 Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.sellCharge1")
    public void setDetailsSellCharge1(String detailsSellCharge1) {
        this.detailsSellCharge1 = detailsSellCharge1;
    }

    public Statics withDetailsSellCharge1(String detailsSellCharge1) {
        this.detailsSellCharge1 = detailsSellCharge1;
        return this;
    }

    /**
     * The Details.buycharge2 Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.buyCharge2")
    public String getDetailsBuyCharge2() {
        return detailsBuyCharge2;
    }

    /**
     * The Details.buycharge2 Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.buyCharge2")
    public void setDetailsBuyCharge2(String detailsBuyCharge2) {
        this.detailsBuyCharge2 = detailsBuyCharge2;
    }

    public Statics withDetailsBuyCharge2(String detailsBuyCharge2) {
        this.detailsBuyCharge2 = detailsBuyCharge2;
        return this;
    }

    /**
     * The Details.sellcharge2 Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.sellCharge2")
    public String getDetailsSellCharge2() {
        return detailsSellCharge2;
    }

    /**
     * The Details.sellcharge2 Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("details.sellCharge2")
    public void setDetailsSellCharge2(String detailsSellCharge2) {
        this.detailsSellCharge2 = detailsSellCharge2;
    }

    public Statics withDetailsSellCharge2(String detailsSellCharge2) {
        this.detailsSellCharge2 = detailsSellCharge2;
        return this;
    }

    /**
     * The Accruedinterest.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("accruedInterest.decimals")
    public Integer getAccruedInterestDecimals() {
        return accruedInterestDecimals;
    }

    /**
     * The Accruedinterest.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("accruedInterest.decimals")
    public void setAccruedInterestDecimals(Integer accruedInterestDecimals) {
        this.accruedInterestDecimals = accruedInterestDecimals;
    }

    public Statics withAccruedInterestDecimals(Integer accruedInterestDecimals) {
        this.accruedInterestDecimals = accruedInterestDecimals;
        return this;
    }

    /**
     * The Underlyingprice.value Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("underlyingPrice.value")
    public Double getUnderlyingPriceValue() {
        return underlyingPriceValue;
    }

    /**
     * The Underlyingprice.value Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("underlyingPrice.value")
    public void setUnderlyingPriceValue(Double underlyingPriceValue) {
        this.underlyingPriceValue = underlyingPriceValue;
    }

    public Statics withUnderlyingPriceValue(Double underlyingPriceValue) {
        this.underlyingPriceValue = underlyingPriceValue;
        return this;
    }

    /**
     * The Underlyingprice.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("underlyingPrice.decimals")
    public Integer getUnderlyingPriceDecimals() {
        return underlyingPriceDecimals;
    }

    /**
     * The Underlyingprice.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("underlyingPrice.decimals")
    public void setUnderlyingPriceDecimals(Integer underlyingPriceDecimals) {
        this.underlyingPriceDecimals = underlyingPriceDecimals;
    }

    public Statics withUnderlyingPriceDecimals(Integer underlyingPriceDecimals) {
        this.underlyingPriceDecimals = underlyingPriceDecimals;
        return this;
    }

    /**
     * The Buystrategyorderid.orderdate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyOrderId.orderDate")
    public String getBuyStrategyOrderIdOrderDate() {
        return buyStrategyOrderIdOrderDate;
    }

    /**
     * The Buystrategyorderid.orderdate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyOrderId.orderDate")
    public void setBuyStrategyOrderIdOrderDate(String buyStrategyOrderIdOrderDate) {
        this.buyStrategyOrderIdOrderDate = buyStrategyOrderIdOrderDate;
    }

    public Statics withBuyStrategyOrderIdOrderDate(String buyStrategyOrderIdOrderDate) {
        this.buyStrategyOrderIdOrderDate = buyStrategyOrderIdOrderDate;
        return this;
    }

    /**
     * The Buystrategyorderid.ordeno Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyOrderId.ordeNo")
    public Integer getBuyStrategyOrderIdOrdeNo() {
        return buyStrategyOrderIdOrdeNo;
    }

    /**
     * The Buystrategyorderid.ordeno Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyOrderId.ordeNo")
    public void setBuyStrategyOrderIdOrdeNo(Integer buyStrategyOrderIdOrdeNo) {
        this.buyStrategyOrderIdOrdeNo = buyStrategyOrderIdOrdeNo;
    }

    public Statics withBuyStrategyOrderIdOrdeNo(Integer buyStrategyOrderIdOrdeNo) {
        this.buyStrategyOrderIdOrdeNo = buyStrategyOrderIdOrdeNo;
        return this;
    }

    /**
     * The Buystrategyorderid.ordernosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyOrderId.orderNoSuffix")
    public Integer getBuyStrategyOrderIdOrderNoSuffix() {
        return buyStrategyOrderIdOrderNoSuffix;
    }

    /**
     * The Buystrategyorderid.ordernosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyOrderId.orderNoSuffix")
    public void setBuyStrategyOrderIdOrderNoSuffix(Integer buyStrategyOrderIdOrderNoSuffix) {
        this.buyStrategyOrderIdOrderNoSuffix = buyStrategyOrderIdOrderNoSuffix;
    }

    public Statics withBuyStrategyOrderIdOrderNoSuffix(Integer buyStrategyOrderIdOrderNoSuffix) {
        this.buyStrategyOrderIdOrderNoSuffix = buyStrategyOrderIdOrderNoSuffix;
        return this;
    }

    /**
     * The Buystrategyorderid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyOrderId.speedIndex")
    public Integer getBuyStrategyOrderIdSpeedIndex() {
        return buyStrategyOrderIdSpeedIndex;
    }

    /**
     * The Buystrategyorderid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyOrderId.speedIndex")
    public void setBuyStrategyOrderIdSpeedIndex(Integer buyStrategyOrderIdSpeedIndex) {
        this.buyStrategyOrderIdSpeedIndex = buyStrategyOrderIdSpeedIndex;
    }

    public Statics withBuyStrategyOrderIdSpeedIndex(Integer buyStrategyOrderIdSpeedIndex) {
        this.buyStrategyOrderIdSpeedIndex = buyStrategyOrderIdSpeedIndex;
        return this;
    }

    /**
     * The Sellstrategyorderid.orderdate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyOrderId.orderDate")
    public String getSellStrategyOrderIdOrderDate() {
        return sellStrategyOrderIdOrderDate;
    }

    /**
     * The Sellstrategyorderid.orderdate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyOrderId.orderDate")
    public void setSellStrategyOrderIdOrderDate(String sellStrategyOrderIdOrderDate) {
        this.sellStrategyOrderIdOrderDate = sellStrategyOrderIdOrderDate;
    }

    public Statics withSellStrategyOrderIdOrderDate(String sellStrategyOrderIdOrderDate) {
        this.sellStrategyOrderIdOrderDate = sellStrategyOrderIdOrderDate;
        return this;
    }

    /**
     * The Sellstrategyorderid.ordeno Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyOrderId.ordeNo")
    public Integer getSellStrategyOrderIdOrdeNo() {
        return sellStrategyOrderIdOrdeNo;
    }

    /**
     * The Sellstrategyorderid.ordeno Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyOrderId.ordeNo")
    public void setSellStrategyOrderIdOrdeNo(Integer sellStrategyOrderIdOrdeNo) {
        this.sellStrategyOrderIdOrdeNo = sellStrategyOrderIdOrdeNo;
    }

    public Statics withSellStrategyOrderIdOrdeNo(Integer sellStrategyOrderIdOrdeNo) {
        this.sellStrategyOrderIdOrdeNo = sellStrategyOrderIdOrdeNo;
        return this;
    }

    /**
     * The Sellstrategyorderid.ordernosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyOrderId.orderNoSuffix")
    public Integer getSellStrategyOrderIdOrderNoSuffix() {
        return sellStrategyOrderIdOrderNoSuffix;
    }

    /**
     * The Sellstrategyorderid.ordernosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyOrderId.orderNoSuffix")
    public void setSellStrategyOrderIdOrderNoSuffix(Integer sellStrategyOrderIdOrderNoSuffix) {
        this.sellStrategyOrderIdOrderNoSuffix = sellStrategyOrderIdOrderNoSuffix;
    }

    public Statics withSellStrategyOrderIdOrderNoSuffix(Integer sellStrategyOrderIdOrderNoSuffix) {
        this.sellStrategyOrderIdOrderNoSuffix = sellStrategyOrderIdOrderNoSuffix;
        return this;
    }

    /**
     * The Sellstrategyorderid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyOrderId.speedIndex")
    public Integer getSellStrategyOrderIdSpeedIndex() {
        return sellStrategyOrderIdSpeedIndex;
    }

    /**
     * The Sellstrategyorderid.speedindex Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyOrderId.speedIndex")
    public void setSellStrategyOrderIdSpeedIndex(Integer sellStrategyOrderIdSpeedIndex) {
        this.sellStrategyOrderIdSpeedIndex = sellStrategyOrderIdSpeedIndex;
    }

    public Statics withSellStrategyOrderIdSpeedIndex(Integer sellStrategyOrderIdSpeedIndex) {
        this.sellStrategyOrderIdSpeedIndex = sellStrategyOrderIdSpeedIndex;
        return this;
    }

    /**
     * The Originaltradeid.tradeid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("originalTradeId.TradeId")
    public Integer getOriginalTradeIdTradeId() {
        return originalTradeIdTradeId;
    }

    /**
     * The Originaltradeid.tradeid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("originalTradeId.TradeId")
    public void setOriginalTradeIdTradeId(Integer originalTradeIdTradeId) {
        this.originalTradeIdTradeId = originalTradeIdTradeId;
    }

    public Statics withOriginalTradeIdTradeId(Integer originalTradeIdTradeId) {
        this.originalTradeIdTradeId = originalTradeIdTradeId;
        return this;
    }

    /**
     * The Originaltradeid.tradedate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("originalTradeId.TradeDate")
    public String getOriginalTradeIdTradeDate() {
        return originalTradeIdTradeDate;
    }

    /**
     * The Originaltradeid.tradedate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("originalTradeId.TradeDate")
    public void setOriginalTradeIdTradeDate(String originalTradeIdTradeDate) {
        this.originalTradeIdTradeDate = originalTradeIdTradeDate;
    }

    public Statics withOriginalTradeIdTradeDate(String originalTradeIdTradeDate) {
        this.originalTradeIdTradeDate = originalTradeIdTradeDate;
        return this;
    }

    /**
     * The Originaltradeid.tradenosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("originalTradeId.tradeNoSuffix")
    public Integer getOriginalTradeIdTradeNoSuffix() {
        return originalTradeIdTradeNoSuffix;
    }

    /**
     * The Originaltradeid.tradenosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("originalTradeId.tradeNoSuffix")
    public void setOriginalTradeIdTradeNoSuffix(Integer originalTradeIdTradeNoSuffix) {
        this.originalTradeIdTradeNoSuffix = originalTradeIdTradeNoSuffix;
    }

    public Statics withOriginalTradeIdTradeNoSuffix(Integer originalTradeIdTradeNoSuffix) {
        this.originalTradeIdTradeNoSuffix = originalTradeIdTradeNoSuffix;
        return this;
    }

    /**
     * The Tradeconditions*** Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("tradeConditions***")
    public String getTradeConditions() {
        return tradeConditions;
    }

    /**
     * The Tradeconditions*** Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("tradeConditions***")
    public void setTradeConditions(String tradeConditions) {
        this.tradeConditions = tradeConditions;
    }

    public Statics withTradeConditions(String tradeConditions) {
        this.tradeConditions = tradeConditions;
        return this;
    }

    /**
     * The Sitespecific*** Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("siteSpecific***")
    public String getSiteSpecific() {
        return siteSpecific;
    }

    /**
     * The Sitespecific*** Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("siteSpecific***")
    public void setSiteSpecific(String siteSpecific) {
        this.siteSpecific = siteSpecific;
    }

    public Statics withSiteSpecific(String siteSpecific) {
        this.siteSpecific = siteSpecific;
        return this;
    }

    /**
     * The Repoassociatedtradeid.tradenosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("repoAssociatedTradeid.tradeNoSuffix")
    public Integer getRepoAssociatedTradeidTradeNoSuffix() {
        return repoAssociatedTradeidTradeNoSuffix;
    }

    /**
     * The Repoassociatedtradeid.tradenosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("repoAssociatedTradeid.tradeNoSuffix")
    public void setRepoAssociatedTradeidTradeNoSuffix(Integer repoAssociatedTradeidTradeNoSuffix) {
        this.repoAssociatedTradeidTradeNoSuffix = repoAssociatedTradeidTradeNoSuffix;
    }

    public Statics withRepoAssociatedTradeidTradeNoSuffix(Integer repoAssociatedTradeidTradeNoSuffix) {
        this.repoAssociatedTradeidTradeNoSuffix = repoAssociatedTradeidTradeNoSuffix;
        return this;
    }

    /**
     * The Basecurrvalue.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("baseCurrValue.decimals")
    public Integer getBaseCurrValueDecimals() {
        return baseCurrValueDecimals;
    }

    /**
     * The Basecurrvalue.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("baseCurrValue.decimals")
    public void setBaseCurrValueDecimals(Integer baseCurrValueDecimals) {
        this.baseCurrValueDecimals = baseCurrValueDecimals;
    }

    public Statics withBaseCurrValueDecimals(Integer baseCurrValueDecimals) {
        this.baseCurrValueDecimals = baseCurrValueDecimals;
        return this;
    }

    /**
     * The Buypositiontype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyPositionType")
    public String getBuyPositionType() {
        return buyPositionType;
    }

    /**
     * The Buypositiontype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyPositionType")
    public void setBuyPositionType(String buyPositionType) {
        this.buyPositionType = buyPositionType;
    }

    public Statics withBuyPositionType(String buyPositionType) {
        this.buyPositionType = buyPositionType;
        return this;
    }

    /**
     * The Sellpositiontype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellPositionType")
    public String getSellPositionType() {
        return sellPositionType;
    }

    /**
     * The Sellpositiontype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellPositionType")
    public void setSellPositionType(String sellPositionType) {
        this.sellPositionType = sellPositionType;
    }

    public Statics withSellPositionType(String sellPositionType) {
        this.sellPositionType = sellPositionType;
        return this;
    }

    /**
     * The Secondaryprice.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("secondaryPrice.decimals")
    public String getSecondaryPriceDecimals() {
        return secondaryPriceDecimals;
    }

    /**
     * The Secondaryprice.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("secondaryPrice.decimals")
    public void setSecondaryPriceDecimals(String secondaryPriceDecimals) {
        this.secondaryPriceDecimals = secondaryPriceDecimals;
    }

    public Statics withSecondaryPriceDecimals(String secondaryPriceDecimals) {
        this.secondaryPriceDecimals = secondaryPriceDecimals;
        return this;
    }

    /**
     * The Repoprice.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("repoPrice.decimals")
    public Integer getRepoPriceDecimals() {
        return repoPriceDecimals;
    }

    /**
     * The Repoprice.decimals Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("repoPrice.decimals")
    public void setRepoPriceDecimals(Integer repoPriceDecimals) {
        this.repoPriceDecimals = repoPriceDecimals;
    }

    public Statics withRepoPriceDecimals(Integer repoPriceDecimals) {
        this.repoPriceDecimals = repoPriceDecimals;
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

    public Statics withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(buyorderidSpeedIndex).append(sellorderidSpeedIndex).append(secboardIdSecurityIdType).append(secboardIdSpeedIndex).append(valueDecimals).append(settlementValueValue).append(settlementValueDecimals).append(detailsYieldDecimals).append(detailsBuyCharge1).append(detailsSellCharge1).append(detailsBuyCharge2).append(detailsSellCharge2).append(accruedInterestDecimals).append(underlyingPriceValue).append(underlyingPriceDecimals).append(buyStrategyOrderIdOrderDate).append(buyStrategyOrderIdOrdeNo).append(buyStrategyOrderIdOrderNoSuffix).append(buyStrategyOrderIdSpeedIndex).append(sellStrategyOrderIdOrderDate).append(sellStrategyOrderIdOrdeNo).append(sellStrategyOrderIdOrderNoSuffix).append(sellStrategyOrderIdSpeedIndex).append(originalTradeIdTradeId).append(originalTradeIdTradeDate).append(originalTradeIdTradeNoSuffix).append(tradeConditions).append(siteSpecific).append(repoAssociatedTradeidTradeNoSuffix).append(baseCurrValueDecimals).append(buyPositionType).append(sellPositionType).append(secondaryPriceDecimals).append(repoPriceDecimals).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Statics) == false) {
            return false;
        }
        Statics rhs = ((Statics) other);
        return new EqualsBuilder().append(buyorderidSpeedIndex, rhs.buyorderidSpeedIndex).append(sellorderidSpeedIndex, rhs.sellorderidSpeedIndex).append(secboardIdSecurityIdType, rhs.secboardIdSecurityIdType).append(secboardIdSpeedIndex, rhs.secboardIdSpeedIndex).append(valueDecimals, rhs.valueDecimals).append(settlementValueValue, rhs.settlementValueValue).append(settlementValueDecimals, rhs.settlementValueDecimals).append(detailsYieldDecimals, rhs.detailsYieldDecimals).append(detailsBuyCharge1, rhs.detailsBuyCharge1).append(detailsSellCharge1, rhs.detailsSellCharge1).append(detailsBuyCharge2, rhs.detailsBuyCharge2).append(detailsSellCharge2, rhs.detailsSellCharge2).append(accruedInterestDecimals, rhs.accruedInterestDecimals).append(underlyingPriceValue, rhs.underlyingPriceValue).append(underlyingPriceDecimals, rhs.underlyingPriceDecimals).append(buyStrategyOrderIdOrderDate, rhs.buyStrategyOrderIdOrderDate).append(buyStrategyOrderIdOrdeNo, rhs.buyStrategyOrderIdOrdeNo).append(buyStrategyOrderIdOrderNoSuffix, rhs.buyStrategyOrderIdOrderNoSuffix).append(buyStrategyOrderIdSpeedIndex, rhs.buyStrategyOrderIdSpeedIndex).append(sellStrategyOrderIdOrderDate, rhs.sellStrategyOrderIdOrderDate).append(sellStrategyOrderIdOrdeNo, rhs.sellStrategyOrderIdOrdeNo).append(sellStrategyOrderIdOrderNoSuffix, rhs.sellStrategyOrderIdOrderNoSuffix).append(sellStrategyOrderIdSpeedIndex, rhs.sellStrategyOrderIdSpeedIndex).append(originalTradeIdTradeId, rhs.originalTradeIdTradeId).append(originalTradeIdTradeDate, rhs.originalTradeIdTradeDate).append(originalTradeIdTradeNoSuffix, rhs.originalTradeIdTradeNoSuffix).append(tradeConditions, rhs.tradeConditions).append(siteSpecific, rhs.siteSpecific).append(repoAssociatedTradeidTradeNoSuffix, rhs.repoAssociatedTradeidTradeNoSuffix).append(baseCurrValueDecimals, rhs.baseCurrValueDecimals).append(buyPositionType, rhs.buyPositionType).append(sellPositionType, rhs.sellPositionType).append(secondaryPriceDecimals, rhs.secondaryPriceDecimals).append(repoPriceDecimals, rhs.repoPriceDecimals).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
