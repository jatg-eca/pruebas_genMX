package org.generation.autosowners.owners;

public class Direccion {
	private String calle;
	private String vecindario;
	private String ciudad;
	private String codigoPostal;
	
	public Direccion(String calle, String vecindario, String ciudad, String codigoPostal) {
		super();
		this.calle = calle;
		this.vecindario = vecindario;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getVecindario() {
		return vecindario;
	}

	public void setVecindario(String vecindario) {
		this.vecindario = vecindario;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	
}
