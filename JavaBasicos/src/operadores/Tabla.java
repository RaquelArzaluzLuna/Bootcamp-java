//Utilizando un bucle while
//
//1.- Crea una nueva clase llamada Tabla
//2.- Copia el siguiente codigo y verifica que funcione
//3.- Debe imprimir la tabla de multiplicar del n�mero en cuesti�n (solo los primeros 10 n�meros)

package ciclos;
	
import java.util.Scanner;

public class Tabla
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa cualquier n�mero positivo: ");
        int num = sc.nextInt();
                
        System.out.println("Tabla de multiplicar de  " + num);
        
       //Implementa un bucle while que imprima el resultado
        int counter = 1;
        while(counter <= 10) {
        	System.out.println(num + " * " + counter + " = " + (num*counter));
        	counter++;
        }
        
        Table.tabla();
    }
}	

