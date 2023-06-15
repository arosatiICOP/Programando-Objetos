package Guía2;

import java.util.Scanner;

public class Circunferencia {
	
	private double radio;
	private double area;
	private double perimetro;
	
	public Circunferencia(double radio) {
		
		this.radio=radio;
		calcularArea();
		mostrarArea();
		calcularPerímetro();
		mostrarPerímetro();
	}
	
	public Circunferencia() {
		
		crearCircunferencia();
		
		calcularArea();
		mostrarArea();
		calcularPerímetro();
		mostrarPerímetro();
	}
	
	public void crearCircunferencia() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese radio de la circunferencia.");
		radio=ingresoDatos.nextDouble();
		
		ingresoDatos.close();
	}
	
	public void calcularArea() {
		
		area=Math.PI*(radio*radio);
	}
	
	public void mostrarArea() {
		 
		System.out.println("El área de una circunferencia de radio "+radio+" es: "+area);
	}
	
	public void calcularPerímetro() {
		
		perimetro = 2*Math.PI*radio;
	}
	
	public void mostrarPerímetro() {
		 
		System.out.println("El perímetro de una circunferencia de radio "+radio+" es: "+perimetro);
	}
	
	public double mostrarRadio() {
		return radio;
	}
	
	public void cambiarRadio(double radio) {
		this.radio=radio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
}
