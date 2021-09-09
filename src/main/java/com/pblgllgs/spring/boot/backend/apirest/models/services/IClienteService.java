package com.pblgllgs.spring.boot.backend.apirest.models.services;

import com.pblgllgs.spring.boot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> findAll();

}
