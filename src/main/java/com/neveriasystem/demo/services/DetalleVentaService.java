package com.neveriasystem.demo.services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.neveriasystem.demo.models.DetalleVenta;
import com.neveriasystem.demo.repositories.DetalleVentaRepository;

@Service
public class DetalleVentaService {

    private final DetalleVentaRepository repo;

    public DetalleVentaService(DetalleVentaRepository repo) {
        this.repo = repo;
    }

    public List<DetalleVenta> listar() {
        return repo.findAll();
    }

    public DetalleVenta guardar(DetalleVenta detalleVenta) {
        return repo.save(detalleVenta);
    }

    public DetalleVenta buscarPorId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}
