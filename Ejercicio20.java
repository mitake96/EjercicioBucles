package tema3_1;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int numFilas, i;
	
	// Petici�n del n�mero de filas.
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Introduzca el n�mero de filas para la pir�mide");
	numFilas=keyboard.nextInt();
	
	// Pintar ese n�mero de filas
	for (int fila=1;fila<=numFilas;fila++) {
		
	// Qu� pintar en cada fila
		
		for (i=1; i<=numFilas-fila;i++) {
			System.out.print(' ');
		}
	// Pintar n�meros
		
		for (i=1; i<=fila;i++) {
			System.out.print(i);
		}
		
	// Pintar la segunda mitad derecha
		
		for (i=fila-1;i>=1;i--) {
			System.out.print(i);
		}
	System.out.printf("\n");         //Se pone un salto de l�nea porque la l�nea ha terminado
	
	}
		
   keyboard.close();
	}

}
