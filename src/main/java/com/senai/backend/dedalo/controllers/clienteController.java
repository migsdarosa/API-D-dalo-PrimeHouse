package com.senai.backend.dedalo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.dedalo.Models.cliente;
import com.senai.backend.dedalo.Services.clienteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/usuario")
public class clienteController {

    @Autowired
    private clienteService clienteService;

    @GetMapping("/contar-cliente")
    public long contarCliente() {
        return clienteService.contarClientes();
    }

    @GetMapping("/buscar_cliente/{id}")
    public cliente buscarCliente(@PathVariable Integer id) {
        return clienteService.buscarCliente(id);
    }

    @GetMapping("/listar-clientes")
    public List<cliente> listarCliente() {
        return clienteService.listarCliente();
    }

     @GetMapping("/deletar-cliente/{id}")
    public String deletarCliente(@PathVariable Integer id) {
        if (clienteService.deletarCliente(id)) {
            return "Cliente deletado com sucesso!";
        }
        return "Falha ao deletar cliente!";
    }

    @PostMapping("/salvar-cliente")
    public cliente cadastrarCliente(@RequestBody cliente cliente) {
        return clienteService.cadastrarCliente(cliente);
    }

    @PutMapping("/atualizar-cliente")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        
        
        return entity;
    }
    public String atualizarCliente(@PathVariable Integer id, @RequestBody cliente cliente) {
        if (clienteService.atualizarCliente(id, cliente) != null) {
            return "Cliente atualizado com sucesso!";
        }
        return "Falha ao atualizar cliente";
    }

}