package com.jcs.petstore.controllers;

import com.jcs.petstore.entities.Pessoa;
import com.jcs.petstore.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "pessoaController")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @ResponseBody
    @RequestMapping(value = "listarPessoas")
    public ResponseEntity<List<Pessoa>> listarPessoas(){
        List<Pessoa> pessoas = pessoaService.listarPessoas();
        return ResponseEntity.ok(pessoas);
    }
}
