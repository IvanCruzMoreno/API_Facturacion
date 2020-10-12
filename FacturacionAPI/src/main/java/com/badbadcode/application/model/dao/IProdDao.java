package com.badbadcode.application.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.badbadcode.application.model.entity.Producto;

@Repository
public interface IProdDao  extends CrudRepository<Producto, Long>{
	

}
