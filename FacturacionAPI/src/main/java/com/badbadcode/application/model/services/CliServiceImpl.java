package com.badbadcode.application.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badbadcode.application.model.dao.ICliDao;
import com.badbadcode.application.model.entity.Cliente;

@Service
public class CliServiceImpl implements ICliService{

	@Autowired
	private ICliDao clienteDao;
	
	@Override
	public Iterable<Cliente> findAll() {
		return clienteDao.findAll();
	}
	
	

}
