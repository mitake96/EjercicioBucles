package tema3_1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	1.- Solicitar al usuario dos n�meros
		 *  2.- Generar 15 n�meros aleatorios entre el rango de ambos n�meros
		 */
		
		int n1, n2, numero;
		Random random1 = new Random();
		
		Scanner keyboard = new Scanner(System.in);
		do {
		System.out.println("Introduce el primer n�mero: ");
		n1=keyboard.nextInt();
		System.out.println("Introduce el segundo n�mero (debe ser mayor que el anterior): ");
		n2=keyboard.nextInt(); } 
		while (n1 <= n2);
		
		for (int i = 1; i<=15; i++) {
			
			numero = random1.nextInt(n1-n2+1)+n2;
			System.out.println("N� " + i +": " + numero);
		}
		
		
		keyboard.close();
	}

}
