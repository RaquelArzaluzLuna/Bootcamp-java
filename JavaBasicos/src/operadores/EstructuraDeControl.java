package operadores;

import java.util.Scanner;

public class EstructuraDeControl {
	public static void main(String[] args) {
		//Estructuras de control de flujo
		//Nos sirve para la toma de desiciones
		
		//Estrucctuars de controld e flujo nos sirve para
		//cambiar el flujo de nuestro programa
		//evaluando una condición y a apartir de la evaluación
		//se realiza acción u otra.
		
		/*if (condicion){
		 codigo
		 }else{
		 codigo
		 }
		 */
		
		System.out.println("Introduce tu edad");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad"); 
			
		}else {
			System.out.println("Eres menor de edad");
		}
		
	}

}
