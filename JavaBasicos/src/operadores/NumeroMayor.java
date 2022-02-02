package operadores;

import java.util.Scanner;

public class NumeroMayor {
	/*
	 * Pedir 3 números al usuario y mostrar un mensaje con el
	 * número mayor
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca el primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca el tercer número: ");
        n3 = sc.nextInt();
        
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El número mayor es: " + n1);                                             
            } else {
                System.out.println("El número mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("El número mayor es: " + n2);
        } else {
            System.out.println("El número mayor es: " + n3);
        }
	}
}
