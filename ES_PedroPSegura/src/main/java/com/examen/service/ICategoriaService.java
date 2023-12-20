package com.examen.service;

import java.util.List;

import com.examen.model.Categoria;

public interface ICategoriaService {

	List<Categoria> listar();
	Categoria registrar(Categoria categoria);
	Categoria actualizar(Categoria categoria);
	Categoria listarPorId(int id);
	void eliminar(int id);
}
