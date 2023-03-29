package com.formacionbdi.springboot.app.common.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "productos")
public class Producto implements Serializable{

	private static final long serialVersionUID = 1285454306356845809L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private Double precio;
	
	@Column(name = "created_at")
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	
	@Transient
	private Integer puertoUtilizado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createAt) {
		this.createdAt = createAt;
	}
	
	public Integer getPuertoUtilizado() {
		return this.puertoUtilizado;
	}
	public void setPuertoUtilizado(Integer port) {
		this.puertoUtilizado = port;
	}

}
