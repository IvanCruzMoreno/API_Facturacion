package com.badbadcode.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badbadcode.application.model.entity.DetalleFactura;
import com.badbadcode.application.model.services.IDetallePService;

@RestController
@RequestMapping("/APIdetalle")
public class DetallePRestController {

	@Autowired
	private IDetallePService detalleService;
	
	@GetMapping("/factura")
	public Iterable<DetalleFactura> index(){
		return detalleService.findAll();
	}
}
