package operadores;

import java.util.Scanner;

public class NumeroMayor {
	/*
	 * Pedir 3 n�meros al usuario y mostrar un mensaje con el
	 * n�mero mayor
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca el primer n�mero: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca el segundo n�mero: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca el tercer n�mero: ");
        n3 = sc.nextInt();
        
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El n�mero mayor es: " + n1);                                             
            } else {
                System.out.println("El n�mero mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("El n�mero mayor es: " + n2);
        } else {
            System.out.println("El n�mero mayor es: " + n3);
        }
	}
}
