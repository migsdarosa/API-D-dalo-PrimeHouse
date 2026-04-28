package com.senai.backend.dedalo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.dedalo.Models.cliente;
import com.senai.backend.dedalo.Repositories.clienteRepository;

@Service
public class clienteService {

    @Autowired
    private clienteRepository clienteRepository;

    public long contarClientes() {
        return clienteRepository.count();
    }

    public cliente buscarCliente(Integer id) {
        return clienteRepository.findById(id).get();
    }

    public List<cliente> listarCliente() {
        return clienteRepository.findAll();
    }

    public Boolean deletarCliente(Integer id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.existsById(id);
            return true;
        }
        return false;
    }

    public cliente cadastrarCliente(cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public cliente atualizarCliente(Integer id, cliente cliente) {
        cliente clienteRecuperado = buscarCliente(id);
        if (clienteRecuperado != null) {
            clienteRecuperado.setId(id);
            if (cliente.getNome() != null) {
                clienteRecuperado.setNome(cliente.getNome());
            }
            if (cliente.getCpf() != null) {
                clienteRecuperado.setCpf(cliente.getCpf());

            }
            if (cliente.getEmail() != null) {
                clienteRecuperado.setEmail(cliente.getEmail());

            }
            return clienteRepository.save(clienteRecuperado);

        }
        return null;

    }
}
