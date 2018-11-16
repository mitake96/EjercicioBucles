package tema3_1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Pedir un número M porteclado
		 * Hacer una cuenta que calcule 1+2+3+n hasta que el resultado 
		 * sea mayor que m
		 */
		
		int n=1,m, cuenta=0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce un número");
		m=keyboard.nextInt();
		
		for (int i=n; cuenta<=m; i++) {
			cuenta += i;
			
			System.out.printf("%d + ", i);
		}
			System.out.println("\n" + cuenta);
		
		keyboard.close();
	}

}
