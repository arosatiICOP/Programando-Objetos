package Guía3;

public class Principal {

	public static void main(String[] args) {
		
		Juego j1;	Rectángulo nuevoRec;
		Puntos p1;	Canción canción;
		Cuenta cuenta;	Empleado emp;
		
		p1 = new Puntos();
		emp = new Empleado();
		cuenta = new Cuenta();
		
		nuevoRec = new Rectángulo(4,6);
		canción = new Canción();
		j1 = new Juego();
	}
}
