package io.github.dftrakesh.roadrunner.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingInformation", propOrder = {
    "destinationState",
    "destinationZip",
    "originState",
    "originZip",
    "estimatedTransitDays",
    "originTerminal"
})
public class RoutingInformation {

    @XmlElement(name = "DestinationState")
    protected String destinationState;
    @XmlElement(name = "DestinationZip")
    protected String destinationZip;
    @XmlElement(name = "OriginState")
    protected String originState;
    @XmlElement(name = "OriginZip")
    protected String originZip;
    @XmlElement(name = "EstimatedTransitDays")
    protected String estimatedTransitDays;
    @XmlElement(name = "OriginTerminal")
    protected String originTerminal;
}