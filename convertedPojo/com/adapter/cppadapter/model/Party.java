
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
 * The Items Schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PartyId",
    "PartyRole",
    "PartiesSubGroup"
})
public class Party {

    /**
     * The Partyid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("PartyId")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer partyId = 0;
    /**
     * The Partyrole Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("PartyRole")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer partyRole = 0;
    /**
     * The Partiessubgroup Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("PartiesSubGroup")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private List<PartiesSubGroup> partiesSubGroup = new ArrayList<PartiesSubGroup>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Partyid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("PartyId")
    public Integer getPartyId() {
        return partyId;
    }

    /**
     * The Partyid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("PartyId")
    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Party withPartyId(Integer partyId) {
        this.partyId = partyId;
        return this;
    }

    /**
     * The Partyrole Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("PartyRole")
    public Integer getPartyRole() {
        return partyRole;
    }

    /**
     * The Partyrole Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("PartyRole")
    public void setPartyRole(Integer partyRole) {
        this.partyRole = partyRole;
    }

    public Party withPartyRole(Integer partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    /**
     * The Partiessubgroup Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("PartiesSubGroup")
    public List<PartiesSubGroup> getPartiesSubGroup() {
        return partiesSubGroup;
    }

    /**
     * The Partiessubgroup Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("PartiesSubGroup")
    public void setPartiesSubGroup(List<PartiesSubGroup> partiesSubGroup) {
        this.partiesSubGroup = partiesSubGroup;
    }

    public Party withPartiesSubGroup(List<PartiesSubGroup> partiesSubGroup) {
        this.partiesSubGroup = partiesSubGroup;
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

    public Party withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(partyId).append(partyRole).append(partiesSubGroup).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Party) == false) {
            return false;
        }
        Party rhs = ((Party) other);
        return new EqualsBuilder().append(partyId, rhs.partyId).append(partyRole, rhs.partyRole).append(partiesSubGroup, rhs.partiesSubGroup).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
