package com.codearl.cancinero.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="song")
public class Song implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -7626560619459238044L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String author;
	private String genre;
    @Column(columnDefinition = "TEXT")
	private String content;
 //TODO: Investigar campos de creación de datos
    
	//Objeto para hacer referencia a todo el objeto de categoria
	//Relacion con Categoria muchos a uno
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JsonIgnoreProperties ({"hibernateLazyInitializer", "handler"})
	private User user;
	
	
	

}
