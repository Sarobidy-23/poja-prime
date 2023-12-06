package com.poja.prime.repository;

import com.poja.prime.repository.model.Prime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimeRepository extends JpaRepository<Prime, String> {
  List<Prime> findTop10ByOrderByCreationDatetimeDesc();
}
