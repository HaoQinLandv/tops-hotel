//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.26 at 02:14:35 PM CST 
//


package com.travelzen.tops.hotel.elong.entity.selfpay.jsonxml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumMemberLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumMemberLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumMemberLevel")
@XmlEnum
public enum EnumMemberLevel {

    @XmlEnumValue("Normal")
    Normal("Normal");
    private final String value;

    EnumMemberLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumMemberLevel fromValue(String v) {
        for (EnumMemberLevel c: EnumMemberLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
