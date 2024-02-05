package io.github.dftrakesh.roadrunner.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteDetail", propOrder = {
    "actualClass",
    "ratedClass",
    "charge",
    "code",
    "description",
    "rate",
    "weight",
    "extraMessages"
})
public class QuoteDetail {

    @XmlElement(name = "ActualClass")
    protected String actualClass;
    @XmlElement(name = "RatedClass")
    protected String ratedClass;
    @XmlElement(name = "Charge")
    protected double charge;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Rate")
    protected double rate;
    @XmlElement(name = "Weight")
    protected String weight;
    @XmlElement(name = "ExtraMessages")
    protected String extraMessages;
}