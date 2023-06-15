package Gu�a3;

import java.util.Scanner;

public class Canci�n {
	
	private String t�tulo,autor;
	
	public Canci�n() {
		
		t�tulo=" ";
		autor= " ";
		
		crearCanci�n();
		mostrarCanci�n();
	}

	public Canci�n(String t�tulo, String autor) {
		
		this.autor=autor;
		this.t�tulo=t�tulo;
	}
	
	public void crearCanci�n() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		System.out.println("Ingrese t�tulo de la canci�n.");
		t�tulo=ingresoDatos.nextLine();
		System.out.println("Ingrese autor de la canci�n.");
		autor=ingresoDatos.nextLine();
		
		ingresoDatos.close();
	}
	
	public void mostrarCanci�n() {
		
		System.out.println("T�tulo: "+t�tulo);
		System.out.println("Autor: "+autor);
	}

	public String getT�tulo() {
		return t�tulo;
	}

	public void setT�tulo(String t�tulo) {
		this.t�tulo = t�tulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
