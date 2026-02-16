package com.neveriasystem.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.neveriasystem.demo.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
