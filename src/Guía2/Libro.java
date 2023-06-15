package Gu�a2;

import java.util.Scanner;

public class Libro {

	private String ISBN;
	private String t�tulo;
	private String autor;
	private int numP�ginas;
	
	public Libro(String ISBN, String t�tulo, String autor, int numP�ginas) {
		
		this.ISBN=ISBN;
		this.t�tulo=t�tulo;
		this.autor=autor;
		this.numP�ginas=numP�ginas;
	}
	
	public Libro() {
		
		ingresarLibro();
	}
	
	public void ingresarLibro() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese ISBN del libro.");
		ISBN=ingresoDatos.nextLine();
		System.out.println("Ingrese t�tulo del libro.");
		t�tulo=ingresoDatos.nextLine();
		System.out.println("Ingrese autor del libro.");
		autor=ingresoDatos.nextLine();
		System.out.println("Ingrese n�mero de p�ginas del libro.");
		numP�ginas=ingresoDatos.nextInt();
	}

	public void mostrarLibro() {
		
		System.out.println("Datos del libro.");
		System.out.println("El ISBN del libro es: "+ISBN);	System.out.println("T�tulo del libro: "+t�tulo);
		System.out.println("Autor del libro: "+autor);	System.out.println("Cantidad de p�ginas: "+numP�ginas+"\n");
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
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

	public int getNumP�ginas() {
		return numP�ginas;
	}

	public void setNumP�ginas(int numP�ginas) {
		this.numP�ginas = numP�ginas;
	}
}
