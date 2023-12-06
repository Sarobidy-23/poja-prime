package com.poja.prime.repository;

import com.poja.prime.repository.model.Prime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimeRepository extends JpaRepository<Prime, String> {
}
