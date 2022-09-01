package org.generation.autosowners.owners;

import java.util.Date;

abstract public class Propietario {
	private String nombre;
	private int numeroCPF;
	private int regimenGeneral;
	private Date fechaNacimiento;
	private Direccion direccion;
	
	Propietario(int numeroCPFParam,
				int regimenGeneralParam,
				Direccion direccionParam) {
		this.numeroCPF = numeroCPFParam;
		this.regimenGeneral = regimenGeneralParam;
		this.direccion = direccionParam;
	}

}
