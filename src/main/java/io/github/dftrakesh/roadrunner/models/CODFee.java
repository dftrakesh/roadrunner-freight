package io.github.dftrakesh.roadrunner.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODFee", propOrder = {
    "prepaid",
    "codAmount"
})
public class CODFee {

    @XmlElement(name = "Prepaid")
    protected boolean prepaid;
    @XmlElement(name = "CODAmount")
    protected double codAmount;
}