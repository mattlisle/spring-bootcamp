package com.mattlisle.currencyexchangeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
public class Currency {

  @Id
  private String id;

  @Column(name = "USD_RATE")
  private BigDecimal usdRate;

}
