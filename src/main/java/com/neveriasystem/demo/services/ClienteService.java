package com.neveriasystem.demo.services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.neveriasystem.demo.models.Cliente;
import com.neveriasystem.demo.repositories.ClienteRepository;

@Service
public class ClienteService {

    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }

    public List<Cliente> listar() {
        return repo.findAll();
    }

    public Cliente guardar(Cliente cliente) {
        return repo.save(cliente);
    }

    public Cliente buscarPorId(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}
