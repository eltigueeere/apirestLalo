package com.lalos.servicio.rest.lalo.models.services;

import java.util.List;

import com.lalos.servicio.rest.lalo.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	
}
