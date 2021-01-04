package com.mattlisle.currencyconversionservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConversion {

  private String from;

  private String to;

  private BigDecimal rate;

  private BigDecimal fromAmount;

  private BigDecimal toAmount;

  public void setAmounts(BigDecimal fromAmount) {
    this.fromAmount = fromAmount;
    this.toAmount = fromAmount.multiply(rate);
  }
}
