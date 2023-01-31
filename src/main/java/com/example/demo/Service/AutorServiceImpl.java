package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repository.IAutorRepo;
import com.example.demo.modelo.Autor;

public class AutorServiceImpl implements IAutorService {

	@Autowired
	private IAutorRepo autorRepo;
	
	@Override
	public void agregar(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepo.insertar(autor);
	}

}
