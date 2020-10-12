package com.badbadcode.application.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badbadcode.application.model.dao.IDetallePDAO;
import com.badbadcode.application.model.entity.DetalleFactura;

@Service
public class DetallePServiceImpl implements IDetallePService{

	@Autowired
	private IDetallePDAO detalleDao;
	
	@Override
	public Iterable<DetalleFactura> findAll() {
		return detalleDao.findAll();
	}

}
