package com.mattlisle.currencyexchangeservice.repo;

import com.mattlisle.currencyexchangeservice.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, String> {
}
