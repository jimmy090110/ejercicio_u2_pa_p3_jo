package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Service.IAutomovilService;
import com.example.demo.modelo.Automovil;

@SpringBootApplication
public class EjercicioU2PaP3JoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3JoApplication.class, args);
	}

	@Autowired
	private IAutomovilService automovilService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Automovil aut = new Automovil();
		aut.setPlaca("ASD1243");
		aut.setValorDia(new BigDecimal(10000));
		
		//this.automovilService.insertar(aut);
		
		
		
		
	}

}
