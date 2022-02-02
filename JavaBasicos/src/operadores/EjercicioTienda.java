package operadores;

import java.util.Scanner;

public class EjercicioTienda {
 // solicitar el total de una compra por consola.
	// si la cuenta es de menos de 1000
	// si la cuenta es de menos de 1000
			// sila cuenta es de 1000 - 4999 10%
			// si la cuenta es de 5000 a 9999 20%
			// si la copra es de 10000 o más 30%


	public static void main(String[] args) {
		 
		double descuento = 0;
		double compra = 0;
		double montototal = 0;
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Introduzca el total de compra:");
		 compra=sc.nextDouble();
		 
		 System.out.print("El total de su compra es:" + compra);
		 
		 if(compra > 1001) {
			 compra=descuento*0.10;
		 }else if(compra>= 5001) {
				 descuento=compra*0.20;
			 }else if(compra < 10000) {
					 descuento=compra*0.30;
				 }
		 
		 System.out.print("El descuento es de:" + descuento);
		 
		 montototal= compra-descuento;
		 
		 System.out.print("El mónto total es:" + montototal);
}
}

