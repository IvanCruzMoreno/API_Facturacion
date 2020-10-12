package com.badbadcode.application.model.services;

import com.badbadcode.application.model.entity.Producto;

public interface IProdService {

	public Iterable<Producto> findAll();
}
