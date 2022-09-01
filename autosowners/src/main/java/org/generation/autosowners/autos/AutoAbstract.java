package org.generation.autosowners.autos;

import org.generation.autosowners.owners.Propietario;

abstract public class AutoAbstract implements IAuto {
	private String modelo;
	private String color;
	private String year;
	private String marca;
	private String chasis;
	private Propietario propietario;
	private int velocidadMax;
	private int velocidadActual;
	private int puertos;
	private boolean quemacocos;
	private int marchasTotales;
	private int marchaActual;
	private boolean transmisionAutomatica;
	
	private int gasolinaActual;
	

	@Override
	public void aceleracion() {
		// TODO Auto-generated method stub
		this.velocidadActual += 1;
	}

	@Override
	public void frenado() {
		// TODO Auto-generated method stub
		this.velocidadActual = 0;
	}

	@Override
	public void subirMarcha() {
		// TODO Auto-generated method stub
		this.marchaActual += 1;
		
	}

	@Override
	public void reducirMarcha() {
		// TODO Auto-generated method stub
		if (velocidadActual == 0) {
		this.marchaActual -=1;
		}
	}
	
	public int rendimientoGasolina(
			int gasolinaConsumida,
			int kmRecorridos) {
			return gasolinaConsumida/kmRecorridos;
	}
	
	public int getCuantaGasolina() {
		return gasolinaActual;
	}
	
	public void setGasAtPemex(int cuantoDeMagna) {
		this.gasolinaActual=cuantoDeMagna;
	}
	
	AutoAbstract(Propietario propietarioParam) {
		this.propietario = propietarioParam;
		
	}

}
