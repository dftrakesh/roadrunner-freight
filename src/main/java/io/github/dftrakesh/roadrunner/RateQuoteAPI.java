package io.github.dftrakesh.roadrunner;

import io.github.dftrakesh.roadrunner.models.AuthenticationHeader;
import io.github.dftrakesh.roadrunner.models.QuoteAccountByTerminalRequest;
import io.github.dftrakesh.roadrunner.models.QuoteAccountRequest;
import io.github.dftrakesh.roadrunner.models.QuoteRequest;
import io.github.dftrakesh.roadrunner.models.QuoteResponse;
import io.github.dftrakesh.roadrunner.models.RateQuoteSoap;
import io.github.dftrakesh.roadrunner.models.RateQuoteSoapImpl;
import lombok.SneakyThrows;

public class RateQuoteAPI {

    @SneakyThrows
    public QuoteResponse getRateQuote(QuoteRequest quoteRequest, AuthenticationHeader authenticationHeader) {
        RateQuoteSoap rateQuoteSoap = new RateQuoteSoapImpl();
        return rateQuoteSoap.rateQuote(quoteRequest, authenticationHeader);
    }

    @SneakyThrows
    public QuoteResponse getRateQuoteByAccount(QuoteAccountRequest quoteAccountRequest, AuthenticationHeader authenticationHeader) {
        RateQuoteSoap rateQuoteSoap = new RateQuoteSoapImpl();
        return rateQuoteSoap.rateQuoteByAccount(quoteAccountRequest, authenticationHeader);
    }

    @SneakyThrows
    public QuoteResponse getRateQuoteByAccountByTerminal(QuoteAccountByTerminalRequest quoteAccountByTerminalRequest,
                                                         AuthenticationHeader authenticationHeader) {
        RateQuoteSoap rateQuoteSoap = new RateQuoteSoapImpl();
        return rateQuoteSoap.rateQuoteByAccountByTerminal(quoteAccountByTerminalRequest, authenticationHeader);
    }
}