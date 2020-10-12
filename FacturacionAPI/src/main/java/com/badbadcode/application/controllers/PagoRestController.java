package com.badbadcode.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badbadcode.application.model.entity.FormaPago;
import com.badbadcode.application.model.services.IPagoService;

@RestController
@RequestMapping("/APIpago")
public class PagoRestController {

	@Autowired
	private IPagoService pagoService;
	
	@GetMapping("/formas")
	public Iterable<FormaPago> index(){
		return pagoService.findAll();
	}
	
}
