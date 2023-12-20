package com.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.model.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>{

}
