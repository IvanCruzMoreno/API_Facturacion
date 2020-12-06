package com.badbadcode.application.model.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.badbadcode.application.model.entity.Factura;

@Repository
public interface IFactDao extends CrudRepository<Factura, Long>{
	
	@Query(value = "{call factura_addFacturaToCliente(:id)}", nativeQuery = true)
	Iterable<Factura> createRandomFacturaToClienteById(@Param("id") int id_cli);
	
	@Query(value = "{call factura_RFCFormaPago(:num_fac, :rfc_fac, :formapago)}", nativeQuery = true)
	Iterable<Factura> updateFacturaFinished(@Param("num_fac") int num_fac, @Param("rfc_fac") String rfc_fac, @Param("formapago") int formapago );
	
}
