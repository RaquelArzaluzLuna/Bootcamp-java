/*
 *Crea una clase llamada ManipularArreglo
 *crea un array con los siguientes n�meros enteros:
 *
 * 1, 6, 45, 53, 80, 102, 145, 326, 450, 892
 * Crea un programa que use un ciclo que tome los n�meros de arreglo y devuelva la suma total
 * la suma de los n�meros pares y la suma de los n�meros impares.
 */

package arreglos;

import java.util.Arrays;

public class ManipularArreglo {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		//int sumaTotal = 0;
		//int sumaPares = 0;
		//int sumaImpares = 0;
		
//		for(int i=0; i<arr.length; i++) {
//			sumaTotal += arr[i];
//			sumaPares += (arr[i]%2 == 0) ? arr[i] : 0;
//			sumaImpares += (arr[i]%2 != 0) ? arr[i] : 0;
//		}
		
		int sumaTotal = Arrays.stream(arr).reduce(0, (a,b)-> a+b);
		int sumaPares = Arrays.stream(arr).filter(p -> p%2 == 0).reduce(0, (a,b)-> a+b);
		int sumaImpares = Arrays.stream(arr).filter(p -> p%2 != 0).reduce(0, (a,b)-> a+b);
		
		System.out.println("Suma total: " + sumaTotal);
		System.out.println("Suma pares: " + sumaPares);
		System.out.println("Suma impares: " + sumaImpares);
		
	}
}
