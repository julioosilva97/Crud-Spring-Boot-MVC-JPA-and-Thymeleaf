package com.example.demo.curso.boot.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.demo.curso.boot.util.AbstractEntity;


@SuppressWarnings("serial")
@Entity
@Table(name= "DEPARTAMENTOS") // nome da tabela no bd
public class Departamento extends AbstractEntity<Long> {
	
	@NotBlank(message = "Informe um nome.")
	@Size(min = 3,max = 60, message = "O nome do departamento deve ter entre {min} e {max} caracteres.")
	@Column(name="nome", nullable = false, unique = true, length=60)
	private String nome;

	@OneToMany(mappedBy = "departamento") //onetomany = um cargo para vários deparamentos, mappedby = atributo mais forte(o lado que tem a chave estrangueira)
	private List<Cargo> cargos;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}
	
	

}
