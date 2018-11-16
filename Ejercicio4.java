package tema3_1;

import java.util.Random;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int dado;
		for (int i = 1; i <= 20; i++) {
			
			dado = random.nextInt(6)+1;
			System.out.println("Dado " + i +": "+ dado);
		}
		
	
	}

}
