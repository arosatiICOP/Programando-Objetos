package Guía3;

import java.util.Scanner;

public class Juego {
	
	private int victoriasJ2;
	private int númeroJ1;
	private int númeroJ2;

	public Juego() {
		
		victoriasJ2=0;
		iniciarJuego();
	}
	
	public void iniciarJuego(){

		Scanner ingresoDatos = new Scanner(System.in);

		System.out.println("Jugador 1, ingrese el número que se debe adivinar.");
		númeroJ1=ingresoDatos.nextInt();
		System.out.println("Jugador 1, ingrese cantidad de intentos posibles.");
		int intentos=ingresoDatos.nextInt();

		while(intentos>0 && victoriasJ2==0) {

			System.out.println("Jugador 2, tiene "+intentos+" intentos para adivinar el número."
					+ " Ingrese un número.");
			númeroJ2=ingresoDatos.nextInt();	
			intentos--;

			if (númeroJ1==númeroJ2 ) {
				victoriasJ2++;
				System.out.println("Victorias Jugador 2: "+victoriasJ2);
			}
		}
		
		if(intentos<0) {
			System.out.println("Te quedaste sin intentos.");
		}else {
			System.out.println("¡Ganaste, adivinaste el número!");
		}
		
		ingresoDatos.close();
	}
	
	public int getVictoriasJ2() {
		return victoriasJ2;
	}

	public void setVictoriasJ2(int victoriasJ2) {
		this.victoriasJ2 = victoriasJ2;
	}

	public int getNúmeroJ1() {
		return númeroJ1;
	}

	public void setNúmeroJ1(int númeroJ1) {
		this.númeroJ1 = númeroJ1;
	}

	public int getNúmeroJ2() {
		return númeroJ2;
	}

	public void setNúmeroJ2(int númeroJ2) {
		this.númeroJ2 = númeroJ2;
	}
}
