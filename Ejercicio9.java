package tema3_1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Crear 2 n�meros entero x y n los cuales se introduzcan por teclado
		 * Calcular x elevado a n sin usar math.pow
		 */
		
		int x, n;
		int elevar = 1;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Primer n�mero");
		x=keyboard.nextInt();
		System.out.println("Segundo n�mero para elevar el anterior");
		n=keyboard.nextInt();
		
		for (int i=1; i<=n; i++) {
			elevar *= x;
			System.out.printf("%d ^ %d = %d \n", x, i, elevar);
			
		}
		keyboard.close();
	}

}
