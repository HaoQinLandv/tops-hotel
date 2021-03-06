
package com.micros.webservices.og._4_3.hotelcommon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatePlanRoomTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlanRoomTypes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservices.micros.com/og/4.3/HotelCommon/}RatePlan">
 *       &lt;sequence>
 *         &lt;element name="RoomTypes" type="{http://webservices.micros.com/og/4.3/HotelCommon/}ArrayOfRoomType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanRoomTypes", propOrder = {
    "roomTypes"
})
public class RatePlanRoomTypes
    extends RatePlan
{

    @XmlElement(name = "RoomTypes")
    protected ArrayOfRoomType roomTypes;

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomType }
     *     
     */
    public ArrayOfRoomType getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomType }
     *     
     */
    public void setRoomTypes(ArrayOfRoomType value) {
        this.roomTypes = value;
    }

}
