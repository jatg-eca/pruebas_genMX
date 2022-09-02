package org.generation.proyecto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class IntegerSet {
	private static int maxNumbers = 3;
	boolean conjuntoA [] = new boolean [maxNumbers];
	boolean conjuntoB [] = new boolean [maxNumbers];
	
	public IntegerSet(){
		for(int i= 0; i<maxNumbers; i++) {
			conjuntoA[i] = true;
		}
		for(int j=0; j<maxNumbers; j++) {
			conjuntoB[j] = false;
		}
		//System.out.println(Arrays.toString(conjuntoA));
	}
	
	public void union() {
		boolean conjuntoUnion [] = new boolean [maxNumbers];
		for(int i = 0; i<conjuntoA.length; i++)
			{
			if(conjuntoA[i] || conjuntoB[i]) {
				conjuntoUnion[i] = true;
			}
			else {
				conjuntoUnion[i] = false;
			}
			}
		
		System.out.println("Unión: " + Arrays.toString(conjuntoUnion));
	}
	
	public void interseccion() {
		boolean conjuntoInterseccion [] = new boolean [maxNumbers];
		for(int i=0; i<conjuntoA.length;i++) {
			if(conjuntoA[i] == true && conjuntoB[i] == true) {
				conjuntoInterseccion[i] = true;
			}
			else {
				conjuntoInterseccion[i] = false;
			}
		}
		
		System.out.println("Interseccion: " + Arrays.toString(conjuntoInterseccion));
	}
	
	public void insertsElementConjuntoA(int position) {
		conjuntoA[position] = true;
	}
	public void insertsElementConjuntoB(int position) {
		conjuntoB[position] = true;
	}
	
	public void toSetStringConjuntoA() {
		//System.out.println(Arrays.toString(conjuntoA));
		System.out.println("/**** Revisión de números ****\\");
		for(int i=0; i<maxNumbers; i++) {
			if(conjuntoA[i] == false) {
				System.out.print(" - ");
			}
			else {
				System.out.print(i);
			}
		}
		System.out.println("\nFin de revisión");
	}
	
	public void toSetStringConjuntoB() {
		//System.out.println(Arrays.toString(conjuntoB));
		System.out.println("/**** Revisión de números ****\\");
		for(int i=0; i<maxNumbers; i++) {
			if(conjuntoB[i] == false) {
				System.out.print(" - ");
			}
			else {
				System.out.print(i);
			}
		}
		System.out.println("\nFin de revisión");
	}
	
	public void deleteElementConjuntoA(int position) {
		conjuntoA[position] = false;
	}
	public void deleteElementConjuntoB(int position) {
		conjuntoB[position] = false;
	}
	
	public boolean equalTo() {
		boolean checker = true;
		for(int i=0; i<maxNumbers; i++) {
			if(conjuntoA[i] == conjuntoB[i]) {
				continue;
			}
			else {
				checker = false;
				break;
			}
		}
		return checker;
	}

	
	
	
//	private boolean matrizA;
//	private boolean matrizB;
//	private int numeroI;
//	private int numeroJ;
//	
//	private int numeroK;
//	private int numeroM;
//	
//	private int initialize;
//	
//	IntegerSet() {
//		this.matrizA = false;
//		this.matrizB = false;
//	}
//	
//	public void setNumeroI(int numeroI) {
//		this.numeroI = numeroI;
//		if (numeroI >= 0 && numeroI <=100) {
//			this.matrizA = true;
//		}
//	}
//	
//	public void setNumeroJ(int numeroJ) {
//		this.numeroJ = numeroJ;
//		if (numeroJ > 100 || numeroJ < 0) {
//			this.matrizB = false;
//		}
//	}
//	
//	public boolean unionOr(){
//		if(matrizA == false && matrizB == false) {
//			return false;
//		}
//		else {
//			return true;
//		}
//	}
//	
//	public boolean unionAnd() {
//		if(matrizA == true && matrizB == true) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	public void insertsElement(int numeroK){
//		this.numeroK = numeroK;
//		boolean matrizC = true;		
//	}
//	
//	public void deleteElement(){
//		this.numeroM = initialize;
//		boolean matrizD = false;
//	}
	
	
	

}
