package Guía3;

import java.util.Scanner;

public class Puntos {

	private int x1,x2;
	private int y1,y2;
	private int resultado;
	private double resDistancia;
	
	public Puntos() {
		
		x1=0;	x2=0;
		y1=0;	y2=0;
		resDistancia=0;
		
		crearPuntos();
	}
	
	public void crearPuntos() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese valor del punto 'x1'.");
		x1=ingresoDatos.nextInt();
		System.out.println("Ingrese valor del punto 'x2'.");
		x2=ingresoDatos.nextInt();
		
		System.out.println("Ingrese valor del punto 'y1'.");
		y1=ingresoDatos.nextInt();
		System.out.println("Ingrese valor del punto 'y2'.");
		y2=ingresoDatos.nextInt();
		
		calcularDistancia();
		
		ingresoDatos.close();
	}

	private void calcularDistancia() {
		
		resultado=(x2-x1)^2+(y2-y1^2);
		resDistancia= Math.sqrt(resultado);
		
		System.out.println("La distancia entre ambos puntos es: "+resDistancia);
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public double getResDistancia() {
		return resDistancia;
	}

	public void setResDistancia(double resDistancia) {
		this.resDistancia = resDistancia;
	}
}
