package classes.review;

import java.util.Arrays;

public class Artist {
	
	private String paintbrush;
	private boolean boinita;
	private boolean mamador;
	private String temasDeArte;
	
	public Artist(String primerPincel, boolean hasBoina, boolean isMamador) {
		paintbrush = primerPincel;
		boinita = hasBoina;
		mamador = isMamador;
	}
//	public Artist(String hola, boolean hasBoina, boolean isMamador) {
//		paintbrush = hola;
//		boinita = hasBoina;
//		mamador = isMamador;
//	}
	
	public void draw(int i) {
		
	}
//	public int draw(int i) {
//		return i;
//	}
	public void draw(String string) {}
	public void draw(double number) {}
	//Overload
	public void saludar(String ...strings) {
		System.out.println(Arrays.toString(strings));
	}
	
	public int sumarConArte(int ...numeros) {
		int suma = 0;
		for(int numero : numeros) suma = suma + numero;
		return suma;
	}
	
	public void ideaNomas(int x) {
		x = 10;
		System.out.println("x es " + x);
	}
}
