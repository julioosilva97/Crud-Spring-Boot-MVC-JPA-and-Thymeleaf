package com.example.demo.curso.boot.service;

import java.util.List;

import com.example.demo.curso.boot.model.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> burcarTodos();

	boolean cargoTemFuncionarios(Long id);
}
