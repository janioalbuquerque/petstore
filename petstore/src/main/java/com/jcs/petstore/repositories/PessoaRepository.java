package com.jcs.petstore.repositories;

import com.jcs.petstore.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
