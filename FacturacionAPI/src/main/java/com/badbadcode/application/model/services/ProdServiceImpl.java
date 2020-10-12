package com.badbadcode.application.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badbadcode.application.model.dao.IProdDao;
import com.badbadcode.application.model.entity.Producto;

@Service
public class ProdServiceImpl implements IProdService{

	@Autowired
	private IProdDao productoDao;
	
	@Override
	public Iterable<Producto> findAll() {
		return productoDao.findAll();
	}

}
