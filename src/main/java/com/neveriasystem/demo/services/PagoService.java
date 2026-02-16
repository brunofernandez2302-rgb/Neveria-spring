package com.neveriasystem.demo.services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.neveriasystem.demo.models.Pago;
import com.neveriasystem.demo.repositories.PagoRepository;

@Service
public class PagoService {

    private final PagoRepository repo;

    public PagoService(PagoRepository repo) {
        this.repo = repo;
    }

    public List<Pago> listar() {
        return repo.findAll();
    }

    public Pago guardar(Pago pago) {
        return repo.save(pago);
    }

    public Pago buscarPorId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}
