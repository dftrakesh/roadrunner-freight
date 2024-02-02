package io.github.dftrakesh.roadrunner;

import io.github.dftrakesh.roadrunner.models.AuthenticationHeader;
import io.github.dftrakesh.roadrunner.models.QuoteAccountByTerminalRequest;
import io.github.dftrakesh.roadrunner.models.QuoteAccountRequest;
import io.github.dftrakesh.roadrunner.models.QuoteRequest;
import io.github.dftrakesh.roadrunner.models.QuoteResponse;
import io.github.dftrakesh.roadrunner.models.RateQuoteSoap;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
public class RateQuoteAPI {
    private final RateQuoteSoap rateQuoteSoap;

    @SneakyThrows
    public QuoteResponse getRateQuote(QuoteRequest quoteRequest, AuthenticationHeader authenticationHeader) {
        return rateQuoteSoap.rateQuote(quoteRequest, authenticationHeader);
    }

    @SneakyThrows
    public QuoteResponse getRateQuoteByAccount(QuoteAccountRequest quoteAccountRequest, AuthenticationHeader authenticationHeader) {
        return rateQuoteSoap.rateQuoteByAccount(quoteAccountRequest, authenticationHeader);
    }

    @SneakyThrows
    public QuoteResponse getRateQuoteByAccountByTerminal(QuoteAccountByTerminalRequest quoteAccountByTerminalRequest, AuthenticationHeader authenticationHeader) {
        return rateQuoteSoap.rateQuoteByAccountByTerminal(quoteAccountByTerminalRequest, authenticationHeader);
    }
}