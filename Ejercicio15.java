package tema3_1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* El programa tiene que adivinar el tipo 
		 * que ser� o una vocal m�nuscula, un n�mero del 0 al 9 o una consonante min�scula
		 * sin contar la �, tiene 2 intentos, si falla el programa termina
		 * 
		 * Si lo acierta tiene que adivinar el n�mero o la letra concreta con los siguientes intentos
		 * N�mero entre 0 y 9 = 3 intentos // Vocal = 2 intentos // Consonante = 5 intentos
		 * 
		 */
		
		char a = 97, z = 122, vocal;
		int intentos=1, aleatorio, averiguar;
		boolean salir=false;
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Bienvenido, tienes que averiguar el tipo de car�cter a adivinar");
		do {
			System.out.println("Introduce el tipo a averiguar: "
				+ "vocal min�scula (1), n�mero del 0 al 9 (2), consonante min�scula(3)"
				+ " (El programa tiene 2 intentos)");
		averiguar=keyboard.nextInt();
		} while (averiguar <1 || averiguar >3);
		
		
		/* El programa tiene que adivinar el tipo 
		 * que ser� o una vocal m�nuscula, un n�mero del 0 al 9 o una consonante min�scula
		 * sin contar la �, tiene 2 intentos, si falla el programa termina
		 */
		for(int i = 0; i<=intentos && !salir; i++ ) {
			aleatorio=random.nextInt(3-1+1)+1;
			System.out.println(aleatorio);
			
			if (aleatorio==averiguar) {
				System.out.println("Primera parte acertada");
				salir=true;
			}
			else if (i==1 && aleatorio!=averiguar) {
				System.out.println("El programa se ha terminado");
				System.exit(0);;
			}
			else if (aleatorio!=averiguar) {
				System.out.println("Intento fallido, procedo a intentarlo de nuevo");
			}
											
		}
		// Si lo acierta tiene que adivinar el n�mero o la letra concreta con los siguientes intentos
		int vocal1;
		
		System.out.println("Introduzca la vocal a averiguar");
		vocal1=keyboard.nextInt();
		 
			
		
		do {
			vocal = (char) (random.nextInt(z - a + 1) + a);
		} while (vocal != 97 && vocal != 101 && vocal != 105 && vocal != 111 && vocal != 117);
	    
	    System.out.println(vocal);
	  
	
		
	  
		
		keyboard.close();
	}

}
