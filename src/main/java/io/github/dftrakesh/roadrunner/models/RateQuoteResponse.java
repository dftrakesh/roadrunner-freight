package io.github.dftrakesh.roadrunner.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rateQuoteResult"
})
@XmlRootElement(name = "RateQuoteResponse")
public class RateQuoteResponse {

    @XmlElement(name = "RateQuoteResult")
    protected QuoteResponse rateQuoteResult;
}