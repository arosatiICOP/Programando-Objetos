package Guía3;

import java.util.Scanner;

public class Canción {
	
	private String título,autor;
	
	public Canción() {
		
		título=" ";
		autor= " ";
		
		crearCanción();
		mostrarCanción();
	}

	public Canción(String título, String autor) {
		
		this.autor=autor;
		this.título=título;
	}
	
	public void crearCanción() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		System.out.println("Ingrese título de la canción.");
		título=ingresoDatos.nextLine();
		System.out.println("Ingrese autor de la canción.");
		autor=ingresoDatos.nextLine();
		
		ingresoDatos.close();
	}
	
	public void mostrarCanción() {
		
		System.out.println("Título: "+título);
		System.out.println("Autor: "+autor);
	}

	public String getTítulo() {
		return título;
	}

	public void setTítulo(String título) {
		this.título = título;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
