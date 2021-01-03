package com.mattlisle.currencyexchangeservice.controller;

import com.mattlisle.currencyexchangeservice.bean.ExchangeRate;
import com.mattlisle.currencyexchangeservice.entity.Currency;
import com.mattlisle.currencyexchangeservice.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("exchange")
public class ExchangeRateController {

  @Autowired
  ExchangeRateService service;

  @GetMapping
  ExchangeRate getExchangeRate(@RequestParam String from, @RequestParam String to) throws Exception {
    return service.getExchangeRate(from, to);
  }
}
