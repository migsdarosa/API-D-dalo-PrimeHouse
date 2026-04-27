package com.senai.backend.dedalo.Models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendas")
public class vendas {

    @Id
    @GeneratedValue
    @Column(name = "id_venda")
    private Integer id;

    @OneToMany
    @JoinColumn(name = "imovel_venda")
    private String imovel;

    @OneToMany
    @JoinColumn(name = "comprador_venda")
    private String comprador;

    @OneToMany
    @JoinColumn(name = "data_venda")
    private LocalDate data;

    public vendas() {
    }

    public vendas(Integer id, String imovel, String comprador, LocalDate data) {
        this.id = id;
        this.imovel = imovel;
        this.comprador = comprador;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImovel() {
        return imovel;
    }

    public void setImovel(String imovel) {
        this.imovel = imovel;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    



    
}
