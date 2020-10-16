package com.vaiDarBom.vaiDarBomPlataformaDeEstudos.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "postagem")
public class Postagem {

	/*
	 * ID PK
	 * Assunto String 
	 * NivelEnsino String DisciplinaMateria String ATIVO BOOL
	 * id_Tema ( Tema OBJ ) FK
	 */

	// Criando coluna/atributo id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	// Criando coluna/atributo 'ativo'
	@NotNull
	private boolean ativo;
	
	@ManyToOne
	@JsonIgnoreProperties ("postagem")
	private Tema tema;
	
	//@Size(min=1)
	private String imagem;
	
	//@Size(min=1)
	private String link;
	
	@Temporal(TemporalType.TIMESTAMP) 	
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	
	private int euLi;
	
	private String mensagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getEuLi() {
		return euLi;
	}

	public void setEuLi(int euLi) {
		this.euLi = euLi;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	

}