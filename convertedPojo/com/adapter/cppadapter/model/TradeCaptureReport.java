
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
 * The Tradecapturereport Schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SecondaryTradeID"
})
public class TradeCaptureReport {

    /**
     * The Secondarytradeid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SecondaryTradeID")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer secondaryTradeID = 0;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Secondarytradeid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SecondaryTradeID")
    public Integer getSecondaryTradeID() {
        return secondaryTradeID;
    }

    /**
     * The Secondarytradeid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SecondaryTradeID")
    public void setSecondaryTradeID(Integer secondaryTradeID) {
        this.secondaryTradeID = secondaryTradeID;
    }

    public TradeCaptureReport withSecondaryTradeID(Integer secondaryTradeID) {
        this.secondaryTradeID = secondaryTradeID;
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

    public TradeCaptureReport withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(secondaryTradeID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradeCaptureReport) == false) {
            return false;
        }
        TradeCaptureReport rhs = ((TradeCaptureReport) other);
        return new EqualsBuilder().append(secondaryTradeID, rhs.secondaryTradeID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
