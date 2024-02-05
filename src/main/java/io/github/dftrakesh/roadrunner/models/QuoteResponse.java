package io.github.dftrakesh.roadrunner.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteResponse", propOrder = {
    "quoteNumber",
    "netCharge",
    "customer",
    "routingInfo",
    "rateDetails",
    "originType",
    "paymentType",
    "codAmount",
    "shipmentDate",
    "customerCubicFoot",
    "hawaiianRatedCubicFoot"
})
public class QuoteResponse {

    @XmlElement(name = "QuoteNumber")
    protected int quoteNumber;
    @XmlElement(name = "NetCharge")
    protected double netCharge;
    @XmlElement(name = "Customer")
    protected CustomerInformation customer;
    @XmlElement(name = "RoutingInfo")
    protected RoutingInformation routingInfo;
    @XmlElement(name = "RateDetails")
    protected ArrayOfQuoteDetail rateDetails;
    @XmlElement(name = "OriginType")
    protected String originType;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "CODAmount")
    protected double codAmount;
    @XmlElement(name = "ShipmentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipmentDate;
    @XmlElement(name = "CustomerCubicFoot")
    protected int customerCubicFoot;
    @XmlElement(name = "HawaiianRatedCubicFoot")
    protected int hawaiianRatedCubicFoot;
}