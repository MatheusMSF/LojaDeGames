package com.generation.lojadegames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categorias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(max = 255)
	private String nome;
	
	@NotNull
	@Size(max = 1000)
	private String descricao;
	// nome Varchar 255
	// descricao Varchar 1000
	
	@OneToMany(mappedBy = "categorias",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categorias")
	private List<Jogos> jogos;
	
}
