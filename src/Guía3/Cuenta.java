package Guía3;

import java.util.Scanner;

public class Cuenta {

	private int saldo;
	private int retiro;
	private String titular;
	
	public Cuenta() {
		
		nombreTitular();
		retirarDinero();
	}
	
	public void nombreTitular() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese nombre del titular.");
		titular=ingresoDatos.nextLine();
		
		System.out.println("Ingrese saldo.");
		saldo=ingresoDatos.nextInt();
		
		ingresoDatos.close();
	}
	
	public void retirarDinero() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Bienvenido "+titular+". Ingrese cantidad de dinero a retirar.");
		retiro=ingresoDatos.nextInt();
		
		if(saldo>retiro) {
			
		saldo=saldo-ingresoDatos.nextInt();
		System.out.println("Cantidad retirada con éxito. Su saldo disponible es de: "+saldo);
		System.out.println("Que tenga un buen día.");
		}else {
			System.out.println("Cantidad ingresada superior al saldo disponible.");
		}
		
		ingresoDatos.close();
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getRetiro() {
		return retiro;
	}

	public void setRetiro(int retiro) {
		this.retiro = retiro;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}
