package com.badbadcode.application.model.services;

import com.badbadcode.application.model.entity.FormaPago;

public interface IPagoService {

	public Iterable<FormaPago> findAll();
}
