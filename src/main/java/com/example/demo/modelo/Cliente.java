package com.example.demo.modelo;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@Column(name="cli_cedula")
	private String cedula;
	
	@Column(name="cli_nomre")
	private String nombre;
	
	
	@OneToMany(mappedBy = "cliente")
	private List<Renta>rentalist;


	
	
	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", rentalist=" + rentalist + "]";
	}


	//Get and Set
	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Renta> getRentalist() {
		return rentalist;
	}


	public void setRentalist(List<Renta> rentalist) {
		this.rentalist = rentalist;
	}
	
	
	
}
