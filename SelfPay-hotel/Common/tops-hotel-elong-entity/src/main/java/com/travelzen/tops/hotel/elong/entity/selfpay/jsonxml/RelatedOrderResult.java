//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.23 at 05:20:41 PM CST 
//


package com.travelzen.tops.hotel.elong.entity.selfpay.jsonxml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * <p>Java class for RelatedOrderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedOrderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Relations" type="{}ArrayOfOrderRelation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedOrderResult", propOrder = {
    "relations"
})
public class RelatedOrderResult {

    @JSONField(name = "Relations")
    protected List<OrderRelation> relations;

    /**
     * Gets the value of the relations property.
     * 
     * @return
     *     possible object is
     *     {@link List<OrderRelation> }
     *     
     */
    public List<OrderRelation> getRelations() {
        return relations;
    }

    /**
     * Sets the value of the relations property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<OrderRelation> }
     *     
     */
    public void setRelations(List<OrderRelation> value) {
        this.relations = value;
    }

}
