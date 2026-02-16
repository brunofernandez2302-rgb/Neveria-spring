package com.neveriasystem.demo.services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.neveriasystem.demo.models.Sucursal;
import com.neveriasystem.demo.repositories.SucursalRepository;

@Service
public class SucursalService {

    private final SucursalRepository repo;

    public SucursalService(SucursalRepository repo) {
        this.repo = repo;
    }

    public List<Sucursal> listar() {
        return repo.findAll();
    }

    public Sucursal guardar(Sucursal sucursal) {
        return repo.save(sucursal);
    }

    public Sucursal buscarPorId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}
