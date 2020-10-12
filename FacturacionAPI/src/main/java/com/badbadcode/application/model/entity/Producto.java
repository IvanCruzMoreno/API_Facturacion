package com.badbadcode.application.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tipo_producto",nullable = false, unique = true)
	private Long tipo_producto;
	@Column(name = "precio")
	private float precio;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "cantidad_stock")
	private int cantidad_stock;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getTipo_producto() {
		return tipo_producto;
	}
	public float getPrecio() {
		return precio;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCantidad_stock() {
		return cantidad_stock;
	}
	public void setTipo_producto(Long tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCantidad_stock(int cantidad_stock) {
		this.cantidad_stock = cantidad_stock;
	} 
	
	

}
