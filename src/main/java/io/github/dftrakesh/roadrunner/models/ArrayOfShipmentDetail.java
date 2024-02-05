package io.github.dftrakesh.roadrunner.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShipmentDetail", propOrder = {
    "shipmentDetail"
})
public class ArrayOfShipmentDetail {

    @XmlElement(name = "ShipmentDetail", nillable = true)
    protected List<ShipmentDetail> shipmentDetail;

    public List<ShipmentDetail> getShipmentDetail() {
        if (shipmentDetail == null) {
            shipmentDetail = new ArrayList<ShipmentDetail>();
        }
        return this.shipmentDetail;
    }
}