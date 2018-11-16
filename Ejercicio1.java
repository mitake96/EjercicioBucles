package tema3_1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int number, result;

		do {
			System.out.print("Introduzca un número entre el 0 y el 10: ");
			number = keyboard.nextInt();

		} while (number < 0 || number > 10);
		
		for (int i = 1; i <=10; i++) {
			result = number * i;
			System.out.printf("%d x %d = %d %n",number,i,result);
		}

		keyboard.close();
		
		
	}

}
