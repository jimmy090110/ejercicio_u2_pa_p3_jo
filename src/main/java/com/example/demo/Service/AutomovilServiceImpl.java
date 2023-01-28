package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.modelo.Automovil;


public class AutomovilServiceImpl implements IAutomovilService {
	
	@Autowired
	private IAutomovilService automovilService;

	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilService.insertar(automovil);
		
	}

	@Override
	public Automovil buscar(String placa) {
		// TODO Auto-generated method stub
		return this.automovilService.buscar(placa);
	}

}
