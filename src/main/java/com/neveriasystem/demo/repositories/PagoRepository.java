package com.neveriasystem.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.neveriasystem.demo.models.Pago;

public interface PagoRepository extends JpaRepository<Pago, Integer> {
}
