package tema3_1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	1.- Solicitar al usuario dos números
		 *  2.- Generar 15 números aleatorios entre el rango de ambos números
		 */
		
		int n1, n2, numero;
		Random random1 = new Random();
		
		Scanner keyboard = new Scanner(System.in);
		do {
		System.out.println("Introduce el primer número: ");
		n1=keyboard.nextInt();
		System.out.println("Introduce el segundo número (debe ser mayor que el anterior): ");
		n2=keyboard.nextInt(); } 
		while (n1 <= n2);
		
		for (int i = 1; i<=15; i++) {
			
			numero = random1.nextInt(n1-n2+1)+n2;
			System.out.println("Nº " + i +": " + numero);
		}
		
		
		keyboard.close();
	}

}
