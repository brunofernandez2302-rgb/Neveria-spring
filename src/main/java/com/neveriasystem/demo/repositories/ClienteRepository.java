package com.neveriasystem.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.neveriasystem.demo.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
