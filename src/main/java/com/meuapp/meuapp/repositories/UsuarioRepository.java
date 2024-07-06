package com.meuapp.meuapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuapp.meuapp.models.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

}
