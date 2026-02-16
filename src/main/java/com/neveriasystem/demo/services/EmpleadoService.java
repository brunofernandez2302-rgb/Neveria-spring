package com.neveriasystem.demo.services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.neveriasystem.demo.models.Empleado;
import com.neveriasystem.demo.repositories.EmpleadoRepository;

@Service
public class EmpleadoService {

    private final EmpleadoRepository repo;

    public EmpleadoService(EmpleadoRepository repo) {
        this.repo = repo;
    }

    public List<Empleado> listar() {
        return repo.findAll();
    }

    public Empleado guardar(Empleado empleado) {
        return repo.save(empleado);
    }

    public Empleado buscarPorId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}
