package com.badbadcode.application.model.services;


import com.badbadcode.application.model.entity.DetalleFactura;

public interface IDetallePService {

	public String calculateProducto_DetalleFac(int num_fact, int cod_prod, int cantidad);
	public Iterable<DetalleFactura> deleteDetalleFac(int id_fac, int tipo_prod);
	
}
