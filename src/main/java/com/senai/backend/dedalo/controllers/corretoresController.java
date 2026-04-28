package com.senai.backend.dedalo.controllers;
import org.springframework.web.bind.annotation.RestController;
import com.senai.backend.dedalo.Models.corretores;
import com.senai.backend.dedalo.Services.corretoresService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/corretores")
public class corretoresController {

    @Autowired
    private corretoresService corretoresService;

    @GetMapping("/contar-corretores")
    public long contarCorretores() {
        return corretoresService.contarCorretores();
    }

    @GetMapping("/buscar_corretores/{id}")
    public corretores buscarImoveis(@PathVariable Integer id) {
        return corretoresService.buscarCorretores(id);
    }

    @GetMapping("/listar-corretores")
    public List<corretores> listarCorretores() {
        return corretoresService.listarCorretores();
    }

     @GetMapping("/deletar-corretores/{id}")
    public String deletarCorretores(@PathVariable Integer id) {
        if (corretoresService.deletarCorretores(id)) {
            return "Corretor deletado com sucesso!";
        }
        return "Falha ao deletar corretor!";
    }

    @PostMapping("/salvar-corretores")
    public corretores cadastrarCorretores(@RequestBody corretores corretores) {
        return corretoresService.cadastrarCorretores(corretores);
    }

    @PutMapping("/atualizar-corretores")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        
        
        return entity;
    }
    public String atualizar(@PathVariable Integer id, @RequestBody corretores corretores) {
        if (corretoresService.atualizarCorretores(id, corretores) != null) {
            return "Corretor atualizado com sucesso!";
        }
        return "Falha ao atualizar corretor!";
    }

}