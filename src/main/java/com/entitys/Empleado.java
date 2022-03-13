package com.entitys;

import java.sql.*;

public class Empleado {
	private int empleado_Id;
	private String nombre;
	private int antiguedad;
	private String sexo;
	private String estadoCivil;
	private Date fechaNac;
	private int cargoId;	
	
	public Empleado() {
	}

	public Empleado(int empleado_Id, String nombre, int antiguedad, String sexo, String estadoCivil, Date fechaNac,
			int cargoId) {
		this.empleado_Id = empleado_Id;
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.fechaNac = fechaNac;
		this.cargoId = cargoId;
	}
	
	public int getEmpleado_Id() {
		return empleado_Id;
	}

	public void setEmpleado_Id(int empleado_Id) {
		this.empleado_Id = empleado_Id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getCargoId() {
		return cargoId;
	}

	public void setCargoId(int cargoId) {
		this.cargoId = cargoId;
	}

	@Override
	public String toString() {
		return "Empleado [empleado_Id=" + empleado_Id + ", Nombre=" + nombre + ", antiguedad=" + antiguedad + ", sexo="
				+ sexo + ", estadoCivil=" + estadoCivil + ", fechaNac=" + fechaNac + ", cargoId=" + cargoId + "]";
	}
	

}
