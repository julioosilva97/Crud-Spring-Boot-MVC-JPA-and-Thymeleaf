package com.example.demo.curso.boot.service;

import java.util.List;

import com.example.demo.curso.boot.model.Departamento;

public interface DepartamentoService {

	void salvar(Departamento departamento);

	void editar(Departamento departamento);

	void excluir(Long id);

	Departamento buscarPorId(Long id);

	List<Departamento> burcarTodos();

	boolean departamentoTemCargos(Long id);
}
