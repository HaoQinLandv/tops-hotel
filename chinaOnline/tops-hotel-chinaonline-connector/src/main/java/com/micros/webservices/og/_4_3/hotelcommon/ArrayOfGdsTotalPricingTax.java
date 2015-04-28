
package com.micros.webservices.og._4_3.hotelcommon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGdsTotalPricingTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGdsTotalPricingTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GdsTotalPricingTax" type="{http://webservices.micros.com/og/4.3/HotelCommon/}GdsTotalPricingTax" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGdsTotalPricingTax", propOrder = {
    "gdsTotalPricingTax"
})
public class ArrayOfGdsTotalPricingTax {

    @XmlElement(name = "GdsTotalPricingTax")
    protected List<GdsTotalPricingTax> gdsTotalPricingTax;

    /**
     * Gets the value of the gdsTotalPricingTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdsTotalPricingTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGdsTotalPricingTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GdsTotalPricingTax }
     * 
     * 
     */
    public List<GdsTotalPricingTax> getGdsTotalPricingTax() {
        if (gdsTotalPricingTax == null) {
            gdsTotalPricingTax = new ArrayList<GdsTotalPricingTax>();
        }
        return this.gdsTotalPricingTax;
    }

}
