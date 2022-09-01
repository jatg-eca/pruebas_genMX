package org.generation.autosowners;

import org.generation.autosowners.autos.AutoAbstract;
import org.generation.autosowners.autos.Marca;
import org.generation.autosowners.owners.Direccion;
import org.generation.autosowners.owners.Propietario;

public class CreatingAutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Holi");
		AutoAbstract mitsubishiLancer;
		Propietario raulito;
		Direccion direccionRaul;
		Marca marcaMitsubishi;
		marcaMitsubishi = new Marca("Mitsubishi", "Lancer", "1996");
		direccionRaul = new Direccion("Tlalpan", "Vecindad del chavo", "Ecatepec", "55430");
		raulito = new Propietario("34546465", "54843218", direccionRaul, "Raul", "1996-09-09");
		mitsubishiLancer = new AutoAbstract("verde fosforescente", marcaMitsubishi, raulito, 220, true, 6, false, 25);
		
		//Sale el mitsubishi lancer de agencia para ir a PEMEX por magna
		mitsubishiLancer.setMarchaActual(1);
		for (int vel=0; vel<60; vel++) {
			mitsubishiLancer.aceleracion();
		}
		
		System.out.println("La velocidad es: " + mitsubishiLancer.getVelocidadActual());
		System.out.println("La marcha es: " + mitsubishiLancer.getMarchaActual());
		//Nos topamos un rojo
		mitsubishiLancer.frenado();
		
		System.out.println("Se frenó. La velocidad es: " + mitsubishiLancer.getVelocidadActual());
		System.out.println("La marcha es neutral: " + mitsubishiLancer.getMarchaActual());
		
		//Una recta sin patrullas
		for (int vel=0; vel<120; vel++) {
			mitsubishiLancer.aceleracion();
		}
		System.out.println("La velocidad es: " + mitsubishiLancer.getVelocidadActual());
		//Se llegó a pemex
		mitsubishiLancer.frenado();
		//derrape y 200 pesos de premium
		mitsubishiLancer.setGasAtPemex(100);
		System.out.println("Tanque lleno: "+ mitsubishiLancer.getCuantaGasolina());
		
		System.out.println("Raul, rápido y furioso");
		

	}

}
