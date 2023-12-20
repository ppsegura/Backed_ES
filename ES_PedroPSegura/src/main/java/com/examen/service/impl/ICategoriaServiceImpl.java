package com.examen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.model.Categoria;
import com.examen.repository.ICategoriaRepository;
import com.examen.service.ICategoriaService;

@Service
public class ICategoriaServiceImpl implements ICategoriaService{

	@Autowired
	ICategoriaRepository iCategoriaRepository;
	
	@Override
	public List<Categoria> listar() {
		return iCategoriaRepository.findAll();
	}

	@Override
	public Categoria registrar(Categoria categoria) {
		return iCategoriaRepository.save(categoria);
	}

	@Override
	public Categoria actualizar(Categoria categoria) {
		return iCategoriaRepository.save(categoria);
	}

	@Override
	public void eliminar(int id) {
		iCategoriaRepository.deleteById(id);
	}

	@Override
	public Categoria listarPorId(int id) {
		return iCategoriaRepository.findById(id).get();
	}

}
