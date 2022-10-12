package classes.review;

import java.util.Arrays;

public class Artist {
	
	private String paintbrush;
	private boolean boinita;
	private boolean mamador;
	private String temasDeArte;
	
	public static int artistsNumber; //Associated with the whole class, not objects
	private static final double GOLDEN_RATIO = 1.618_033_988;
	
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
	
	public void returnPlays() {
		System.out.println("Return fake. Compiler error");
		int i = 0;
		//return i;
		return; //this one works tho
	}
	
	public Artist returnArtist() {
		return this;
	}
	
	public static void getArtistNumber() {
		System.out.println(artistsNumber);
	}
	//Class methods can only refer to static (or class) related methods or variables
}
