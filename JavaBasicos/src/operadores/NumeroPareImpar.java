package operadores;
import java.util.Scanner;

/*
		 * Crear un nuevo proyecto llamado NumeroParImpar
			crear el método main
			crear una función que evalúe si un número es par o impar (se puede usar el operador ternario)
			Imprimir en terminal el resultado
		 	*extra, investigar cómo usar la clase Scanner en java.
	 */ 


public class NumeroPareImpar {
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		

        System.out.printf( "Ingresa el número: " );
        numero = teclado.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.printf( "ES PAR" );
        }
        else
        {
            System.out.printf( "ES IMPAR" );
        }
			
		
	}

}