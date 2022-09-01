package org.generation.autosowners.owners;

import java.util.Date;

public class Propietario {
	private String nombre;
	private int numeroCPF;
	private int regimenGeneral;
	private Date fechaNacimiento;
	private String calle;
	private String vecindario;
	private String ciudad;
	private int codigoPostal;
	
	Propietario(int numeroCPFParam, int regimenGeneralParam) {
		this.numeroCPF = numeroCPFParam;
		this.regimenGeneral = regimenGeneralParam;
	}

}
