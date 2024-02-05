package io.github.dftrakesh.roadrunner.models;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "RateQuote",
    wsdlLocation = "https://webservices.rrts.com/rating/ratequote.asmx?wsdl",
    targetNamespace = "https://webservices.rrts.com/ratequote/")
public class RateQuote_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://webservices.rrts.com/ratequote/", "RateQuote");
    public final static QName RateQuoteSoap12 = new QName("https://webservices.rrts.com/ratequote/", "RateQuoteSoap12");
    public final static QName RateQuoteSoap = new QName("https://webservices.rrts.com/ratequote/", "RateQuoteSoap");

    static {
        URL url = null;
        try {
            url = new URL("https://webservices.rrts.com/rating/ratequote.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RateQuote_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                    "Can not initialize the default wsdl from {0}", "https://webservices.rrts.com/rating/ratequote.asmx?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RateQuote_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RateQuote_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RateQuote_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public RateQuote_Service(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public RateQuote_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public RateQuote_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    @WebEndpoint(name = "RateQuoteSoap12")
    public RateQuoteSoap getRateQuoteSoap12() {
        return super.getPort(RateQuoteSoap12, RateQuoteSoap.class);
    }

    @WebEndpoint(name = "RateQuoteSoap12")
    public RateQuoteSoap getRateQuoteSoap12(WebServiceFeature... features) {
        return super.getPort(RateQuoteSoap12, RateQuoteSoap.class, features);
    }

    @WebEndpoint(name = "RateQuoteSoap")
    public RateQuoteSoap getRateQuoteSoap() {
        return super.getPort(RateQuoteSoap, RateQuoteSoap.class);
    }

    @WebEndpoint(name = "RateQuoteSoap")
    public RateQuoteSoap getRateQuoteSoap(WebServiceFeature... features) {
        return super.getPort(RateQuoteSoap, RateQuoteSoap.class, features);
    }
}