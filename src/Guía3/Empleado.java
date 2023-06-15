package Guía3;

import java.util.Scanner;

public class Empleado {
	
	private String nombre;
	private int edad, salario;
	
	public Empleado() {
		
		nombre=""; edad=0; salario=0;
		
		datosEmpleado();
		calcularAumento();
	}
	
	public void datosEmpleado() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese nombre del empleado.");
		nombre=ingresoDatos.nextLine();
		System.out.println("Ingrese edad del empleado.");
		edad=ingresoDatos.nextInt();
		System.out.println("Ingrese salario del empleado.");
		salario=ingresoDatos.nextInt();
		
		ingresoDatos.close();
	}
	
	public void calcularAumento() {
	
		if(edad>30) {
			salario=salario+(salario*10/100);
		}else{
			salario=salario+(salario*5/100);
		}
		
		System.out.println("El saldo nuevo es de: "+salario);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
}
