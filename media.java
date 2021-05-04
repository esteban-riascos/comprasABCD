package universidad;

import java.util.Scanner;
public class media {

public static void main (String [] args) {
	try (Scanner entero = new Scanner(System.in)) {
		double media [] = new double [5];
		double suma = 0;

		
			System.out.println( "Ingresa cinco números enteros para determinar la media del arreglo \n");	
			
			for (int i = 0; i<5; i++) {
			
				System.out.println(" Ingresa el " + (i+1) +  " número entero");		
				media [i] = entero.nextDouble();
				suma += media [i];
			}
			
			System.out.printf(" La media del arreglo es  " + (suma/5));
	  }		

	}
}
	
