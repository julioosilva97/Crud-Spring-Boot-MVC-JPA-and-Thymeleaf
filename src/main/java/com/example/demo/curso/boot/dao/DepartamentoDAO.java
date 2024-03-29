package com.example.demo.curso.boot.dao;

import java.util.List;

import com.example.demo.curso.boot.model.Departamento;
public interface DepartamentoDAO {

	void save(Departamento departamento);

	void update(Departamento departamento);

	void delete(Long id);

	Departamento findById(Long id);

	List<Departamento> findAll();
}
