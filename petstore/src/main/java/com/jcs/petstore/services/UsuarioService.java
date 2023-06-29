package com.jcs.petstore.services;


import com.jcs.petstore.entities.Usuario;
import com.jcs.petstore.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder encoder;

    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario salvarUsuario(Usuario usuario){
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        return usuarioRepository.save(usuario);
    }

    public ResponseEntity<Boolean> validarLogin(String username, String senha){
        Optional<Usuario> optionalUsuario = usuarioRepository.findByUsername(username);
        if (optionalUsuario.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(false);
        }

        Usuario usuario = optionalUsuario.get();
        Boolean usuarioValidado = encoder.matches(senha,usuario.getSenha());

        HttpStatus status = HttpStatus.OK;

        return ResponseEntity.status(status).body(usuarioValidado);
    }
}
