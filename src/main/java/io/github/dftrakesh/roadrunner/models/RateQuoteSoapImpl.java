package io.github.dftrakesh.roadrunner.models;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@WebService(
    serviceName = "RateQuote",
    portName = "RateQuoteSoap",
    targetNamespace = "https://webservices.rrts.com/ratequote/",
    wsdlLocation = "https://webservices.rrts.com/rating/ratequote.asmx?wsdl",
    endpointInterface = "io.github.dftrakesh.roadrunner.models.RateQuoteSoap")

@Service
public class RateQuoteSoapImpl implements RateQuoteSoap {

    @SneakyThrows
    public QuoteResponse rateQuote(QuoteRequest request, AuthenticationHeader authenticationHeader) {

        QuoteResponse _return = null;
        RateQuote_Service rateQuote_service = new RateQuote_Service();
        RateQuoteSoap rateQuoteSoap12 = rateQuote_service.getRateQuoteSoap12();
        _return = rateQuoteSoap12.rateQuote(request, authenticationHeader);
        return _return;
    }

    @SneakyThrows
    public QuoteResponse rateQuoteByAccount(QuoteAccountRequest request, AuthenticationHeader authenticationHeader) {

        QuoteResponse _return = null;
        return _return;
    }

    @SneakyThrows
    public QuoteResponse rateQuoteByAccountByTerminal(QuoteAccountByTerminalRequest request, AuthenticationHeader authenticationHeader) {

        QuoteResponse _return = null;
        return _return;
    }
}