package com.senai.backend.dedalo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.dedalo.Models.imoveis;
import com.senai.backend.dedalo.Services.imoveisService;


@RestController
@RequestMapping("/imoveis")
public class imoveisController {

    @Autowired
    private imoveisService imoveisService;

    @GetMapping("/contar-imoveis")
    public long contarImoveis() {
        return imoveisService.contarImoveis();
    }

    @GetMapping("/buscar_imoveis/{id}")
    public imoveis buscarImoveis(@PathVariable Integer id) {
        return imoveisService.buscarImoveis(id);
    }

    @GetMapping("/listar-imoveis")
    public List<imoveis> listarImoveis() {
        return imoveisService.listarImoveis();
    }

     @GetMapping("/deletar-imovel/{id}")
    public String deletarImoveis(@PathVariable Integer id) {
        if (imoveisService.deletarImoveis(id)) {
            return "Imovel deletado com sucesso!";
        }
        return "Falha ao deletar imovel!";
    }

    @PostMapping("/salvar-imoveis")
    public imoveis cadastrarImoveis(@RequestBody imoveis imoveis) {
        return imoveisService.cadastrarImoveis(imoveis);
    }

    @PutMapping("/atualizar-imoveis")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        
        
        return entity;
    }
    public String atualizarImoveis(@PathVariable Integer id, @RequestBody imoveis imoveis) {
        if (imoveisService.atualizarImoveis(id, imoveis) != null) {
            return "Imovel atualizado com sucesso!";
        }
        return "Falha ao atualizar Imovel!";
    }

}
