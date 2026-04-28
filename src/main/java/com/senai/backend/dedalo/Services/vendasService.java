package com.senai.backend.dedalo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.dedalo.Models.vendas;
import com.senai.backend.dedalo.Repositories.vendasRepository;

@Service
public class vendasService {

    @Autowired
    private vendasRepository vendasRepository;

    public long contarVendas() {
        return vendasRepository.count();
    }

    public vendas buscarVendas(Integer id) {
        return vendasRepository.findById(id).get();

    }

    public List<vendas> listarvendas() {
        return vendasRepository.findAll();
    }

    public Boolean deletarVendas(Integer id) {
        if (vendasRepository.existsById(id)) {
            vendasRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public vendas cadatrarVendas(vendas vendas) {
        return vendasRepository.save(vendas);

    }

    public vendas atualizarVendas(Integer id, vendas vendas) {
        vendas vendasRecuperado = buscarVendas(id);
        if (vendasRecuperado != null) {
            vendasRecuperado.setId(id);
            if (vendas.getId() != null) {
                vendasRecuperado.setId(vendas.getId());

            }
            if (vendas.getImovel() != null) {
                vendasRecuperado.setImovel(vendas.getImovel());
            }
            if (vendas.getComprador() != null) {
                vendasRecuperado.setComprador(vendas.getComprador());
            }
            if (vendas.getData() != null) {
                vendasRecuperado.setData(vendas.getData());
            }
            
            return vendasRepository.save(vendasRecuperado);
        }
        return null;

    }
}

