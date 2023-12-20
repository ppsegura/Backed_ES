package com.examen.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="docente")
public class Docente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_docente")
	private int id_docente;
	
	@Column(name="nombre", length = 45)
	private String nombre;
	
	@Column(name="dni", length = 8)
	private String dni;
	
	@Column(name="fecha_nacimiento")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fecha_nacimiento;
	
	@Column(name="sueldo")
	private double sueldo;
	
	@Column(name="email", length = 45)
	private String email;
	
	@Column(name="sexo", length = 45)
	private String sexo;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "doc_categoria", joinColumns = @JoinColumn(name = "id_docente"), inverseJoinColumns = @JoinColumn(name = "id_categoria"))
	private List<Categoria> categoria;

}
