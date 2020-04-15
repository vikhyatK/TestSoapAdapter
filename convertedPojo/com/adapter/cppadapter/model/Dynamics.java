
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
 * The Dynamics Schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mktPriceData",
    "buyStrategyTradeId.tradeNo",
    "buyStrategyTradeId.tradeNoSuffix",
    "buyStrategyTradeId.tradeDate",
    "sellStrategyTradeId.tradeNo",
    "sellStrategyTradeId.tradeNoSuffix",
    "sellStrategyTradeId.tradeDate",
    "disseminationTime"
})
public class Dynamics {

    /**
     * The Mktpricedata Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("mktPriceData")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String mktPriceData = "";
    /**
     * The Buystrategytradeid.tradeno Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyTradeId.tradeNo")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer buyStrategyTradeIdTradeNo = 0;
    /**
     * The Buystrategytradeid.tradenosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyTradeId.tradeNoSuffix")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer buyStrategyTradeIdTradeNoSuffix = 0;
    /**
     * The Buystrategytradeid.tradedate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyTradeId.tradeDate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String buyStrategyTradeIdTradeDate = "";
    /**
     * The Sellstrategytradeid.tradeno Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyTradeId.tradeNo")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer sellStrategyTradeIdTradeNo = 0;
    /**
     * The Sellstrategytradeid.tradenosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyTradeId.tradeNoSuffix")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer sellStrategyTradeIdTradeNoSuffix = 0;
    /**
     * The Sellstrategytradeid.tradedate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyTradeId.tradeDate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer sellStrategyTradeIdTradeDate = 0;
    /**
     * The Disseminationtime Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("disseminationTime")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String disseminationTime = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Mktpricedata Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("mktPriceData")
    public String getMktPriceData() {
        return mktPriceData;
    }

    /**
     * The Mktpricedata Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("mktPriceData")
    public void setMktPriceData(String mktPriceData) {
        this.mktPriceData = mktPriceData;
    }

    public Dynamics withMktPriceData(String mktPriceData) {
        this.mktPriceData = mktPriceData;
        return this;
    }

    /**
     * The Buystrategytradeid.tradeno Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyTradeId.tradeNo")
    public Integer getBuyStrategyTradeIdTradeNo() {
        return buyStrategyTradeIdTradeNo;
    }

    /**
     * The Buystrategytradeid.tradeno Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyTradeId.tradeNo")
    public void setBuyStrategyTradeIdTradeNo(Integer buyStrategyTradeIdTradeNo) {
        this.buyStrategyTradeIdTradeNo = buyStrategyTradeIdTradeNo;
    }

    public Dynamics withBuyStrategyTradeIdTradeNo(Integer buyStrategyTradeIdTradeNo) {
        this.buyStrategyTradeIdTradeNo = buyStrategyTradeIdTradeNo;
        return this;
    }

    /**
     * The Buystrategytradeid.tradenosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyTradeId.tradeNoSuffix")
    public Integer getBuyStrategyTradeIdTradeNoSuffix() {
        return buyStrategyTradeIdTradeNoSuffix;
    }

    /**
     * The Buystrategytradeid.tradenosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyTradeId.tradeNoSuffix")
    public void setBuyStrategyTradeIdTradeNoSuffix(Integer buyStrategyTradeIdTradeNoSuffix) {
        this.buyStrategyTradeIdTradeNoSuffix = buyStrategyTradeIdTradeNoSuffix;
    }

    public Dynamics withBuyStrategyTradeIdTradeNoSuffix(Integer buyStrategyTradeIdTradeNoSuffix) {
        this.buyStrategyTradeIdTradeNoSuffix = buyStrategyTradeIdTradeNoSuffix;
        return this;
    }

    /**
     * The Buystrategytradeid.tradedate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyTradeId.tradeDate")
    public String getBuyStrategyTradeIdTradeDate() {
        return buyStrategyTradeIdTradeDate;
    }

    /**
     * The Buystrategytradeid.tradedate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("buyStrategyTradeId.tradeDate")
    public void setBuyStrategyTradeIdTradeDate(String buyStrategyTradeIdTradeDate) {
        this.buyStrategyTradeIdTradeDate = buyStrategyTradeIdTradeDate;
    }

    public Dynamics withBuyStrategyTradeIdTradeDate(String buyStrategyTradeIdTradeDate) {
        this.buyStrategyTradeIdTradeDate = buyStrategyTradeIdTradeDate;
        return this;
    }

    /**
     * The Sellstrategytradeid.tradeno Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyTradeId.tradeNo")
    public Integer getSellStrategyTradeIdTradeNo() {
        return sellStrategyTradeIdTradeNo;
    }

    /**
     * The Sellstrategytradeid.tradeno Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyTradeId.tradeNo")
    public void setSellStrategyTradeIdTradeNo(Integer sellStrategyTradeIdTradeNo) {
        this.sellStrategyTradeIdTradeNo = sellStrategyTradeIdTradeNo;
    }

    public Dynamics withSellStrategyTradeIdTradeNo(Integer sellStrategyTradeIdTradeNo) {
        this.sellStrategyTradeIdTradeNo = sellStrategyTradeIdTradeNo;
        return this;
    }

    /**
     * The Sellstrategytradeid.tradenosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyTradeId.tradeNoSuffix")
    public Integer getSellStrategyTradeIdTradeNoSuffix() {
        return sellStrategyTradeIdTradeNoSuffix;
    }

    /**
     * The Sellstrategytradeid.tradenosuffix Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyTradeId.tradeNoSuffix")
    public void setSellStrategyTradeIdTradeNoSuffix(Integer sellStrategyTradeIdTradeNoSuffix) {
        this.sellStrategyTradeIdTradeNoSuffix = sellStrategyTradeIdTradeNoSuffix;
    }

    public Dynamics withSellStrategyTradeIdTradeNoSuffix(Integer sellStrategyTradeIdTradeNoSuffix) {
        this.sellStrategyTradeIdTradeNoSuffix = sellStrategyTradeIdTradeNoSuffix;
        return this;
    }

    /**
     * The Sellstrategytradeid.tradedate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyTradeId.tradeDate")
    public Integer getSellStrategyTradeIdTradeDate() {
        return sellStrategyTradeIdTradeDate;
    }

    /**
     * The Sellstrategytradeid.tradedate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("sellStrategyTradeId.tradeDate")
    public void setSellStrategyTradeIdTradeDate(Integer sellStrategyTradeIdTradeDate) {
        this.sellStrategyTradeIdTradeDate = sellStrategyTradeIdTradeDate;
    }

    public Dynamics withSellStrategyTradeIdTradeDate(Integer sellStrategyTradeIdTradeDate) {
        this.sellStrategyTradeIdTradeDate = sellStrategyTradeIdTradeDate;
        return this;
    }

    /**
     * The Disseminationtime Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("disseminationTime")
    public String getDisseminationTime() {
        return disseminationTime;
    }

    /**
     * The Disseminationtime Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("disseminationTime")
    public void setDisseminationTime(String disseminationTime) {
        this.disseminationTime = disseminationTime;
    }

    public Dynamics withDisseminationTime(String disseminationTime) {
        this.disseminationTime = disseminationTime;
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

    public Dynamics withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mktPriceData).append(buyStrategyTradeIdTradeNo).append(buyStrategyTradeIdTradeNoSuffix).append(buyStrategyTradeIdTradeDate).append(sellStrategyTradeIdTradeNo).append(sellStrategyTradeIdTradeNoSuffix).append(sellStrategyTradeIdTradeDate).append(disseminationTime).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dynamics) == false) {
            return false;
        }
        Dynamics rhs = ((Dynamics) other);
        return new EqualsBuilder().append(mktPriceData, rhs.mktPriceData).append(buyStrategyTradeIdTradeNo, rhs.buyStrategyTradeIdTradeNo).append(buyStrategyTradeIdTradeNoSuffix, rhs.buyStrategyTradeIdTradeNoSuffix).append(buyStrategyTradeIdTradeDate, rhs.buyStrategyTradeIdTradeDate).append(sellStrategyTradeIdTradeNo, rhs.sellStrategyTradeIdTradeNo).append(sellStrategyTradeIdTradeNoSuffix, rhs.sellStrategyTradeIdTradeNoSuffix).append(sellStrategyTradeIdTradeDate, rhs.sellStrategyTradeIdTradeDate).append(disseminationTime, rhs.disseminationTime).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
