package io.github.dftrakesh.roadrunner.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationHeader", propOrder = {
    "userName",
    "password",
    "site"
})
public class AuthenticationHeader {

    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Site")
    protected String site;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();
}