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

	@Override
	public Iterable<Factura> createRandomFactura(int id_cli) {
		return facturaDao.createRandomFacturaToClienteById(id_cli);
	}

	@Override
	public Iterable<Factura> updateFactura(int num_fac, String rfc_fac, int formapago) {
		try {
			return facturaDao.updateFacturaFinished(num_fac, rfc_fac, formapago);
		} catch (Exception e) {
			System.out.println("No se finalizo correctamente la factura");
			return null;
		}
	}
	

}
