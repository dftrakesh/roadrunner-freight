package io.github.dftrakesh.roadrunner.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteAccountByTerminalRequest", propOrder = {
    "terminalCode"
})
public class QuoteAccountByTerminalRequest
    extends QuoteAccountRequest {

    @XmlElement(name = "TerminalCode")
    protected String terminalCode;
}