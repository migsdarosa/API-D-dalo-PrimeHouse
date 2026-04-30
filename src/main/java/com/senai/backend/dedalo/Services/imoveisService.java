package com.senai.backend.dedalo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.dedalo.Models.imoveis;
import com.senai.backend.dedalo.Models.vendas;
import com.senai.backend.dedalo.Repositories.imoveisRepository;

@Service
public class imoveisService {

    public static vendas cadastrarVendas(vendas vendas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Autowired
    private imoveisRepository imoveisRepository;

    public long contarImoveis() {
        return imoveisRepository.count();
    }

    public imoveis buscarImoveis(Integer id) {
        return imoveisRepository.findById(id).get();

    }

    public List<imoveis> listarImoveis() {
        return imoveisRepository.findAll();
    }

    public Boolean deletarImoveis(Integer id) {
        if (imoveisRepository.existsById(id)) {
            imoveisRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public imoveis cadastrarImoveis(imoveis imoveis) {
        return imoveisRepository.save(imoveis);

    }

    public imoveis atualizarImoveis(Integer id, imoveis imoveis) {
        imoveis imoveisRecuperado = buscarImoveis(id);
        if (imoveisRecuperado != null) {
            imoveisRecuperado.setId(id);
            if (imoveis.getId() != null) {
                imoveisRecuperado.setId(imoveis.getId());

            }
            if (imoveis.getValor() != null) {
                imoveisRecuperado.setValor(imoveis.getValor());
            }
            if (imoveis.getProprietario() != null) {
                imoveisRecuperado.setProprietario(imoveis.getProprietario());
            }
            return imoveisRepository.save(imoveisRecuperado);
        }
        return null;

    }
}
