package prueba_esteban;
import java.util.Scanner; 
public class Compras {
	public static void main (String args []) {
		///capturar datos tienda A 
		
	    System.out.println("PROGRAMA PARA CALCULAR LA MEJOR OPCIÓN DE COMPRA" + '\n' + '\n' + "***************COTIZACIÓN TIENDA A ************ "); 	
	    Scanner Valores = new Scanner (System.in);
	    String nombre;
	   
		System.out.println("¿cuál es tu nombre?: ");
		nombre = Valores.nextLine();
		System.out.println("¡HOLA " + nombre + "!");
		System.out.println("####Introduzca el precio de las prendas a comprar en la tienda A, recuerda que para obtener el descuento debe comprar minimo tres prendas:####");
		int a = Valores.nextInt();
		int b = Valores.nextInt();
		int c = Valores.nextInt();
		int resultado = a+b+c;
		System.out.println("#### TOTAL A PAGAR SIN DESCUENTOS ES: " + (resultado)  +  " PESOS#### " + '\n'+ '\n' +  "### Introduzca el porcentaje ( sin el signo de %) de descuento que ofrece la tienda ###");
		int Descuento = Valores.nextInt();
		int Totalpagar = (resultado/100) * Descuento;
		int TiendaA = (resultado-Totalpagar);
		System.out.println("#### TOTAL A PAGAR es:  " + (TiendaA) + " PESOS ####" + '\n'+ "¡GRACIAS POR SU COMPRA!" + (  nombre) + '\n');
		
		///capturar datos tienda B
		
		System.out.println("******COTIZACIÓN PARA LA TIENDA B********** "); 	
		Scanner Valoresb = new Scanner (System.in);
		
		System.out.println("####Introduzca el precio de las prendas a comprar en la tienda B, recuerda que para obtener el descuento debe comprar minimo tres prendas:####"+'\n' + "*** PAGA DOS Y LLEVA TRES***" );
		int a2 = Valoresb.nextInt();
		int b2 = Valoresb.nextInt();
		int c2 = Valoresb.nextInt();
		int TiendaB = a2+b2-(c2-c2);
		System.out.println("#### TOTAL A PAGAR  ES: " + (TiendaB) + " PESOS####"+  '\n' + "¡GRACIAS POR SU COMPRA!" + (  nombre) + '\n' );
		
		///capturar datos tienda C
		
		System.out.println("******COTIZACIÓN PARA LA TIENDA C********** "); 	
		Scanner ValoresC = new Scanner (System.in);
		
		System.out.println("####Introduzca el precio de las prendas a comprar en la tienda C, recuerda que debido a su exclusividad no tiene descuentos:####"+ '\n' + "*** MINIMO 3 PRENDAS***" );
		int a3 = ValoresC.nextInt();
		int b3 = ValoresC.nextInt();
		int c3 = ValoresC.nextInt();
		int TiendaC = (a3+b3+c3);
		System.out.println("#### TOTAL A PAGAR  ES: " + (TiendaC) + " PESOS####"+  '\n' + "¡GRACIAS POR SU COMPRA!" + (  nombre) + '\n' );
		
		System.out.println("***COTIZACION COMPLETA*******");
		System.out.println("* TIENDA A :" + (TiendaA) +"*");	
		System.out.println("* TIENDA B :" + (TiendaB) +"*");
		System.out.println("* TIENDA C :" + (TiendaC) +"*");
		System.out.println("*****************************" + '\n');
		
		///Evaluar precio minimo a pagar
		
		int PrecioMinimo = Math.min(TiendaA, TiendaB);
		int PrecioFinal = Math.min(PrecioMinimo, TiendaC);
		System.out.println("****TE RECOMIENDO COMPRAR EN LA TIENDA QUE TIENE EL VALOR TOTAL DE  " + (  PrecioFinal)+ " PESOS****" + '\n'); 
		System.out.println("**** QUE TENGAS UN BUEN DIA " + (   nombre) + "*****");
	}
		
}

