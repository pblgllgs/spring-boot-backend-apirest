package com.pblgllgs.spring.boot.backend.apirest.models.dao;

import com.pblgllgs.spring.boot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
