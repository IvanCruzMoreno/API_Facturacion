package com.badbadcode.application.model.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.badbadcode.application.model.entity.DetalleFactura;

@Repository
public interface IDetallePDAO extends CrudRepository<DetalleFactura, Long>{
	
	@Query(value = "{call detalleFac_findById(:id)}", nativeQuery = true)
	Iterable<DetalleFactura> findAllStoredProcedure(@Param("id") Long id);

	@Query(value = "{call detalle_producto_AreThereStock(:num_fact, :cod_prod, :cantidad)}", nativeQuery = true)
	void updateProductoAndDetalleFac(@Param("num_fact") int num_fact,
									 @Param("cod_prod") int cod_prod,
								   	 @Param("cantidad") int cantidad);
	
	@Query(value = "{call detalleFac_delete(:id_fac, :tipo_p)}", nativeQuery = true)
	Iterable<DetalleFactura> deleteByIdDetalle_IdProduto(@Param("id_fac") int id_fac, @Param("tipo_p") int tipo_p);
}
