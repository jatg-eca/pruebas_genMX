package org.generation.autosowners.autos;

import org.generation.autosowners.owners.Propietario;

public class AutoAbstract implements IAuto {
	private String color;
	private Marca marca;
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
		if (velocidadActual > 0 && velocidadActual < 20) {
		this.marchaActual = 1;
		}
		if (velocidadActual > 20 && velocidadActual < 40) {
			this.marchaActual = 2;
		}
		if (velocidadActual > 40 && velocidadActual < 80) {
			this.marchaActual = 3;
		}
		if (velocidadActual > 80 && velocidadActual < 120) {
			this.marchaActual = 4;
		}
		if (velocidadActual > 120 && velocidadActual < 220) {
			this.marchaActual = 5;
		}
		if (velocidadActual > 220) {
			this.marchaActual = 6;
		}
	}

	@Override
	public void frenado() {
		// TODO Auto-generated method stub
		this.velocidadActual = 0;
		while(this.getMarchaActual() > 0) {
			this.reducirMarcha();
		}
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

	public String getColor() {
		return color;
	}

	public Marca getMarca() {
		return marca;
	}

	public String getChasis() {
		return chasis;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public int getPuertos() {
		return puertos;
	}

	public boolean isQuemacocos() {
		return quemacocos;
	}

	public int getMarchasTotales() {
		return marchasTotales;
	}

	public int getMarchaActual() {
		return marchaActual;
	}

	public boolean isTransmisionAutomatica() {
		return transmisionAutomatica;
	}

	public int getGasolinaActual() {
		return gasolinaActual;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public void setPuertos(int puertos) {
		this.puertos = puertos;
	}

	public void setQuemacocos(boolean quemacocos) {
		this.quemacocos = quemacocos;
	}

	public void setMarchasTotales(int marchasTotales) {
		this.marchasTotales = marchasTotales;
	}

	public void setMarchaActual(int marchaActual) {
		this.marchaActual = marchaActual;
	}

	public void setTransmisionAutomatica(boolean transmisionAutomatica) {
		this.transmisionAutomatica = transmisionAutomatica;
	}

	public void setGasolinaActual(int gasolinaActual) {
		this.gasolinaActual = gasolinaActual;
	}

	public AutoAbstract(String color, Marca marca, Propietario propietario, int velocidadMax, boolean quemacocos,
			int marchasTotales, boolean transmisionAutomatica, int gasolinaActual) {
		super();
		this.color = color;
		this.marca = marca;
		this.propietario = propietario;
		this.velocidadMax = velocidadMax;
		this.quemacocos = quemacocos;
		this.marchasTotales = marchasTotales;
		this.transmisionAutomatica = transmisionAutomatica;
		this.gasolinaActual = gasolinaActual;
	}
	
	

}
