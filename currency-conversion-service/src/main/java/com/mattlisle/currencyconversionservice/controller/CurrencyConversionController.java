package com.mattlisle.currencyconversionservice.controller;

import com.mattlisle.currencyconversionservice.entity.CurrencyConversion;
import com.mattlisle.currencyconversionservice.service.CurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

  @Autowired
  CurrencyConversionService service;

  @GetMapping
  CurrencyConversion convert(@RequestParam String from,
                             @RequestParam String to,
                             @RequestParam BigDecimal amount) throws Exception {
    return service.convert(from, to, amount);
  }
}
