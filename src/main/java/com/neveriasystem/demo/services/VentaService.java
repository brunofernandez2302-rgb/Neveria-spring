package com.neveriasystem.demo.services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.neveriasystem.demo.models.Venta;
import com.neveriasystem.demo.repositories.VentaRepository;

@Service
public class VentaService {

    private final VentaRepository repo;

    public VentaService(VentaRepository repo) {
        this.repo = repo;
    }

    public List<Venta> listar() {
        return repo.findAll();
    }

    public Venta guardar(Venta venta) {
        return repo.save(venta);
    }

    public Venta buscarPorId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}
