package ciclos;

import java.util.Scanner;

public class Table {
	
	public static void tabla() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Qu� n�mero deseas imprimir?: ");
		int numero = sc.nextInt();
		
		System.out.print("�Hasta qu� n�mero deseas imprimir?: ");
		int stop = sc.nextInt();
		
		for(int i=1; i<=stop; i++) {
			System.out.println(numero + " * " + i + " = " + (numero*i));
		}
	}

}
