package com.mattlisle.currencyconversionservice.service;

import com.mattlisle.currencyconversionservice.entity.CurrencyConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.net.URI;
import java.util.Optional;

@Service
public class CurrencyConversionService {

  @Autowired
  private RestTemplate restTemplate;

  @Value("${currency-conversion-service.exchange-rate-url}")
  private String exchangeRateUrl;

  public CurrencyConversion convert(String from, String to, BigDecimal amount) throws Exception {
    URI uri = UriComponentsBuilder.fromUriString(exchangeRateUrl)
        .queryParam("from", from)
        .queryParam("to", to)
        .build()
        .toUri();
    CurrencyConversion conversion =
        Optional.ofNullable(restTemplate.getForObject(uri, CurrencyConversion.class))
          .orElseThrow(Exception::new);
    conversion.setAmounts(amount);
    return conversion;
  }
}
