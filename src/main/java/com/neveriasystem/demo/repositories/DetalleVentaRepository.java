package com.neveriasystem.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.neveriasystem.demo.models.DetalleVenta;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {
}
