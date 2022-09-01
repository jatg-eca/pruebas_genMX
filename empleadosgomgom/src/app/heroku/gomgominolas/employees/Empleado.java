package app.heroku.gomgominolas.employees;

public class Empleado {
	String nombre;
	String apellido;
	double salarioMensual;
	private static int empleadosTotales;
	
	public Empleado(String nombre, String apellido, double salarioMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.salarioMensual = salarioMensual;
		
		this.empleadosTotales += 1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	public void darAumento(double porcientoDecimal) {
		double salarioActual = this.getSalarioMensual();
		this.salarioMensual = 
				((salarioActual * porcientoDecimal) + salarioActual);
		System.out.println("Ahi va un aumento pa que sigan a gusto, trabajando");
	}
	
	public void getSalarioAnual() {
		System.out.println("El salario anual es: " + this.getSalarioMensual() * 12);
	}

	public static void getEmpleadosTotales() {
		if (empleadosTotales == 0) System.out.println("GomGom no ha tenido empleados. Hay que contratar...");
		else {
		System.out.println("Hasta ahora, GomGom"
				+ " ha tenido " + empleadosTotales + " empleados. "
						+ "¡Orgullo GomGom!");
		}
	}
	
	

}
