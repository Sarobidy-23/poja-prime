package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.conf.FacadeIT;
import com.poja.prime.repository.model.Prime;
import java.math.BigInteger;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class PrimeControllerIT extends FacadeIT {
  @Autowired
  PrimeController primeController;

  @Test
  @Order(1)
  void get_new_prime_ok() {
    Prime generatedPrime = primeController.getPrime();
    BigInteger probablePrime = new BigInteger(generatedPrime.getValue());
    assertTrue(probablePrime.isProbablePrime(100));
  }
  @Test
  @Order(2)
  void get_last_prime_list_ok() {
    int EXPECTED_PRIME_LENGTH = 10;
    for (int i = 0; i < 13; i++) {
      primeController.getPrime();
    }
    List<Prime> primeList = primeController.getLast();
    assertEquals(primeList.size(), EXPECTED_PRIME_LENGTH);
  }
}
