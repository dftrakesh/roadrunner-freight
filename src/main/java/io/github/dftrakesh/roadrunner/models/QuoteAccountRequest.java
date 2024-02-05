package io.github.dftrakesh.roadrunner.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteAccountRequest", propOrder = {
    "account"
})
@XmlSeeAlso({
    QuoteAccountByTerminalRequest.class
})
public class QuoteAccountRequest
    extends QuoteRequest {

    @XmlElement(name = "Account")
    protected int account;
}