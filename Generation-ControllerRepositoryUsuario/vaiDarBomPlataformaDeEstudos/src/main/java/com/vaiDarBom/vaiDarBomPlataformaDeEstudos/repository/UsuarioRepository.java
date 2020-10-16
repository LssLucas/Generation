package com.vaiDarBom.vaiDarBomPlataformaDeEstudos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaiDarBom.vaiDarBomPlataformaDeEstudos.model.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome);
	//fazer com email
	
	//metodo criado por requisição UsuarioService linha 35
	public Optional<Usuario> findByUsuario(String nome);
}
