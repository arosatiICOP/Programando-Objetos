package Gu�a2;

import java.util.Scanner;

public class Rect�ngulo {
	
	private int base;
	private int altura;
	private int recSuperficie;
	private int recPer�metro;
	private static int i=0,j=0;
	
	public Rect�ngulo(int base, int altura) {
		
		this.altura=altura;
		this.base=base;
	}
	
	public Rect�ngulo() {
		
	}
	
	public void crearRect�ngulo() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese base del rect�ngulo.");
		base=ingresoDatos.nextInt();
		System.out.println("Ingrese altura del rect�ngulo.");
		altura=ingresoDatos.nextInt();
		
		System.out.println("�Desea hacer alguna operaci�n? Ingrese 4 para finalizar. Operaciones: 1- Superficie |"
				+ " 2- Per�metro | 3- Dibujar rect�ngulo");
		
		if (ingresoDatos.nextInt()>=4) {
		
		switch (ingresoDatos.nextInt()) {
		
			case 1: calcularSup();
			case 2: calcularPer�metro();
			case 3: dibujarRect�ngulo();
			case 4: System.out.println("�Hasta luego!");
		}
		}else {
			System.out.println("Ingrese un d�gito de 1 a 4.");
		}
		
		ingresoDatos.close();
	}
	
	public void calcularSup() {
		
		recSuperficie=base*altura;
		System.out.println("Superficie del rect�ngulo: "+recSuperficie);
	}
	
	public void calcularPer�metro() {
		
		recPer�metro=(base+altura)*2;
		System.out.println("Per�metro del rect�ngulo: "+recPer�metro);
	}
	
	public void dibujarRect�ngulo() {
		
		while(i<base) {
			while(j<altura) {
			System.out.print("*");
			j++;
			}
			System.out.println();
			j=0;
			i++;
		}
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRecSuperficie() {
		return recSuperficie;
	}

	public void setRecSuperficie(int recSuperficie) {
		this.recSuperficie = recSuperficie;
	}

	public int getRecPer�metro() {
		return recPer�metro;
	}

	public void setRecPer�metro(int recPer�metro) {
		this.recPer�metro = recPer�metro;
	}	
}
