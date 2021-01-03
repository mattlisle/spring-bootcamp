package com.mattlisle.currencyexchangeservice.service;

import com.mattlisle.currencyexchangeservice.bean.ExchangeRate;
import com.mattlisle.currencyexchangeservice.entity.Currency;
import com.mattlisle.currencyexchangeservice.repo.CurrencyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
@Slf4j
public class ExchangeRateService {
  @Autowired
  CurrencyRepository repository;

  public Currency getCurrencyById(String id) throws Exception {
    return repository.findById(id).orElseThrow(Exception::new);
  }

  public ExchangeRate getExchangeRate(String fromId, String toId) throws Exception {
    BigDecimal fromUsdRate = getCurrencyById(fromId).getUsdRate();
    BigDecimal toUsdRate = getCurrencyById(toId).getUsdRate();
    BigDecimal rate = fromUsdRate.divide(toUsdRate, 3, RoundingMode.HALF_EVEN);
    return new ExchangeRate(fromId, toId, rate);
  }
}
