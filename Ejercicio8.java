package tema3_1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* / Introducir 2 números, A debe ser menor que B
		 * Con un bucle for de 2 contadores, hacer que a aumente el doble de su valor y b disminuya el suyo hasta que A sea mayor que B
		 */
		
		int a, b, i, j;
		Scanner keyboard = new Scanner(System.in);
		do {
		
		System.out.println("Introduzca un número");
		a=keyboard.nextInt();
		System.out.println("Introduzca un número mayor que el anterior");
		b=keyboard.nextInt();
		
		} while (a>b);

		
		
		for (i=a, j=b; i<j;i*=2,j/=2) {
			System.out.println("Primer número " + i);
			System.out.println("Segundo numero " + j);
			
		}
		keyboard.close();
	}

}
