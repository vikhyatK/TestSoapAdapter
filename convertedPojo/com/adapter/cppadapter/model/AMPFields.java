
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
 * The Ampfields Schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "statics",
    "dynamics"
})
public class AMPFields {

    /**
     * The Statics Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("statics")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Statics statics;
    /**
     * The Dynamics Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("dynamics")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Dynamics dynamics;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Statics Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("statics")
    public Statics getStatics() {
        return statics;
    }

    /**
     * The Statics Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("statics")
    public void setStatics(Statics statics) {
        this.statics = statics;
    }

    public AMPFields withStatics(Statics statics) {
        this.statics = statics;
        return this;
    }

    /**
     * The Dynamics Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("dynamics")
    public Dynamics getDynamics() {
        return dynamics;
    }

    /**
     * The Dynamics Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("dynamics")
    public void setDynamics(Dynamics dynamics) {
        this.dynamics = dynamics;
    }

    public AMPFields withDynamics(Dynamics dynamics) {
        this.dynamics = dynamics;
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

    public AMPFields withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(statics).append(dynamics).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AMPFields) == false) {
            return false;
        }
        AMPFields rhs = ((AMPFields) other);
        return new EqualsBuilder().append(statics, rhs.statics).append(dynamics, rhs.dynamics).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
