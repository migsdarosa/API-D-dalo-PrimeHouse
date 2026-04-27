
package com.senai.backend.dedalo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.dedalo.Models.imoveis;

@Repository
public interface imoveisRepository extends JpaRepository<imoveis, Integer> {

    
}
