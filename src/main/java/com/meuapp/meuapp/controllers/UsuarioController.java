package com.meuapp.meuapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuapp.meuapp.models.Usuario;
import com.meuapp.meuapp.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService; 

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService; 
    }

    @PostMapping
    public Usuario criaUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuarioPorId(@PathVariable Long id) {
        return usuarioService.buscarUsuarioPorId(id);
    }

    @GetMapping("/all")
    public List<Usuario> buscarTodos() {
        return usuarioService.buscarTodosUsuarios(); 
    }



}
