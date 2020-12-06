package com.badbadcode.application.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_factura", nullable = false, unique=true)
	private Long id_factura;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "descuentos")
	private Float descuentos;
	@Column(name = "RFC")
	private String RFC;
	@Column(name = "total_articulos")
	private Integer total_articulos;
	@Column(name = "total")
	private Float total;
	@Column(name ="IVA")
	private Float IVA;
	@Column(name = "total_neto")
	private Float total_neto;
	@JoinColumn(name = "numero_cliete")
	private Integer numero_cliente;
	@JoinColumn(name = "id_forma_pago")
	private Integer id_forma_pago;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getId_factura() {
		return id_factura;
	}
	public Date getFecha() {
		return fecha;
	}
	public Float getDescuentos() {
		return descuentos;
	}
	public String getRFC() {
		return RFC;
	}
	public Integer getTotal_articulos() {
		return total_articulos;
	}
	public Float getTotal() {
		return total;
	}
	public Float getTotal_neto() {
		return total_neto;
	}
	public Integer getNumero_cliente() {
		return numero_cliente;
	}
	public Integer getId_forma_pago() {
		return id_forma_pago;
	}
	public void setId_factura(Long id_factura) {
		this.id_factura = id_factura;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public void setDescuentos(float descuentos) {
		this.descuentos = descuentos;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	public void setTotal_articulos(int total_articulos) {
		this.total_articulos = total_articulos;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public void setTotal_neto(float total_neto) {
		this.total_neto = total_neto;
	}
	public void setNumero_cliente(int numero_cliente) {
		this.numero_cliente = numero_cliente;
	}
	public void setId_forma_pago(int id_forma_pago) {
		this.id_forma_pago = id_forma_pago;
	}
	public Float getIVA() {
		return IVA;
	}
	public void setIVA(float iVA) {
		IVA = iVA;
	}
	
	
}
