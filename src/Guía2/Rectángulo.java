package Guía2;

import java.util.Scanner;

public class Rectángulo {
	
	private int base;
	private int altura;
	private int recSuperficie;
	private int recPerímetro;
	private static int i=0,j=0;
	
	public Rectángulo(int base, int altura) {
		
		this.altura=altura;
		this.base=base;
	}
	
	public Rectángulo() {
		
	}
	
	public void crearRectángulo() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese base del rectángulo.");
		base=ingresoDatos.nextInt();
		System.out.println("Ingrese altura del rectángulo.");
		altura=ingresoDatos.nextInt();
		
		System.out.println("¿Desea hacer alguna operación? Ingrese 4 para finalizar. Operaciones: 1- Superficie |"
				+ " 2- Perímetro | 3- Dibujar rectángulo");
		
		if (ingresoDatos.nextInt()>=4) {
		
		switch (ingresoDatos.nextInt()) {
		
			case 1: calcularSup();
			case 2: calcularPerímetro();
			case 3: dibujarRectángulo();
			case 4: System.out.println("¡Hasta luego!");
		}
		}else {
			System.out.println("Ingrese un dígito de 1 a 4.");
		}
		
		ingresoDatos.close();
	}
	
	public void calcularSup() {
		
		recSuperficie=base*altura;
		System.out.println("Superficie del rectángulo: "+recSuperficie);
	}
	
	public void calcularPerímetro() {
		
		recPerímetro=(base+altura)*2;
		System.out.println("Perímetro del rectángulo: "+recPerímetro);
	}
	
	public void dibujarRectángulo() {
		
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

	public int getRecPerímetro() {
		return recPerímetro;
	}

	public void setRecPerímetro(int recPerímetro) {
		this.recPerímetro = recPerímetro;
	}	
}
