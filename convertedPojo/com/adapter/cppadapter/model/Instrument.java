
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
 * The Instrument Schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Symbol",
    "SecuritySubType",
    "InstrumentID",
    "MaturityDate"
})
public class Instrument {

    /**
     * The Symbol Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Symbol")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String symbol = "";
    /**
     * The Securitysubtype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SecuritySubType")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String securitySubType = "";
    /**
     * The Instrumentid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("InstrumentID")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String instrumentID = "";
    /**
     * The Maturitydate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("MaturityDate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String maturityDate = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Symbol Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Symbol")
    public String getSymbol() {
        return symbol;
    }

    /**
     * The Symbol Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Instrument withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * The Securitysubtype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SecuritySubType")
    public String getSecuritySubType() {
        return securitySubType;
    }

    /**
     * The Securitysubtype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SecuritySubType")
    public void setSecuritySubType(String securitySubType) {
        this.securitySubType = securitySubType;
    }

    public Instrument withSecuritySubType(String securitySubType) {
        this.securitySubType = securitySubType;
        return this;
    }

    /**
     * The Instrumentid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("InstrumentID")
    public String getInstrumentID() {
        return instrumentID;
    }

    /**
     * The Instrumentid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("InstrumentID")
    public void setInstrumentID(String instrumentID) {
        this.instrumentID = instrumentID;
    }

    public Instrument withInstrumentID(String instrumentID) {
        this.instrumentID = instrumentID;
        return this;
    }

    /**
     * The Maturitydate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("MaturityDate")
    public String getMaturityDate() {
        return maturityDate;
    }

    /**
     * The Maturitydate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("MaturityDate")
    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public Instrument withMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
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

    public Instrument withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(symbol).append(securitySubType).append(instrumentID).append(maturityDate).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Instrument) == false) {
            return false;
        }
        Instrument rhs = ((Instrument) other);
        return new EqualsBuilder().append(symbol, rhs.symbol).append(securitySubType, rhs.securitySubType).append(instrumentID, rhs.instrumentID).append(maturityDate, rhs.maturityDate).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
