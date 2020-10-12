package com.badbadcode.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badbadcode.application.model.entity.Producto;
import com.badbadcode.application.model.services.IProdService;

@RestController
@RequestMapping("/APIproducto")
public class ProdRestController {

	@Autowired
	private IProdService productoService;
	
	@GetMapping("/productos")
	public Iterable<Producto> index(){
		return productoService.findAll();
	}
}
