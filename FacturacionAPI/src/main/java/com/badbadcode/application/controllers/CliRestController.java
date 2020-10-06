package com.badbadcode.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badbadcode.application.model.entity.Cliente;
import com.badbadcode.application.model.services.ICliService;

@RestController
@RequestMapping("/APIfactura")
public class CliRestController {
	
	@Autowired
	private ICliService clienteService;
	
	@GetMapping("/clientes")
	public Iterable<Cliente> index(){
		return clienteService.findAll();
	}
	
}
