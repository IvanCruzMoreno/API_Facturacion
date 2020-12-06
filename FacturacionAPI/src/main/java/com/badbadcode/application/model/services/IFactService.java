package com.badbadcode.application.model.services;


import java.util.Optional;

import com.badbadcode.application.model.entity.Factura;

public interface IFactService {
	
	public Optional<Factura> findBy_Id(Long id);
	public Iterable<Factura> findAll();
	public Iterable<Factura> createRandomFactura(int id_cli);
	public Iterable<Factura> updateFactura(int num_fac, String rfc_fac, int formapago );
	
}
