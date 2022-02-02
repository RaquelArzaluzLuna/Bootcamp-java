package operadores;

import java.util.HashSet;
import java.util.Set;

public class Colecciones1 {
	public static void main(String[] args) {
		
		// Las colecciones nos sirven para almacenar un conjunto de objetos
		// La diferencia de las colecciones y los objetos
		// es que las colecciones son din�micas, pueden cambiar
		// el n�mero de objetos agregados
		
		// Set tiene 3 implementaciones
		// no puede contener elementos repetidos
		
		// HashSet
		// los elementos no mantienen un orden
		// es la implementaci�n m�s r�pida
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("pi�a");
		frutas.add("sand�a");
		frutas.add("mamey");
		frutas.add("fresa");
		
		// foreach, puede recorrer una colecci�n y en cada ecorrido
		// recupera el valor y lo podemos almacenar en una variable
		// Sintaxis
		// for(tipoDeDatoElemento variable : elementoARecorrer)
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		
		// TreeSet
		// LinkedHashSet
		
		
	}
}

