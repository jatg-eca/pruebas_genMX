package org.generation.autosowners.owners;

import java.util.Date;

public class Propietario {
	private String nombre;
	private String numeroCPF;
	private String regimenGeneral;
	private String fechaNacimiento;
	private Direccion direccion;
	
	public Propietario(String numeroCPFParam,
				String regimenGeneralParam,
				Direccion direccionParam,
				String nombreParam,
				String fechaNacimiento) {
		this.numeroCPF = numeroCPFParam;
		this.regimenGeneral = regimenGeneralParam;
		this.direccion = direccionParam;
		this.nombre = nombreParam;
		this.fechaNacimiento = fechaNacimiento;
	}

}
