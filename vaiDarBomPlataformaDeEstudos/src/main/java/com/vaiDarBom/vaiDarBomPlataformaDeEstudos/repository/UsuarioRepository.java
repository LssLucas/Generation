package com.vaiDarBom.vaiDarBomPlataformaDeEstudos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaiDarBom.vaiDarBomPlataformaDeEstudos.model.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome);
	//fazer com email

}
