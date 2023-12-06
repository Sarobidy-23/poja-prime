package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.repository.model.Prime;
import com.poja.prime.service.event.PrimeService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PrimeController {
  private final PrimeService service;

  @GetMapping("/new-prime")
  public Prime getPrime() {
    return service.newPrime();
  }
  @GetMapping("/generated-primes")
  public List<Prime> getLast() {
    return service.getLast();
  }
}
