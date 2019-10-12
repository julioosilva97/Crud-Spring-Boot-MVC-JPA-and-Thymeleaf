package com.example.demo.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.curso.boot.dao.DepartamentoDAO;
import com.example.demo.curso.boot.model.Departamento;

@Service
public class DeparamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDAO dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Departamento departamento) {
		// TODO Auto-generated method stub
		dao.save(departamento);
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Departamento departamento) {
		dao.update(departamento);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly = true)
	@Override
	public Departamento buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Departamento> burcarTodos() {
		return dao.findAll();
	}

	@Override
	public boolean departamentoTemCargos(Long id) {
		if(buscarPorId(id).getCargos().isEmpty()) { //ver se a lista get cargos desse id é vazia
			return false;
		}
		return true;
	}

	
}
