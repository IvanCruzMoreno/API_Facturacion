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
	public String calculateProducto_DetalleFac(int num_fact, int cod_prod, int cantidad) {
		try {
			detalleDao.updateProductoAndDetalleFac(num_fact, cod_prod, cantidad);
			return "Query exitosa";
		} catch (Exception e) {
			return "Error encontrado\n Revisa el stock de producto";
		}
	}

	@Override
	public Iterable<DetalleFactura> deleteDetalleFac(int id_fac, int tipo_prod) {
		
		//detalleDao.deleteById(id_fac);
		try {
			return detalleDao.deleteByIdDetalle_IdProduto(id_fac, tipo_prod);
		}catch(Exception e) {
			System.out.println("Error al interar eliminar");
			return null;
		}
		
	}



}
