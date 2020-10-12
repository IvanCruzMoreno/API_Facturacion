package com.badbadcode.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badbadcode.application.model.entity.Factura;
import com.badbadcode.application.model.services.IFactService;

@RestController
@RequestMapping("/APIfactura")
public class FactController {

	@Autowired
	private IFactService facturaService;
	
	@GetMapping("/facturas")
	public Iterable<Factura> index(){
		return facturaService.findAll();
	}
}
