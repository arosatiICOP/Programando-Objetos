package Gu�a2;

public class Principal {

	public static void main(String[] args) {
		
		Libro libro1;
		Libro libro2;
		Circunferencia circ1;
		Operaci�n op1;
		Rect�ngulo rect1;
		
		libro1 = new Libro();
		libro2 = new Libro("978-84-936308-8-1","t�tuloLibro","autorLibro",200);
		
		libro1.mostrarLibro();
		libro2.mostrarLibro();
		
		circ1 = new Circunferencia();
		
		op1 = new Operaci�n();
		
		rect1 = new Rect�ngulo();
	}

}
