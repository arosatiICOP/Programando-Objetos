package Guía2;

import java.util.Scanner;

public class Operación {

	private int numero1, numero2;
	private int resultadoSuma, resultadoResta;
	private int resultadoMult, resultadoDiv;
	
	public Operación(int numero1, int numero2) {
		
		this.numero1=numero1;
		this.numero2=numero2;
	}
	
	public Operación() {
		
	}
	
	public void crearOperacion() {
		
		Scanner ingresoDatos = new Scanner(System.in);
		
		System.out.println("Ingrese número 1.");
		numero1=ingresoDatos.nextInt();
		System.out.println("Ingrese número 2.");
		numero2=ingresoDatos.nextInt();
		
		System.out.println("¿Desea hacer alguna operación? Ingrese 5 para finalizar. Operaciones: 1- Suma | 2- Resta | 3- Multiplicación"
				+ " 4- División");
		
		if (ingresoDatos.nextInt()<=5) {
		
		switch (ingresoDatos.nextInt()) {
		
			case 1: sumar();
			case 2: restar();
			case 3: multiplicar();
			case 4: dividir();
			case 5: System.out.println("¡Hasta luego!");
			}
		}else {
			System.out.println("Ingrese un dígito de 1 a 5.");
		}
		ingresoDatos.close();
	}
	
	public void sumar() {
		
		resultadoSuma = numero1+numero2;
		System.out.println("Resultado: "+resultadoSuma);
	}

	public void restar() {
		
		resultadoResta = numero1-numero2;
		System.out.println("Resultado: "+resultadoResta);
	}
	
	public void multiplicar() {
		
		if (numero2!=0) {
			resultadoMult = numero1*numero2;
			System.out.println("Resultado: "+resultadoMult);
		}else {
			resultadoMult = 0;
			System.out.println("Resultado: "+resultadoMult+" ( || Error, se intentó multiplicar por 0.");
		}
	}
	
	public void dividir() {
		
		if (numero2!=0) {
			resultadoDiv = numero1*numero2;
			System.out.println("Resultado: "+resultadoDiv);
		}else {
			resultadoDiv = 0;
			System.out.println("Resultado: "+resultadoDiv+" ( || Error, se intentó dividir por 0.");
		}
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getResultadoSuma() {
		return resultadoSuma;
	}

	public void setResultadoSuma(int resultadoSuma) {
		this.resultadoSuma = resultadoSuma;
	}

	public int getResultadoResta() {
		return resultadoResta;
	}

	public void setResultadoResta(int resultadoResta) {
		this.resultadoResta = resultadoResta;
	}

	public int getResultadoMult() {
		return resultadoMult;
	}

	public void setResultadoMult(int resultadoMult) {
		this.resultadoMult = resultadoMult;
	}

	public int getResultadoDiv() {
		return resultadoDiv;
	}

	public void setResultadoDiv(int resultadoDiv) {
		this.resultadoDiv = resultadoDiv;
	}
}
