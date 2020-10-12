package com.badbadcode.application.model.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.badbadcode.application.model.entity.DetalleFactura;

@Repository
public interface IDetallePDAO extends CrudRepository<DetalleFactura, Long>{

}
