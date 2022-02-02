package ciclos;

public class Ciclos {

	public static void main(String[] args) {
		// while
		
		int control = 0;
		
		while(control < 10) {
			System.out.println("Control = " + control);
			control++;
		}
		
		// do while
		control = 0;
		do {
			// c�digo a ejecutar
			System.out.println("Control = " + control);
			// modificador de la variable control
			control++;
		} while(control < 3);
		
		// for
		for(int i=0; i<3; i++) {
			System.out.println("Control = " + i);
		}
		
		// break & continue
		for(int i=0; i<10; i++) {
			if(i%2 == 0) { // s�lo se muestra cuando el valor de i sea n�mero par
				System.out.println("Control = " + i);
				break; // termina el ciclo
				// s�lo deja que se ejecuta una vez lo que est� antes
			}
		}

		for(int i=0; i<10; i++) {
			if(i%2 == 0) { // s�lo se muestra cuando el valor de i sea n�mero par

				continue;
			}
			System.out.println("Control = " + i);
		}
		
	}
}
