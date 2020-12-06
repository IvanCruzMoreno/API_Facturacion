package com.badbadcode.application.model.dao;

import com.badbadcode.application.model.entity.Cliente;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICliDao extends CrudRepository<Cliente,Long>{
	@Query(value = "{call prueba(:id)}", nativeQuery = true)
	Iterable<Cliente> getTotalClientesMayoresById (@Param("id") int id_cli);
}
