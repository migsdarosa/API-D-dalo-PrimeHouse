package com.senai.backend.dedalo.Models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "imoveis")

public class imoveis {
    
@Id
@GeneratedValue
@Column(name = "id_imovel")
private Integer id;

@Column( name = "valor_imovel")
private Double valor;

@Column(name = "bairro_imovel")
private String bairro;

@OneToMany
@JoinColumn(name = "proprietario")
private List<cliente> proprietario;

public imoveis() {
}

public imoveis(Integer id, Double valor, String bairro, List<cliente> proprietario) {
    this.id = id;
    this.valor = valor;
    this.bairro = bairro;
    this.proprietario = proprietario;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public Double getValor() {
    return valor;
}

public void setValor(Double valor) {
    this.valor = valor;
}

public String getBairro() {
    return bairro;
}

public void setBairro(String bairro) {
    this.bairro = bairro;
}

public List<cliente> getProprietario() {
    return proprietario;
}

public void setProprietario(List<cliente> proprietario) {
    this.proprietario = proprietario;
}


}

