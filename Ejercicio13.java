package tema3_1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	Pedir 2 n�meros (inferior y superior) y pedir el n�mero de intentos
		 * 	Generar un n�mero aleatorio entre los 2 n�meros 
		 *  El usuario debe adivinar el n�mero en los intentos establecidos
		 *  En cada intento, la m�quina le dir� si es mayor o menor
		 *  Al final el programa indica si ha ganado o no
		 *  Si acierta, el programa finaliza	
		 */		
		
	int x, y, intentos, aleatorio;
	boolean salir = false;
	
	Scanner keyboard = new Scanner(System.in);
	
	//Pedir 2 n�meros (inferior y superior) y pedir el n�mero de intentos
		do {
			
		System.out.println("Primer n�mero");
		x=keyboard.nextInt();
		System.out.println("Segundo n�mero (mayor que el anterior)");
		y=keyboard.nextInt();
		} while (y<=x);
		System.out.println("Introduce el n�mero de intentos");
		intentos=keyboard.nextInt();
		
		
	// Generar un n�mero aleatorio entre los 2 n�meros 
	Random random = new Random();
	aleatorio=random.nextInt(y-x+1)+x; 
	
	
	 /*  El usuario debe adivinar el n�mero en los intentos establecidos
	 *  En cada intento, el usuario le dir� si es mayor o menor
	 *  Al final el programa indica si ha ganado o no
	 *  Si acierta, el programa finaliza
	 */
	
	int try1;
	
	for (int i=1; i<=intentos && !salir ; i++ ) {
		
		System.out.println("Introduce el n�mero genearado por la m�quina");
		try1=keyboard.nextInt();
		
		if (try1==aleatorio) {
			
			
			System.out.println("�Ha ganado!");
		
			salir=true;
		}
		
		else if (try1<aleatorio) {
			System.out.println("Intente un n�mero m�s alto");
		}
		else if (try1>aleatorio) {
			System.out.println("Intente un n�mero m�s bajo");
		}
		
		 if(i==intentos) {
			System.out.println("Has perdido :(");
		
		}
	}	
	
	keyboard.close();
	}

}
