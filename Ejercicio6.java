package tema3_1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				/* 		Pedir al usuario que introduzca 2 n�meros ENTEROS por teclado
				 * 		Hacer la operaci�n indicada entre los 2 n�meros introducidos (sumar, restar, multiplicar o dividir)
				 * 		El programa tendr� un men� para que el usuario pueda hacer varias opciones hasta que quiera salir
				 */
		
		
		
		int n1, n2, cuenta, suma, resta, mult, div;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
		
		System.out.println("Introduzca suma(1), resta (2), multiplicaci�n(3), divisi�n(4) o salir (5)");
		cuenta=keyboard.nextInt();
		
		if (cuenta == 5) {
			System.out.println("Adi�s");
			break;
		}
		

		
		do {
			System.out.println("N�mero 1: ");
			n1=keyboard.nextInt();
			System.out.println("N�mero 2: ");
			n2=keyboard.nextInt();
			
		}
		while (n1 < 0 || n2 < 0);
		
		
		if (cuenta == 1) {
			suma = n1 + n2;
			System.out.println("El resultado es: " + suma);
		}
		
		else if (cuenta == 2) {
			resta = n1 - n2;
			System.out.println("El resultado es: " + resta);
		}
		else if (cuenta == 3) {
			mult = n1 * n2;
			System.out.println("El resultado es: " + mult);
		}
		else if (cuenta == 4) {
			div = n1 / n2;
			System.out.println("El resultado es: " + div);
		}
		}
		while ( 
			cuenta == 1 || cuenta == 2 || cuenta == 3 || cuenta == 4
		);
		
		keyboard.close();
	}

}
