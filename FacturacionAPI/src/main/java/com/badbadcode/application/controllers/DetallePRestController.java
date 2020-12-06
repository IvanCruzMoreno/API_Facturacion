package com.badbadcode.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	@PostMapping("/factura/{num_fact}/{cod_prod}/{cantidad}")
	public String createDetalleFac(@PathVariable String num_fact, @PathVariable String cod_prod, @PathVariable String cantidad) {
		return detalleService.calculateProducto_DetalleFac(Integer.parseInt(num_fact), 
														   Integer.parseInt(cod_prod), 
														   Integer.parseInt(cantidad));
	}
	@DeleteMapping("/factura/{id_detalle}/{tipo_prod}")
	public Iterable<DetalleFactura> deleteDetalleFac(@PathVariable String id_detalle, @PathVariable String tipo_prod) {
		return detalleService.deleteDetalleFac(Integer.parseInt(id_detalle), Integer.parseInt(tipo_prod)); 
	}
}
