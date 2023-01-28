package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Renta;


@Service
public class RentaServiceImpl implements IRentaService {

	@Autowired
	private IRentaService rentaService;
	
	@Override
	public void insertar(Renta renta) {
		// TODO Auto-generated method stub
		this.rentaService.insertar(renta);
		
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.rentaService.buscar(id);
	}

}
