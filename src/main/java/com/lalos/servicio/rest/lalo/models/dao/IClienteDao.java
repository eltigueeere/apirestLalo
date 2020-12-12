package com.lalos.servicio.rest.lalo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lalos.servicio.rest.lalo.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
