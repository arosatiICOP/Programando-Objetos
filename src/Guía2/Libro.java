package Guía2;

import java.util.Scanner;

public class Libro {

	private String ISBN;
	private String título;
	private String autor;
	private int numPáginas;
	
	public Libro(String ISBN, String título, String autor, int numPáginas) {
		
		this.ISBN=ISBN;
		this.título=título;
		this.autor=autor;
		this.numPáginas=numPáginas;
	}
	
	public Libro() {
		
		ingresarLibro();
	}
	
	public void ingresarLibro() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese ISBN del libro.");
		ISBN=ingresoDatos.nextLine();
		System.out.println("Ingrese título del libro.");
		título=ingresoDatos.nextLine();
		System.out.println("Ingrese autor del libro.");
		autor=ingresoDatos.nextLine();
		System.out.println("Ingrese número de páginas del libro.");
		numPáginas=ingresoDatos.nextInt();
	}

	public void mostrarLibro() {
		
		System.out.println("Datos del libro.");
		System.out.println("El ISBN del libro es: "+ISBN);	System.out.println("Título del libro: "+título);
		System.out.println("Autor del libro: "+autor);	System.out.println("Cantidad de páginas: "+numPáginas+"\n");
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
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

	public int getNumPáginas() {
		return numPáginas;
	}

	public void setNumPáginas(int numPáginas) {
		this.numPáginas = numPáginas;
	}
}
