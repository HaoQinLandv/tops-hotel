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
 * <p>Java class for OrderLogResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLogResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Logs" type="{}ArrayOfOrderLog" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLogResult", propOrder = {
    "logs"
})
public class OrderLogResult {

    @JSONField(name = "Logs")
    protected List<OrderLog> logs;

    /**
     * Gets the value of the logs property.
     * 
     * @return
     *     possible object is
     *     {@link List<OrderLog> }
     *     
     */
    public List<OrderLog> getLogs() {
        return logs;
    }

    /**
     * Sets the value of the logs property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<OrderLog> }
     *     
     */
    public void setLogs(List<OrderLog> value) {
        this.logs = value;
    }

}
