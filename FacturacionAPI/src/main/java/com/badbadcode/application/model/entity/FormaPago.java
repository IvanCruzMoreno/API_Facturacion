package com.badbadcode.application.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formapago")
public class FormaPago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_forma_pago", nullable = false, unique = true)
	private Long id_forma_pago;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "descripcion")
	private String descripcion;
	
	public Long getId_forma_pago() {
		return id_forma_pago;
	}
	public String getTipo() {
		return tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setId_forma_pago(Long id_forma_pago) {
		this.id_forma_pago = id_forma_pago;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
