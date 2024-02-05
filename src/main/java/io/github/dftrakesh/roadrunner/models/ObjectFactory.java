package io.github.dftrakesh.roadrunner.models;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthenticationHeader_QNAME = new QName("https://webservices.rrts.com/ratequote/", "AuthenticationHeader");

    public ObjectFactory() {
    }

    public RateQuote createRateQuote() {
        return new RateQuote();
    }

    public QuoteRequest createQuoteRequest() {
        return new QuoteRequest();
    }

    public RateQuoteResponse createRateQuoteResponse() {
        return new RateQuoteResponse();
    }

    public QuoteResponse createQuoteResponse() {
        return new QuoteResponse();
    }

    public AuthenticationHeader createAuthenticationHeader() {
        return new AuthenticationHeader();
    }

    public RateQuoteByAccount createRateQuoteByAccount() {
        return new RateQuoteByAccount();
    }

    public QuoteAccountRequest createQuoteAccountRequest() {
        return new QuoteAccountRequest();
    }

    public RateQuoteByAccountResponse createRateQuoteByAccountResponse() {
        return new RateQuoteByAccountResponse();
    }

    public RateQuoteByAccountByTerminal createRateQuoteByAccountByTerminal() {
        return new RateQuoteByAccountByTerminal();
    }

    public QuoteAccountByTerminalRequest createQuoteAccountByTerminalRequest() {
        return new QuoteAccountByTerminalRequest();
    }

    public RateQuoteByAccountByTerminalResponse createRateQuoteByAccountByTerminalResponse() {
        return new RateQuoteByAccountByTerminalResponse();
    }

    public ArrayOfShipmentDetail createArrayOfShipmentDetail() {
        return new ArrayOfShipmentDetail();
    }

    public ShipmentDetail createShipmentDetail() {
        return new ShipmentDetail();
    }

    public ArrayOfServiceOptions createArrayOfServiceOptions() {
        return new ArrayOfServiceOptions();
    }

    public ServiceOptions createServiceOptions() {
        return new ServiceOptions();
    }

    public CODFee createCODFee() {
        return new CODFee();
    }

    public CustomerInformation createCustomerInformation() {
        return new CustomerInformation();
    }

    public RoutingInformation createRoutingInformation() {
        return new RoutingInformation();
    }

    public ArrayOfQuoteDetail createArrayOfQuoteDetail() {
        return new ArrayOfQuoteDetail();
    }

    public QuoteDetail createQuoteDetail() {
        return new QuoteDetail();
    }

    @XmlElementDecl(namespace = "https://webservices.rrts.com/ratequote/", name = "AuthenticationHeader")
    public JAXBElement<AuthenticationHeader> createAuthenticationHeader(AuthenticationHeader value) {
        return new JAXBElement<AuthenticationHeader>(_AuthenticationHeader_QNAME, AuthenticationHeader.class, null, value);
    }
}