package com.badbadcode.application.model.dao;

import com.badbadcode.application.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICliDao extends CrudRepository<Cliente,Long>{

}
