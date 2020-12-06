package com.badbadcode.application.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "cantidad_producto")
	private Long cantidad_producto;
	@Column(name = "sub_total")
	private Float sub_total;
	@JoinColumn(name = "tipo_producto")
	private Long tipo_producto;
	@Id
	@JoinColumn(name = "id_factura")
	private Long id_factura;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getCantidad_producto() {
		return cantidad_producto;
	}
	public Float getSub_total() {
		return sub_total;
	}
	public Long getTipo_producto() {
		return tipo_producto;
	}
	public Long getId_factura() {
		return id_factura;
	}
	public void setCantidad_producto(Long cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}
	public void setSub_total(Float sub_total) {
		this.sub_total = sub_total;
	}
	public void setTipo_producto(Long tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	public void setId_factura(Long id_factura) {
		this.id_factura = id_factura;
	}

	
}
