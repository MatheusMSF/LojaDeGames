package com.generation.lojadegames.model;

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
@Table(name = "tb_jogo")
public class Jogos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(max = 255)
	private String nome;
	//nome varchar 255
	
	//descricao varchar 1000
	@Size(max = 1000)
	private String descricao; 
	
	@NotNull
	private int faixa_etaria;
	//faixa_etaria int
	
	@ManyToOne
	@JsonIgnoreProperties("jogos")
	private Jogos categorias;
	
	@ManyToOne
	@JsonIgnoreProperties("jogos")
	private Jogos usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getFaixa_etaria() {
		return faixa_etaria;
	}

	public void setFaixa_etaria(int faixa_etaria) {
		this.faixa_etaria = faixa_etaria;
	}

	public Jogos getCategorias() {
		return categorias;
	}

	public void setCategorias(Jogos categorias) {
		this.categorias = categorias;
	}

	public Jogos getUsuario() {
		return usuario;
	}

	public void setUsuario(Jogos usuario) {
		this.usuario = usuario;
	}
}
