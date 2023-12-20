package com.examen.service;

import java.util.List;

import com.examen.model.Docente;

public interface IDocenteService {

	List<Docente> listar();
	Docente registrar(Docente docente);
	Docente actualizar(Docente docente);
	Docente listarPorId(int id);
	void eliminar(int id);
	
}
