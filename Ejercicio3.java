package tema3_1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int n1=1, y=1, muyinsf = 0, insf = 0, suf = 0, bien = 0, not = 0, sobr = 0;
	
	Scanner keyboard = new Scanner(System.in);
				
		do {	System.out.println("Introduce una nota entre el 0 y el 10");	
			System.out.println("Nota" + y + ": ");
				n1=keyboard.nextInt();
				y++;
				
				if (n1 >= 0 && n1 <= 2)
					muyinsf++;
				else if (n1 >= 3 && n1 <= 4)
					insf++;
				else if (n1 == 5)
					suf++;
				else if (n1 == 6)
					bien++;
				else if (n1 == 7 || n1 == 8)
					not++;
				else if (n1 == 9 || n1 == 10)
					sobr++;
		
		} while (y <=10);
		
		System.out.println("Muy insuficientes: " + muyinsf);
		System.out.println("Insuficientes: " + insf);
		System.out.println("Suficientes: " + suf);
		System.out.println("Bien: " + bien);
		System.out.println("Notables: " + not);
		System.out.println("Sobresalientes: " + sobr);
		keyboard.close();
	}

}
