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
 * <p>Java class for HotelRatePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRatePlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Suppliers" type="{}ArrayOfSupplierRatePlan" minOccurs="0"/>
 *         &lt;element name="RatePlans" type="{}ArrayOfRatePlan" minOccurs="0"/>
 *         &lt;element name="Gifts" type="{}ArrayOfHotelGift" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRatePlan", propOrder = {
    "hotelID",
    "suppliers",
    "ratePlans",
    "gifts"
})
public class HotelRatePlan {

    @JSONField(name = "HotelID")
    protected String hotelID;
    @JSONField(name = "Suppliers")
    protected List<SupplierRatePlan> suppliers;
    @JSONField(name = "RatePlans")
    protected List<RatePlan> ratePlans;
    @JSONField(name = "Gifts")
    protected List<HotelGift> gifts;

    /**
     * Gets the value of the hotelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelID() {
        return hotelID;
    }

    /**
     * Sets the value of the hotelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelID(String value) {
        this.hotelID = value;
    }

    /**
     * Gets the value of the suppliers property.
     * 
     * @return
     *     possible object is
     *     {@link List<SupplierRatePlan> }
     *     
     */
    public List<SupplierRatePlan> getSuppliers() {
        return suppliers;
    }

    /**
     * Sets the value of the suppliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<SupplierRatePlan> }
     *     
     */
    public void setSuppliers(List<SupplierRatePlan> value) {
        this.suppliers = value;
    }

    /**
     * Gets the value of the ratePlans property.
     * 
     * @return
     *     possible object is
     *     {@link List<RatePlan> }
     *     
     */
    public List<RatePlan> getRatePlans() {
        return ratePlans;
    }

    /**
     * Sets the value of the ratePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<RatePlan> }
     *     
     */
    public void setRatePlans(List<RatePlan> value) {
        this.ratePlans = value;
    }

    /**
     * Gets the value of the gifts property.
     * 
     * @return
     *     possible object is
     *     {@link List<HotelGift> }
     *     
     */
    public List<HotelGift> getGifts() {
        return gifts;
    }

    /**
     * Sets the value of the gifts property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<HotelGift> }
     *     
     */
    public void setGifts(List<HotelGift> value) {
        this.gifts = value;
    }

}
