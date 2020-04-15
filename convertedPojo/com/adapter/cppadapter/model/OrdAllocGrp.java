
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
    "orderSide",
    "OrderID",
    "SecondaryClOrdID",
    "CIOrdID",
    "OrderDate",
    "OrderCapacity",
    "LocalOrForeign",
    "Parties"
})
public class OrdAllocGrp {

    /**
     * The Orderside Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("orderSide")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String orderSide = "";
    /**
     * The Orderid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OrderID")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private Integer orderID = 0;
    /**
     * The Secondaryclordid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SecondaryClOrdID")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String secondaryClOrdID = "";
    /**
     * The Ciordid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("CIOrdID")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String cIOrdID = "";
    /**
     * The Orderdate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OrderDate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String orderDate = "";
    /**
     * The Ordercapacity Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OrderCapacity")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String orderCapacity = "";
    /**
     * The Localorforeign Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("LocalOrForeign")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String localOrForeign = "";
    /**
     * The Parties Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Parties")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private List<Party> parties = new ArrayList<Party>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Orderside Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("orderSide")
    public String getOrderSide() {
        return orderSide;
    }

    /**
     * The Orderside Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("orderSide")
    public void setOrderSide(String orderSide) {
        this.orderSide = orderSide;
    }

    public OrdAllocGrp withOrderSide(String orderSide) {
        this.orderSide = orderSide;
        return this;
    }

    /**
     * The Orderid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OrderID")
    public Integer getOrderID() {
        return orderID;
    }

    /**
     * The Orderid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OrderID")
    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public OrdAllocGrp withOrderID(Integer orderID) {
        this.orderID = orderID;
        return this;
    }

    /**
     * The Secondaryclordid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SecondaryClOrdID")
    public String getSecondaryClOrdID() {
        return secondaryClOrdID;
    }

    /**
     * The Secondaryclordid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("SecondaryClOrdID")
    public void setSecondaryClOrdID(String secondaryClOrdID) {
        this.secondaryClOrdID = secondaryClOrdID;
    }

    public OrdAllocGrp withSecondaryClOrdID(String secondaryClOrdID) {
        this.secondaryClOrdID = secondaryClOrdID;
        return this;
    }

    /**
     * The Ciordid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("CIOrdID")
    public String getCIOrdID() {
        return cIOrdID;
    }

    /**
     * The Ciordid Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("CIOrdID")
    public void setCIOrdID(String cIOrdID) {
        this.cIOrdID = cIOrdID;
    }

    public OrdAllocGrp withCIOrdID(String cIOrdID) {
        this.cIOrdID = cIOrdID;
        return this;
    }

    /**
     * The Orderdate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OrderDate")
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * The Orderdate Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OrderDate")
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public OrdAllocGrp withOrderDate(String orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    /**
     * The Ordercapacity Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OrderCapacity")
    public String getOrderCapacity() {
        return orderCapacity;
    }

    /**
     * The Ordercapacity Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("OrderCapacity")
    public void setOrderCapacity(String orderCapacity) {
        this.orderCapacity = orderCapacity;
    }

    public OrdAllocGrp withOrderCapacity(String orderCapacity) {
        this.orderCapacity = orderCapacity;
        return this;
    }

    /**
     * The Localorforeign Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("LocalOrForeign")
    public String getLocalOrForeign() {
        return localOrForeign;
    }

    /**
     * The Localorforeign Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("LocalOrForeign")
    public void setLocalOrForeign(String localOrForeign) {
        this.localOrForeign = localOrForeign;
    }

    public OrdAllocGrp withLocalOrForeign(String localOrForeign) {
        this.localOrForeign = localOrForeign;
        return this;
    }

    /**
     * The Parties Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Parties")
    public List<Party> getParties() {
        return parties;
    }

    /**
     * The Parties Schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("Parties")
    public void setParties(List<Party> parties) {
        this.parties = parties;
    }

    public OrdAllocGrp withParties(List<Party> parties) {
        this.parties = parties;
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

    public OrdAllocGrp withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(orderSide).append(orderID).append(secondaryClOrdID).append(cIOrdID).append(orderDate).append(orderCapacity).append(localOrForeign).append(parties).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrdAllocGrp) == false) {
            return false;
        }
        OrdAllocGrp rhs = ((OrdAllocGrp) other);
        return new EqualsBuilder().append(orderSide, rhs.orderSide).append(orderID, rhs.orderID).append(secondaryClOrdID, rhs.secondaryClOrdID).append(cIOrdID, rhs.cIOrdID).append(orderDate, rhs.orderDate).append(orderCapacity, rhs.orderCapacity).append(localOrForeign, rhs.localOrForeign).append(parties, rhs.parties).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
