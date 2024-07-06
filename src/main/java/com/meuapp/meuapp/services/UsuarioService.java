package com.meuapp.meuapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuapp.meuapp.models.Usuario;
import com.meuapp.meuapp.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public List<Usuario> buscarTodosUsuarios() {
        return usuarioRepository.findAll();
    }

}
