package tema3_1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner keyboard = new Scanner(System.in);
		int x= 0, y = 0, suma = 0;
		
		do {	System.out.println("Número positivo 1: ");
				x=keyboard.nextInt();
				System.out.println("Número positivo 2: ");
				y=keyboard.nextInt();
				
		} while (x < 0 || y < 0);
		
			for (int i=0;i<y;i++) {
				suma += x;
			}
		System.out.println(suma);
		keyboard.close();
	}

}
