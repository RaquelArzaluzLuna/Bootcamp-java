package operadores;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones1 {
	public static void main(String[] args) {
		
		// Las colecciones nos sirven para almacenar un conjunto de objetos
		// La diferencia de las colecciones y los objetos
		// es que las colecciones son dinámicas, pueden cambiar
		// el número de objetos agregados
		
		// Set tiene 3 implementaciones
		// no puede contener elementos repetidos
		
		// HashSet
		// los elementos no mantienen un orden
		// es la implementación más rápida
		/*Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandía");
		frutas.add("mamey");
		frutas.add("fresa");
		
		// foreach, puede recorrer una colección y en cada ecorrido
		// recupera el valor y lo podemos almacenar en una variable
		// Sintaxis
		// for(tipoDeDatoElemento variable : elementoARecorrer)
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		
		// TreeSet
		// LinkedHashSet
		
		
	}*/
		//List
				//se permiten elementox duplicados
				//acceder a elementos especificos
				//buscar elementos
				
				//ArrayList
				List<String> pokemones = new ArrayList<String>();
				pokemones.add("Charmander");
				pokemones.add("Gengar");
				pokemones.add("Psyduck");
				pokemones.add("Eve");
				pokemones.add("Dragonaite");
				pokemones.add("Meuow");
				pokemones.add("Charizard");
				pokemones.add("Pikachu");
				pokemones.add("Gengar");
				
				// add si agregamos un indice y un elemento, posiciona
				// el elemento en el indice y realiza un desplazamiento
				//es decir no borra el elemnto en la posicion sino 
				// que lo desplaza
				
				pokemones.add(2,"Flygon");
				
				//remove remueve el elemento de la posicion espefifica
				pokemones.remove(6);
				
				// set reemplaza el elemento en la poscion especifica
				pokemones.set (0,"Lugia");
				
				for (String pokemon : pokemones) {
					System.out.println(pokemon);		
				    }
				
				System.out.println("*******");
				System.out.print(pokemones.get(5) + "\n");
				
				// indexof, nos va devolver la posicion del elemento
				//y si el elemento no se encuentra nos devuelve -1
				
				System.out.println("*******");
				System.out.println(pokemones.indexOf("Gengar"));
				System.out.println(pokemones.lastIndexOf("Gengar"));
				System.out.println(pokemones.indexOf("Togepi"));
				
				
				//LinkedList
				// Es una lista doblemente elazada
				List<String> digimones = new LinkedList<String>();
				digimones.add("Agumon");
				digimones.add("Patamon");
				digimones.add("Angemon");
				digimones.add("Andromon");
				digimones.add("Greymon");
				
				
				//Map
				//Asocia claves a valores.
				//No puede contener claves duplicadas
				//Sólo puede tener un valor asociado
				
				//HashMap
				//Tiene mejor rendimiento pero no garantiza un orden
				//a la hora de hacer iteraciones
				
				Map<Integer, String> usuarios = new HashMap <Integer, String>;
				usuarios.put(1,"Raquel Luna");
				usuarios.put(2,"Natata");
				usuarios.put(3,"Benjamín");
				
				System.out.println(usuarios.get(1));
				
				//keySet
				//Nospermite recuperar el nombre de la clave
				System.out.println(usuarios.keySet());
				//values
				//nos permite recuperar el valor directamente
				System.out.println(usuarios.values());
				
				//TreeMap
				Map<Integer, String> tamales = new TreeMap<Integer, String>();
				tamales.put(1, "Mole Rojo");
				tamales.put(9, "Mole Verde");
				tamales.put(1, "Gansito");
				tamales.put(1, "Cochinita");
				
				System.out.println("***********");
				System.out.println(tamales.keySet());
				System.out.println(tamales.keySet());
				
				System.out.println(tamales());
				
				tamales.entrySet().forEach(elemento ->{
					
					System.out.println(elemento.getKey());
					System.out.println(elemento.getValue());
				});
				
				//LinkedHashMap
				Map<Integer, String> Carros = new LinkedHashMap<Integer, String>();
				
				
				
				
				}
				
}

