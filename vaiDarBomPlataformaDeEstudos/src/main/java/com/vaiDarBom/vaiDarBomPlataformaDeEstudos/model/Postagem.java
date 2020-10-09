package com.vaiDarBom.vaiDarBomPlataformaDeEstudos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Postagem")
public class Postagem {

	/*
	 * ID PK Assunto String NivelEnsino String DisciplinaMateria String ATIVO BOOL
	 * id_Tema ( Tema OBJ ) FK
	 */

	// Criando coluna/atributo id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	// Criando coluna/atributo 'assunto'
	@NotNull
	@Size(min = 1, max = 100)
	private String assunto;

	// Criando coluna/atributo 'nivelDeEnsino'
	@NotNull
	@Size(min = 1, max = 100)
	private String nivelEnsino;

	// Criando coluna/atributo 'disciplinaMateria'
	@NotNull
	@Size(min = 1, max = 100)
	private String disciplinaMateria;

	// Criando coluna/atributo 'ativo'
	@NotNull
	private boolean ativo;
	
	@ManyToOne
	@JsonIgnoreProperties ("postagem")
	private Tema tema;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getNivelEnsino() {
		return nivelEnsino;
	}

	public void setNivelEnsino(String nivelEnsino) {
		this.nivelEnsino = nivelEnsino;
	}

	public String getDisciplinaMateria() {
		return disciplinaMateria;
	}

	public void setDisciplinaMateria(String disciplinaMateria) {
		this.disciplinaMateria = disciplinaMateria;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}