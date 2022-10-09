package classes.review;

import java.util.Arrays;

public class Main {
	public static void main(String  [] arra) {
		Artist abue = new Artist("ok", true, false);
//		System.out.println(abue);
		
		abue.saludar("hola", "qué tal", "chale", "bueno");
		System.out.println(abue.sumarConArte(1, 2, 3, 4, 5));
		
		int x = 3;
		System.out.println("x es: " + x);
		
		abue.ideaNomas(x);
		System.out.println("x es: " + x);
		int y;
		Artist hola;
//		System.out.println(abue);
//		System.out.println(hola);
		
		int numeroIdea = new Artist(null, false, false).sumarConArte(1, 2, 3);
		System.out.println(numeroIdea);
		
		
	}

}
