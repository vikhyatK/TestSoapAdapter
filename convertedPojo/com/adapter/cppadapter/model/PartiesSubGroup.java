
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
 * The Items Schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SubId",
    "SubType"
})
public class PartiesSubGroup {

    /**
     * The Subid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SubId")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String subId = "";
    /**
     * The Subtype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SubType")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer subType = 0;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Subid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SubId")
    public String getSubId() {
        return subId;
    }

    /**
     * The Subid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SubId")
    public void setSubId(String subId) {
        this.subId = subId;
    }

    public PartiesSubGroup withSubId(String subId) {
        this.subId = subId;
        return this;
    }

    /**
     * The Subtype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SubType")
    public Integer getSubType() {
        return subType;
    }

    /**
     * The Subtype Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SubType")
    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    public PartiesSubGroup withSubType(Integer subType) {
        this.subType = subType;
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

    public PartiesSubGroup withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subId).append(subType).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PartiesSubGroup) == false) {
            return false;
        }
        PartiesSubGroup rhs = ((PartiesSubGroup) other);
        return new EqualsBuilder().append(subId, rhs.subId).append(subType, rhs.subType).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
