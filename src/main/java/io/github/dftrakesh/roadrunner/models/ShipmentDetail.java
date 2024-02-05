package io.github.dftrakesh.roadrunner.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDetail", propOrder = {
    "actualClass",
    "weight"
})
public class ShipmentDetail {

    @XmlElement(name = "ActualClass")
    protected double actualClass;
    @XmlElement(name = "Weight")
    protected int weight;
}