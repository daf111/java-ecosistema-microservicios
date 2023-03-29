package com.formacionbdi.springboot.app.productos.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.common.entities.Producto;
import com.formacionbdi.springboot.app.productos.models.service.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoService;

	@Value("${server.port}")
	private Integer puertoUtilizado;

	@GetMapping("/listar")
	public List<Producto> listar() {
		return productoService.FindAll().stream().map(producto -> {
			producto.setPuertoUtilizado(this.puertoUtilizado);
			return producto;
		}).collect(Collectors.toList());
	}

	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		Producto producto = productoService.findById(id);
		producto.setPuertoUtilizado(this.puertoUtilizado);
		return producto;
	}
}
