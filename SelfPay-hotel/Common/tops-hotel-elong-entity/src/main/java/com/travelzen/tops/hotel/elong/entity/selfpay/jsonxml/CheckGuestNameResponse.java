//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.27 at 02:30:58 PM CST 
//


package com.travelzen.tops.hotel.elong.entity.selfpay.jsonxml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.alibaba.fastjson.annotation.JSONField;


/**
 * <p>Java class for CheckGuestNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckGuestNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{}ArrayOfCheckGuestNameItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckGuestNameResponse", propOrder = {
    "result"
})
public class CheckGuestNameResponse {

    @JSONField(name = "Result")
    protected List<CheckGuestNameItem> result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link List<CheckGuestNameItem> }
     *     
     */
    public List<CheckGuestNameItem> getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<CheckGuestNameItem> }
     *     
     */
    public void setResult(List<CheckGuestNameItem> value) {
        this.result = value;
    }

}