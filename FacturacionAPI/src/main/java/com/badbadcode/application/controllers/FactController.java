package com.badbadcode.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	@PostMapping("/facturas/{id_cli}")
	public Iterable<Factura> createFactura(@PathVariable String id_cli){
		return facturaService.createRandomFactura(Integer.parseInt(id_cli));
	}
	@PostMapping("/facturas/{num_fac}/{rfc_fac}/{formapago}")
	public Iterable<Factura> facturaFinished(@PathVariable String num_fac, @PathVariable("rfc_fac") String rfc_fac, @PathVariable String formapago){
		return facturaService.updateFactura(Integer.parseInt(num_fac), rfc_fac.replace(" ", ""), Integer.parseInt(formapago));
	}
}
