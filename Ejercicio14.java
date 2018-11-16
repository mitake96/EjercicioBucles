package tema3_1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	Pedir 2 n�meros (inferior y superior) y pedir el n�mero de intentos
		 * 	Introducir un n�mero comprendido entre x e y
		 *  La m�quina debe adivinar el n�mero en los intentos establecidos
		 *  En cada intento, el usuario le dir� si es mayor o menor
		 *  Al final el usuario indica si ha ganado o no
		 *  Si acierta, el programa finaliza	
		 */
	
		int x, y, intentos,num, aleatorio=0, respuesta;
		boolean salir=false;
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		// Pedir 2 n�meros (inferior y superior) y pedir el n�mero de intentos
		do {
		System.out.println("Primer n�mero (x)");
		x=keyboard.nextInt();
		System.out.println("Segundo n�mero (y) (mayor que el anterior)");
		y=keyboard.nextInt();		
		} while (x>=y);
		
		System.out.println("Introduce el n�mero de intentos");
		intentos=keyboard.nextInt();
		
		// Introducir un n�mero comprendido entre x e y
		do {
		System.out.println("Introduce el n�mero a adivinar por la m�quina (debe estar comprendido entre los n�meros x e y)");
		num=keyboard.nextInt();
		} while(num < x || num > y);
		
		/*  La m�quina debe adivinar el n�mero en los intentos establecidos
		 */
		
		
		
		for (int i=1; i<=intentos && !salir; i++) {
			
			aleatorio=random.nextInt(y-x+1)+x;
			System.out.println(aleatorio);
			
			if (aleatorio == num) {
				System.out.println("�He acertado!");
				salir =true; 
			}
			// En cada intento, el usuario le dir� si es mayor o menor
			else if (aleatorio != num) {
				System.out.println("�Es mayor (1) o menor? (2)");
				respuesta=keyboard.nextInt();
				if (respuesta==1) {
					x=((x+aleatorio)-x)+1;
					
				}
				else if (respuesta==2) {
					
					y=((y+aleatorio)-y)-1;
				}
			}
			
		}
		if (num != aleatorio) {
		System.out.println("He perdido");
		}
		keyboard.close();
	}

}
