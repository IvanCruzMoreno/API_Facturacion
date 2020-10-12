package com.badbadcode.application.model.services;

import com.badbadcode.application.model.entity.Factura;

public interface IFactService {

	public Iterable<Factura> findAll();
	
}
