  package com.poja.prime.service.event;

  import com.poja.prime.repository.PrimeRepository;
  import com.poja.prime.repository.model.Prime;
  import java.math.BigInteger;
  import java.util.List;
  import java.util.Random;
  import java.util.UUID;
  import lombok.AllArgsConstructor;
  import lombok.extern.slf4j.Slf4j;
  import org.springframework.stereotype.Service;
  @Service
  @AllArgsConstructor
  @Slf4j
  public class PrimeService {
    private final PrimeRepository repository;
    public Prime newPrime() {
      int PRIME_BITS = 100;
      return repository.save(Prime.builder()
          .id(UUID.randomUUID().toString())
          .value(BigInteger.probablePrime(PRIME_BITS, new Random()).toString())
          .build());
    }
    public List<Prime> getLast() {
      return repository.findTop10ByOrderByCreationDatetimeDesc();
    }
  }
