package io.github.dftrakesh.roadrunner;

import io.github.dftrakesh.roadrunner.models.AuthenticationHeader;
import io.github.dftrakesh.roadrunner.models.QuoteAccountByTerminalRequest;
import io.github.dftrakesh.roadrunner.models.QuoteAccountRequest;
import io.github.dftrakesh.roadrunner.models.QuoteRequest;
import io.github.dftrakesh.roadrunner.models.QuoteResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "https://webservices.rrts.com/ratequote/", name = "RateQuoteSoap")
public interface RateQuoteSoap {

    @WebResult(name = "RateQuoteResult", targetNamespace = "https://webservices.rrts.com/ratequote/")
    @WebMethod(operationName = "RateQuote", action = "https://webservices.rrts.com/ratequote/RateQuote")
    @RequestWrapper(localName = "RateQuote",
        targetNamespace = "https://webservices.rrts.com/ratequote/",
        className = "io.github.dftrakesh.roadrunner.models.RateQuote")
    @ResponseWrapper(localName = "RateQuoteResponse",
        targetNamespace = "https://webservices.rrts.com/ratequote/",
        className = "io.github.dftrakesh.roadrunner.models.RateQuoteResponse")
    public QuoteResponse rateQuote(

        @WebParam(name = "request",
            targetNamespace = "https://webservices.rrts.com/ratequote/")
            QuoteRequest request,
        @WebParam(name = "AuthenticationHeader",
            targetNamespace = "https://webservices.rrts.com/ratequote/",
            header = true)
            AuthenticationHeader authenticationHeader
    );

    @WebResult(name = "RateQuoteByAccountResult", targetNamespace = "https://webservices.rrts.com/ratequote/")
    @WebMethod(operationName = "RateQuoteByAccount", action = "https://webservices.rrts.com/ratequote/RateQuoteByAccount")
    @RequestWrapper(localName = "RateQuoteByAccount",
        targetNamespace = "https://webservices.rrts.com/ratequote/",
        className = "io.github.dftrakesh.roadrunner.models.RateQuoteByAccount")
    @ResponseWrapper(localName = "RateQuoteByAccountResponse",
        targetNamespace = "https://webservices.rrts.com/ratequote/",
        className = "io.github.dftrakesh.roadrunner.models.RateQuoteByAccountResponse")
    public QuoteResponse rateQuoteByAccount(

        @WebParam(name = "request",
            targetNamespace = "https://webservices.rrts.com/ratequote/")
            QuoteAccountRequest request,
        @WebParam(name = "AuthenticationHeader",
            targetNamespace = "https://webservices.rrts.com/ratequote/",
            header = true)
            AuthenticationHeader authenticationHeader
    );

    @WebResult(name = "RateQuoteByAccountByTerminalResult", targetNamespace = "https://webservices.rrts.com/ratequote/")
    @WebMethod(operationName = "RateQuoteByAccountByTerminal", action = "https://webservices.rrts.com/ratequote/RateQuoteByAccountByTerminal")
    @RequestWrapper(localName = "RateQuoteByAccountByTerminal",
        targetNamespace = "https://webservices.rrts.com/ratequote/",
        className = "io.github.dftrakesh.roadrunner.models.RateQuoteByAccountByTerminal")
    @ResponseWrapper(localName = "RateQuoteByAccountByTerminalResponse",
        targetNamespace = "https://webservices.rrts.com/ratequote/",
        className = "io.github.dftrakesh.roadrunner.models.RateQuoteByAccountByTerminalResponse")
    public QuoteResponse rateQuoteByAccountByTerminal(

        @WebParam(name = "request",
            targetNamespace = "https://webservices.rrts.com/ratequote/")
            QuoteAccountByTerminalRequest request,
        @WebParam(name = "AuthenticationHeader",
            targetNamespace = "https://webservices.rrts.com/ratequote/",
            header = true)
            AuthenticationHeader authenticationHeader
    );
}