package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.common.entities.Producto;

public interface IProductoService {
	public List<Producto> FindAll();
	public Producto findById(Long id);
}
