package com.badbadcode.application.model.services;

import com.badbadcode.application.model.entity.DetalleFactura;

public interface IDetallePService {

	public Iterable<DetalleFactura> findAll();
}
