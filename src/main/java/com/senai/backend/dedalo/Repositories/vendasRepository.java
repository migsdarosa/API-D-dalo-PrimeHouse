package com.senai.backend.dedalo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.senai.backend.dedalo.Models.vendas;

@Repository
public interface vendasRepository extends JpaRepository<vendas, Integer> {
}
