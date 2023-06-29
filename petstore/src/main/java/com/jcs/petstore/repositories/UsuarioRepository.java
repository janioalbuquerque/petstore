package com.jcs.petstore.repositories;

import com.jcs.petstore.entities.Pessoa;
import com.jcs.petstore.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



    public Optional<Usuario> findByUsername(String username);
}
