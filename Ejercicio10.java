package tema3_1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Pedir un número positivo por teclado
		 * Calcular el factorial del mismo
		 */
		
		int x, factorial=1;
		
		Scanner keyboard = new Scanner(System.in);
		do{
		System.out.println("Introduzca un número");
		x=keyboard.nextInt();
		} while (x<0);
		
		while ( x!=0) {
			factorial*=x;
			x--;
		}
		System.out.printf("%d ",factorial);
		keyboard.close();
	}

}
