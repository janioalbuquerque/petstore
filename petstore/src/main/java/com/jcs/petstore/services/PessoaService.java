package com.jcs.petstore.services;

import com.jcs.petstore.entities.Pessoa;
import com.jcs.petstore.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarPessoas(){
        return pessoaRepository.findAll();
    }
}
