package com.example.demo.Service;

import com.example.demo.modelo.Automovil;

public interface IAutomovilService {
	public void insertar(Automovil automovil);
	public Automovil buscar(String placa);


}
