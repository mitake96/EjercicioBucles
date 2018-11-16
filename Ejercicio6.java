package tema3_1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				/* 		Pedir al usuario que introduzca 2 números ENTEROS por teclado
				 * 		Hacer la operación indicada entre los 2 números introducidos (sumar, restar, multiplicar o dividir)
				 * 		El programa tendrá un menú para que el usuario pueda hacer varias opciones hasta que quiera salir
				 */
		
		
		
		int n1, n2, cuenta, suma, resta, mult, div;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
		
		System.out.println("Introduzca suma(1), resta (2), multiplicación(3), división(4) o salir (5)");
		cuenta=keyboard.nextInt();
		
		if (cuenta == 5) {
			System.out.println("Adiós");
			break;
		}
		

		
		do {
			System.out.println("Número 1: ");
			n1=keyboard.nextInt();
			System.out.println("Número 2: ");
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
