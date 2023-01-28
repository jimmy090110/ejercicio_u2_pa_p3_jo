package com.example.demo.Service;

import com.example.demo.modelo.Cliente;

public interface IClienteService {
	public void insertar(Cliente cliente);
	public Cliente buscar(String cedula);

}
