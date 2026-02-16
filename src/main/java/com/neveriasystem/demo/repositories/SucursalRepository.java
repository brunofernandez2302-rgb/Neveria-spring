package com.neveriasystem.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.neveriasystem.demo.models.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {
}

