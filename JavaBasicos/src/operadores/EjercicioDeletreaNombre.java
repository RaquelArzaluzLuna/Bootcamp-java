package operadores;

import java.util.Scanner;

public class EjercicioDeletreaNombre {

	public static void main(String[] args){
		
		 Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre");
		String nombre= sc.nextLine();
		
		char caracter;
		
		for( byte i =0; i <nombre.length(); i++) {
			caracter = nombre.charAt(i);
			if(i == 0) {
			System.out.print("Tu nombre deletreado \n");
			}
			System.out.print("" + caracter);
		}
	}
}
