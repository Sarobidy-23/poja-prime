package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.service.event.PrimeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PrimeController {
  private final PrimeService service;

  @GetMapping("/new-prime")
  public String getPrime() {
    return service.newPrime().getValue();
  }
}
