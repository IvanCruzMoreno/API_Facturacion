package com.badbadcode.application.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badbadcode.application.model.dao.IFactDao;
import com.badbadcode.application.model.entity.Factura;

@Service
public class FactServiceImpl implements IFactService{

	@Autowired
	private IFactDao facturaDao;
	
	@Override
	public Iterable<Factura> findAll() {
		return facturaDao.findAll();
	}

}
