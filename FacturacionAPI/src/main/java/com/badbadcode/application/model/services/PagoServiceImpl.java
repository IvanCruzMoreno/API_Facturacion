package com.badbadcode.application.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badbadcode.application.model.dao.IPagoDao;
import com.badbadcode.application.model.entity.FormaPago;

@Service
public class PagoServiceImpl implements IPagoService{

	@Autowired
	private IPagoDao pagoDao;
	
	@Override
	public Iterable<FormaPago> findAll() {
		return pagoDao.findAll();
	}

}
