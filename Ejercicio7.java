package tema3_1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Introducir 2 valores enteros (a y b) 
		 * Calcular la suma de los pares y la suma de los impares entre los números comprendidos entre a y b (a debe ser mayor que b)
		 */
		
		int a, b, suma1= 0, suma2=0;
		
	Scanner keyboard = new Scanner(System.in);	
	do {
	System.out.println("Introduzca un número ");
	a = keyboard.nextInt();
	System.out.println("Introduzca un número menor que el anterior");
	b = keyboard.nextInt();
	
	 if (a < b) {
		 System.out.println("Error");
	 }
	}
	while (a < b);
	
	for (int i=a;i<=b;i++) {
		if (i%2==0) {
			suma1+=i;
			System.out.print(suma1);
		}
		else {
			suma2+=i;
			System.out.print(suma2);
		}
		
	}
	
	
	keyboard.close();	
	}

}
