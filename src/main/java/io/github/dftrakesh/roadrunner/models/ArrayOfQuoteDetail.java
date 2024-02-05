package io.github.dftrakesh.roadrunner.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuoteDetail", propOrder = {
    "quoteDetail"
})
public class ArrayOfQuoteDetail {

    @XmlElement(name = "QuoteDetail", nillable = true)
    protected List<QuoteDetail> quoteDetail;
}