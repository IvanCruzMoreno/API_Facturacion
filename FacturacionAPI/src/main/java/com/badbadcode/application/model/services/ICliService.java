package com.badbadcode.application.model.services;

import com.badbadcode.application.model.entity.Cliente;

public interface ICliService {

	public Iterable<Cliente> findAll();
}
