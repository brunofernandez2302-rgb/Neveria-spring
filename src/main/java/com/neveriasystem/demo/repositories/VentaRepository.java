package com.neveriasystem.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.neveriasystem.demo.models.Venta;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
}
