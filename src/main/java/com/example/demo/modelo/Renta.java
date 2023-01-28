package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="renta")
public class Renta {
	
	@Id
	@Column(name="renta_id")
	private Integer id;
	
	@Column(name="renta_fecha")
	private LocalDateTime fecha;
	
	@Column(name="renta_dias")
	private String numeroDias;
	
	@Column(name="renta_valor")
	private BigDecimal valor;

	@OneToOne(mappedBy = "pago" ,cascade = CascadeType.ALL)
	private Pago pago;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aut_id_ren")
	private Automovil automovil;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ren_id_ren")
	
	
	
	
	//Get and Set
	private Cliente cliente;

	@Override
	public String toString() {
		return "Renta [id=" + id + ", fecha=" + fecha + ", numeroDias=" + numeroDias + ", valor=" + valor + ", pago="
				+ pago + ", automovil=" + automovil + ", cliente=" + cliente + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(String numeroDias) {
		this.numeroDias = numeroDias;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Automovil getAutomovil() {
		return automovil;
	}

	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}
