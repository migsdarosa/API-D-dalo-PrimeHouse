package com.senai.backend.dedalo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.dedalo.Models.corretores;
import com.senai.backend.dedalo.Repositories.corretorRepository;

@Service
public class corretoresService {

    @Autowired
    private corretorRepository corretoresRepository;

    public long contarCorretores() {
        return corretoresRepository.count();
    }

    public corretores buscarCorretores(Integer id) {
        return corretoresRepository.findById(id).get();

    }

    public List<corretores> listarCorretores() {
        return corretoresRepository.findAll();
    }

    public Boolean deletarCorretores(Integer id) {
        if (corretoresRepository.existsById(id)) {
            corretoresRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public corretores cadastrarCorretores(corretores corretores) {
        return corretoresRepository.save(corretores);

    }

    public corretores atualizarCorretores(Integer id, corretores corretores) {
        corretores corretoresRecuperado = buscarCorretores(id);
        if (corretoresRecuperado != null) {
            corretoresRecuperado.setId(id);
            if (corretores.getId() != null) {
                corretoresRecuperado.setId(corretores.getId());

            }
            if (corretores.getNome() != null) {
                corretoresRecuperado.setNome(corretores.getNome());
            }
            return corretoresRepository.save(corretoresRecuperado);

    }
    return null;
}
}

