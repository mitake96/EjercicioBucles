package tema3_1;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int numFilas, i;
	
	// Petición del número de filas.
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Introduzca el número de filas para la pirámide");
	numFilas=keyboard.nextInt();
	
	// Pintar ese número de filas
	for (int fila=1;fila<=numFilas;fila++) {
		
	// Qué pintar en cada fila
		
		for (i=1; i<=numFilas-fila;i++) {
			System.out.print(' ');
		}
	// Pintar números
		
		for (i=1; i<=fila;i++) {
			System.out.print(i);
		}
		
	// Pintar la segunda mitad derecha
		
		for (i=fila-1;i>=1;i--) {
			System.out.print(i);
		}
	System.out.printf("\n");         //Se pone un salto de línea porque la línea ha terminado
	
	}
		
   keyboard.close();
	}

}
