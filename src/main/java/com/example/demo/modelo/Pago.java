package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pago")
public class Pago {
	
	@Id
	@Column(name="pag_id")
	private Integer id;
	
	@Column(name="pag_tarjeta")
	private String numeroTarjeta;
	
	@Column(name="pag_valor")
	private BigDecimal valor;
	
	@OneToOne(mappedBy = "pago" , cascade =  CascadeType.ALL)
	@JoinColumn(name="ren_id_pago")
	private Renta renta;

	
	
	
	
	@Override
	public String toString() {
		return "Pago [id=" + id + ", numeroTarjeta=" + numeroTarjeta + ", valor=" + valor + ", renta=" + renta + "]";
	}

	//Get and Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Renta getRenta() {
		return renta;
	}

	public void setRenta(Renta renta) {
		this.renta = renta;
	}
	
	
	
	

}
