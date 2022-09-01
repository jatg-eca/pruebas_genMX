package org.generation.autosowners.autos;

public class Marca {
	private String nombre;
	private String modelo;
	private String year;
	private String codigoEnAgencia;
	
	
	public Marca(String nombre, String modelo, String year) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.year = year;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCodigoEnAgencia() {
		return codigoEnAgencia;
	}
	public void setCodigoEnAgencia(String codigoEnAgencia) {
		this.codigoEnAgencia = codigoEnAgencia;
	}
	
	

}
