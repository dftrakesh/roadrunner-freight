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
@XmlType(name = "ArrayOfServiceOptions", propOrder = {
    "serviceOptions"
})
public class ArrayOfServiceOptions {

    @XmlElement(name = "ServiceOptions", nillable = true)
    protected List<ServiceOptions> serviceOptions;

    public List<ServiceOptions> getServiceOptions() {
        if (serviceOptions == null) {
            serviceOptions = new ArrayList<ServiceOptions>();
        }
        return this.serviceOptions;
    }
}