package GuÌa3;

import java.util.Scanner;

public class Rect·ngulo {

	private int lado1,lado2;
	private int ·rea;
	
	public Rect·ngulo() {
		
		crearRect·ngulo();
		calcular¡rea();
	}
	
	public Rect·ngulo(int lado1, int lado2) {
		
		this.lado1=lado1;
		this.lado2=lado2;
		calcular¡rea();
	}
	
	public void crearRect·ngulo() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese lado 1 del rect·ngulo.");
		lado1=ingresoDatos.nextInt();
		System.out.println("Ingrese lado 2 del rect·ngulo.");
		lado2=ingresoDatos.nextInt();
		
		ingresoDatos.close();
	}
	
	public void calcular¡rea() {
		
		·rea=lado1*lado2;
		System.out.println("El ·rea del rect·ngulo es: "+·rea);
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int get¡rea() {
		return ·rea;
	}

	public void set¡rea(int ·rea) {
		this.·rea = ·rea;
	}
}
