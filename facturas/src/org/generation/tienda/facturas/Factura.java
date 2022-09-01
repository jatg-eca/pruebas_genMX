package org.generation.tienda.facturas;

public class Factura {
	String numero;
	String descripcion;
	int cantidadComprada;
	double precio;
	
	//Método solicitado
	public void getTotalFatura() {
		if (cantidadComprada<0) this.setCantidadComprada(0);
		if (precio<0.0) this.setPrecio(0);
		System.out.println("Se compraron: " + cantidadComprada 
				+ " cosas a este precio: " + precio);
	}
	
	
	//Constructor
	public Factura(	String numero,
					String descripcion,
					int cantidadComprada,
					double precio) {
		this.numero = numero;
		this.descripcion = descripcion;
		this.cantidadComprada = cantidadComprada;
		this.precio = precio;
	}
	
	//Getters & Setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadComprada() {
		return cantidadComprada;
	}

	public void setCantidadComprada(int cantidadComprada) {
		this.cantidadComprada = cantidadComprada;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
