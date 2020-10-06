package com.badbadcode.application.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numero_cliente",nullable = false, unique = true)
	private Long numero_cliente;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido_m")
	private String apellido_m;
	@Column(name="apellido_p")
	private String apellido_p;
	@Column(name="fecha_nac")
	private Date fecha_nac;
	@Column(name="sexo")
	private String sexo;
	@Column(name="e_civil")
	private String e_civil;
	@Column(name="tel")
	private Long tel;
	@Column(name="email")
	private String email;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getNumero_cliente() {
		return numero_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido_m() {
		return apellido_m;
	}

	public String getApellido_p() {
		return apellido_p;
	}

	public Date getFecha_nac() {
		return fecha_nac;
	}

	public String getSexo() {
		return sexo;
	}

	public String getE_civil() {
		return e_civil;
	}

	public Long getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public void setNumero_cliente(Long numero_cliente) {
		this.numero_cliente = numero_cliente;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido_m(String apellido_m) {
		this.apellido_m = apellido_m;
	}

	public void setApellido_p(String apellido_p) {
		this.apellido_p = apellido_p;
	}

	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setE_civil(String e_civil) {
		this.e_civil = e_civil;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}
