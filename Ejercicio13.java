package tema3_1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	Pedir 2 números (inferior y superior) y pedir el número de intentos
		 * 	Generar un número aleatorio entre los 2 números 
		 *  El usuario debe adivinar el número en los intentos establecidos
		 *  En cada intento, la máquina le dirá si es mayor o menor
		 *  Al final el programa indica si ha ganado o no
		 *  Si acierta, el programa finaliza	
		 */		
		
	int x, y, intentos, aleatorio;
	boolean salir = false;
	
	Scanner keyboard = new Scanner(System.in);
	
	//Pedir 2 números (inferior y superior) y pedir el número de intentos
		do {
			
		System.out.println("Primer número");
		x=keyboard.nextInt();
		System.out.println("Segundo número (mayor que el anterior)");
		y=keyboard.nextInt();
		} while (y<=x);
		System.out.println("Introduce el número de intentos");
		intentos=keyboard.nextInt();
		
		
	// Generar un número aleatorio entre los 2 números 
	Random random = new Random();
	aleatorio=random.nextInt(y-x+1)+x; 
	
	
	 /*  El usuario debe adivinar el número en los intentos establecidos
	 *  En cada intento, el usuario le dirá si es mayor o menor
	 *  Al final el programa indica si ha ganado o no
	 *  Si acierta, el programa finaliza
	 */
	
	int try1;
	
	for (int i=1; i<=intentos && !salir ; i++ ) {
		
		System.out.println("Introduce el número genearado por la máquina");
		try1=keyboard.nextInt();
		
		if (try1==aleatorio) {
			
			
			System.out.println("¡Ha ganado!");
		
			salir=true;
		}
		
		else if (try1<aleatorio) {
			System.out.println("Intente un número más alto");
		}
		else if (try1>aleatorio) {
			System.out.println("Intente un número más bajo");
		}
		
		 if(i==intentos) {
			System.out.println("Has perdido :(");
		
		}
	}	
	
	keyboard.close();
	}

}
