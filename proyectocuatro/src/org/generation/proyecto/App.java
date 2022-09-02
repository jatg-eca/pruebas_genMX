package org.generation.proyecto;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<Integer> numerosI = new HashSet<Integer>();
//		for(int i=0; i<=100; i++) {
//			numerosI.add(i);
//		}
//	    System.out.print(numerosI);
//	    
//	    HashSet<Integer> numerosJ = new HashSet<Integer>();
//	    for(int j=0; j<=100; j++) {
//	    	numerosJ.add(j);
//	    }
//	    System.out.print(numerosJ);
	    
	    
	   IntegerSet integerSet = new IntegerSet();
	   integerSet.union();
	   integerSet.interseccion();
	   integerSet.insertsElementConjuntoA(2);
	   integerSet.insertsElementConjuntoB(2);
	   integerSet.insertsElementConjuntoA(5);
	   integerSet.insertsElementConjuntoA(10);
	   
	   integerSet.toSetStringConjuntoA();
	   integerSet.toSetStringConjuntoB();
	   integerSet.deleteElementConjuntoA(5);
	   integerSet.toSetStringConjuntoA();
	   System.out.println(integerSet.equalTo());
	   integerSet.union();
	   integerSet.interseccion();
	   
	    

	}

}
