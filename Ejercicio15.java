package tema3_1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* El programa tiene que adivinar el tipo 
		 * que será o una vocal mínuscula, un número del 0 al 9 o una consonante minúscula
		 * sin contar la ñ, tiene 2 intentos, si falla el programa termina
		 * 
		 * Si lo acierta tiene que adivinar el número o la letra concreta con los siguientes intentos
		 * Número entre 0 y 9 = 3 intentos // Vocal = 2 intentos // Consonante = 5 intentos
		 * 
		 */
		
		char a = 97, z = 122, vocal;
		int intentos=1, aleatorio, averiguar;
		boolean salir=false;
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Bienvenido, tienes que averiguar el tipo de carácter a adivinar");
		do {
			System.out.println("Introduce el tipo a averiguar: "
				+ "vocal minúscula (1), número del 0 al 9 (2), consonante minúscula(3)"
				+ " (El programa tiene 2 intentos)");
		averiguar=keyboard.nextInt();
		} while (averiguar <1 || averiguar >3);
		
		
		/* El programa tiene que adivinar el tipo 
		 * que será o una vocal mínuscula, un número del 0 al 9 o una consonante minúscula
		 * sin contar la ñ, tiene 2 intentos, si falla el programa termina
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
		// Si lo acierta tiene que adivinar el número o la letra concreta con los siguientes intentos
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
