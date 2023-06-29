package com.jcs.petstore.controllers;

import com.jcs.petstore.dto.Login;
import com.jcs.petstore.entities.Pessoa;
import com.jcs.petstore.entities.Usuario;
import com.jcs.petstore.services.PessoaService;
import com.jcs.petstore.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "usuarioController")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @ResponseBody
    @RequestMapping(value = "listarUsuarios")
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping("/salvarUsuario")
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioCriado = usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok(usuarioCriado);
    }

    @RequestMapping("/validarLogin")
    public ResponseEntity<Boolean> validarLogin(@RequestParam String username, @RequestParam String senha){
       return usuarioService.validarLogin(username, senha);
    }
}
