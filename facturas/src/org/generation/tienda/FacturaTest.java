package org.generation.tienda;

import org.generation.tienda.facturas.Factura;

public class FacturaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("HoliProyectoDos");
		Factura satUno;
		Factura satDos;
		Factura satTres;
		
		satUno = new Factura("354", "Primera factura de gomitas"
				, 5, 54.3);
		satDos = new Factura("545", "Factura gasolina Mitsubihshi lancer",
				-12, 200);
		satTres = new Factura("3", "Descuentazos", 25, -150.42334);
		
		satUno.getTotalFatura();
		satDos.getTotalFatura();
		satTres.getTotalFatura();
		
		

	}

}
