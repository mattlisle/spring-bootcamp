package com.mattlisle.limitsservice.controller;

import com.mattlisle.limitsservice.config.LimitsConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LimitsConfigurationController {

  @Autowired LimitsConfiguration limitsConfiguration;

  @GetMapping("/limits")
  public LimitsConfiguration retrieveLimits() {
    return limitsConfiguration;
  }

}
