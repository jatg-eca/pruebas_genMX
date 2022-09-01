package app.heroku.gomgominolas;

import app.heroku.gomgominolas.employees.Empleado;

public class EmpleadoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado raulFastFurious;
		Empleado gabriela;
		
		Empleado.getEmpleadosTotales();
		
		raulFastFurious = new Empleado("Raul", "Mitsubishi", 12_000);
		gabriela = new Empleado("Gabriela", "Soto", 15_000);
		
		
		Empleado.getEmpleadosTotales();
		System.out.println("Salario ahora de Gabriela: "+ gabriela.getSalarioMensual());
		System.out.println("Salario ahora de Raul: " + raulFastFurious.getSalarioMensual());
		
		//GomGom ganó mucho en ventas
		gabriela.darAumento(0.10);
		raulFastFurious.darAumento(0.10);
		
		System.out.println("Salario ahora de Gabriela: "+ gabriela.getSalarioMensual());
		System.out.println("Salario ahora de Raul: " + raulFastFurious.getSalarioMensual());
		
		raulFastFurious.getSalarioAnual();
		gabriela.getSalarioAnual();

	}

}
