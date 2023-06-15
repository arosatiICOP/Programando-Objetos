package Gu�a3;

import java.util.Scanner;

public class Juego {
	
	private int victoriasJ2;
	private int n�meroJ1;
	private int n�meroJ2;

	public Juego() {
		
		victoriasJ2=0;
		iniciarJuego();
	}
	
	public void iniciarJuego(){

		Scanner ingresoDatos = new Scanner(System.in);

		System.out.println("Jugador 1, ingrese el n�mero que se debe adivinar.");
		n�meroJ1=ingresoDatos.nextInt();
		System.out.println("Jugador 1, ingrese cantidad de intentos posibles.");
		int intentos=ingresoDatos.nextInt();

		while(intentos>0 && victoriasJ2==0) {

			System.out.println("Jugador 2, tiene "+intentos+" intentos para adivinar el n�mero."
					+ " Ingrese un n�mero.");
			n�meroJ2=ingresoDatos.nextInt();	
			intentos--;

			if (n�meroJ1==n�meroJ2 ) {
				victoriasJ2++;
				System.out.println("Victorias Jugador 2: "+victoriasJ2);
			}
		}
		
		if(intentos<0) {
			System.out.println("Te quedaste sin intentos.");
		}else {
			System.out.println("�Ganaste, adivinaste el n�mero!");
		}
		
		ingresoDatos.close();
	}
	
	public int getVictoriasJ2() {
		return victoriasJ2;
	}

	public void setVictoriasJ2(int victoriasJ2) {
		this.victoriasJ2 = victoriasJ2;
	}

	public int getN�meroJ1() {
		return n�meroJ1;
	}

	public void setN�meroJ1(int n�meroJ1) {
		this.n�meroJ1 = n�meroJ1;
	}

	public int getN�meroJ2() {
		return n�meroJ2;
	}

	public void setN�meroJ2(int n�meroJ2) {
		this.n�meroJ2 = n�meroJ2;
	}
}
