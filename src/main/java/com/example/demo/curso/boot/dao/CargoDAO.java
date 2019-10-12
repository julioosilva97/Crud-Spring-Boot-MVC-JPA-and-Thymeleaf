package com.example.demo.curso.boot.dao;

import java.util.List;

import com.example.demo.curso.boot.model.Cargo;

public interface CargoDAO {
	
	void save(Cargo cargo);

	void update(Cargo cargo);

	void delete(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();

}
