package io.github.dftrakesh.roadrunner.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteRequest", propOrder = {
    "originZip",
    "destinationZip",
    "shipmentDetails",
    "originType",
    "paymentType",
    "palletCount",
    "linearFeet",
    "cubicFeet",
    "pieces",
    "serviceDeliveryOptions",
    "cod",
    "discount",
    "listedConsigneeCity",
    "internalUse",
    "palletPosition",
    "shipDate"
})
@XmlSeeAlso({
    QuoteAccountRequest.class
})
public class QuoteRequest {

    @XmlElement(name = "OriginZip")
    protected String originZip;
    @XmlElement(name = "DestinationZip")
    protected String destinationZip;
    @XmlElement(name = "ShipmentDetails")
    protected ArrayOfShipmentDetail shipmentDetails;
    @XmlElement(name = "OriginType")
    protected String originType;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "PalletCount")
    protected String palletCount;
    @XmlElement(name = "LinearFeet")
    protected String linearFeet;
    @XmlElement(name = "CubicFeet")
    protected String cubicFeet;
    @XmlElement(name = "Pieces")
    protected int pieces;
    @XmlElement(name = "ServiceDeliveryOptions")
    protected ArrayOfServiceOptions serviceDeliveryOptions;
    @XmlElement(name = "COD")
    protected CODFee cod;
    @XmlElement(name = "Discount")
    protected String discount;
    @XmlElement(name = "ListedConsigneeCity")
    protected String listedConsigneeCity;
    @XmlElement(name = "InternalUse")
    protected String internalUse;
    @XmlElement(name = "PalletPosition")
    protected String palletPosition;
    @XmlElement(name = "ShipDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipDate;
}