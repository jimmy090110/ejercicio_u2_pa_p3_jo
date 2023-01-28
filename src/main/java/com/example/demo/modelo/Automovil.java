package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;



@Entity
@Table(name = "automovil")
public class Automovil {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "aut_seq")
	@SequenceGenerator(name = "aut_seq",sequenceName = "aut_seq",allocationSize = 1)
	@Column(name="aut_id")
	private Integer id;
	
	@Column(name="aut_placa")
	private String placa;
	
	@Column(name="aut_valor_dias")
	private BigDecimal valorDia;
	
	@OneToMany(mappedBy = "automovil")
	private List<Renta>rentalist;
	

	@Override
	public String toString() {
		return "Automovil [id=" + id + ", placa=" + placa + ", valorDia=" + valorDia + ", rentalist=" + rentalist + "]";
	}

	//Get and Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getValorDia() {
		return valorDia;
	}

	public void setValorDia(BigDecimal valorDia) {
		this.valorDia = valorDia;
	}

	public List<Renta> getRentalist() {
		return rentalist;
	}

	public void setRentalist(List<Renta> rentalist) {
		this.rentalist = rentalist;
	}
	
	
	
	


}

