package Gu�a1;

import java.util.Scanner;

public class Persona {

	private String nombre;
	private String apellido;
	private int n�meroDoc;
	private String tipoDoc;
	
	public Persona(String nombre, String apellido, int n�meroDoc, String tipoDoc) {
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.n�meroDoc=n�meroDoc;
		this.tipoDoc=tipoDoc;
		
	}
	
	public Persona() {
		
		crearPersona();
		mostrarPersona();
	}
	
	public void crearPersona() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese nombre.");
		nombre=ingresoDatos.nextLine();
		System.out.println("Ingrese apellido.");
		apellido=ingresoDatos.nextLine();
		System.out.println("Ingrese n�mero de documento.");
		n�meroDoc=ingresoDatos.nextInt();
		System.out.println("Ingrese tipo de documento.");
		tipoDoc=ingresoDatos.nextLine();
		
		ingresoDatos.close();
	}
	
	public void mostrarPersona() {
		System.out.println("Datos persona:");
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("El n�mero de documento es: "+n�meroDoc);
		System.out.println("Tipo de documento: "+tipoDoc);
	}
	
	public String mostrarNombre() {
		return nombre;
	}
	
	public void cambiarNombre(String nombre) {
		this.nombre=nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getN�meroDoc() {
		return n�meroDoc;
	}

	public void setN�meroDoc(int n�meroDoc) {
		this.n�meroDoc = n�meroDoc;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	
}
