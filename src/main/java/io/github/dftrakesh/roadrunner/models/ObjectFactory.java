
package io.github.dftrakesh.roadrunner.models;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthenticationHeader_QNAME = new QName("https://webservices.rrts.com/ratequote/", "AuthenticationHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.taim.api.rrts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RateQuote }
     * 
     */
    public RateQuote createRateQuote() {
        return new RateQuote();
    }

    /**
     * Create an instance of {@link QuoteRequest }
     * 
     */
    public QuoteRequest createQuoteRequest() {
        return new QuoteRequest();
    }

    /**
     * Create an instance of {@link RateQuoteResponse }
     * 
     */
    public RateQuoteResponse createRateQuoteResponse() {
        return new RateQuoteResponse();
    }

    /**
     * Create an instance of {@link QuoteResponse }
     * 
     */
    public QuoteResponse createQuoteResponse() {
        return new QuoteResponse();
    }

    /**
     * Create an instance of {@link AuthenticationHeader }
     * 
     */
    public AuthenticationHeader createAuthenticationHeader() {
        return new AuthenticationHeader();
    }

    /**
     * Create an instance of {@link RateQuoteByAccount }
     * 
     */
    public RateQuoteByAccount createRateQuoteByAccount() {
        return new RateQuoteByAccount();
    }

    /**
     * Create an instance of {@link QuoteAccountRequest }
     * 
     */
    public QuoteAccountRequest createQuoteAccountRequest() {
        return new QuoteAccountRequest();
    }

    /**
     * Create an instance of {@link RateQuoteByAccountResponse }
     * 
     */
    public RateQuoteByAccountResponse createRateQuoteByAccountResponse() {
        return new RateQuoteByAccountResponse();
    }

    /**
     * Create an instance of {@link RateQuoteByAccountByTerminal }
     * 
     */
    public RateQuoteByAccountByTerminal createRateQuoteByAccountByTerminal() {
        return new RateQuoteByAccountByTerminal();
    }

    /**
     * Create an instance of {@link QuoteAccountByTerminalRequest }
     * 
     */
    public QuoteAccountByTerminalRequest createQuoteAccountByTerminalRequest() {
        return new QuoteAccountByTerminalRequest();
    }

    /**
     * Create an instance of {@link RateQuoteByAccountByTerminalResponse }
     * 
     */
    public RateQuoteByAccountByTerminalResponse createRateQuoteByAccountByTerminalResponse() {
        return new RateQuoteByAccountByTerminalResponse();
    }

    /**
     * Create an instance of {@link ArrayOfShipmentDetail }
     * 
     */
    public ArrayOfShipmentDetail createArrayOfShipmentDetail() {
        return new ArrayOfShipmentDetail();
    }

    /**
     * Create an instance of {@link ShipmentDetail }
     * 
     */
    public ShipmentDetail createShipmentDetail() {
        return new ShipmentDetail();
    }

    /**
     * Create an instance of {@link ArrayOfServiceOptions }
     * 
     */
    public ArrayOfServiceOptions createArrayOfServiceOptions() {
        return new ArrayOfServiceOptions();
    }

    /**
     * Create an instance of {@link ServiceOptions }
     * 
     */
    public ServiceOptions createServiceOptions() {
        return new ServiceOptions();
    }

    /**
     * Create an instance of {@link CODFee }
     * 
     */
    public CODFee createCODFee() {
        return new CODFee();
    }

    /**
     * Create an instance of {@link CustomerInformation }
     * 
     */
    public CustomerInformation createCustomerInformation() {
        return new CustomerInformation();
    }

    /**
     * Create an instance of {@link RoutingInformation }
     * 
     */
    public RoutingInformation createRoutingInformation() {
        return new RoutingInformation();
    }

    /**
     * Create an instance of {@link ArrayOfQuoteDetail }
     * 
     */
    public ArrayOfQuoteDetail createArrayOfQuoteDetail() {
        return new ArrayOfQuoteDetail();
    }

    /**
     * Create an instance of {@link QuoteDetail }
     * 
     */
    public QuoteDetail createQuoteDetail() {
        return new QuoteDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationHeader }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthenticationHeader }{@code >}
     */
    @XmlElementDecl(namespace = "https://webservices.rrts.com/ratequote/", name = "AuthenticationHeader")
    public JAXBElement<AuthenticationHeader> createAuthenticationHeader(AuthenticationHeader value) {
        return new JAXBElement<AuthenticationHeader>(_AuthenticationHeader_QNAME, AuthenticationHeader.class, null, value);
    }

}
