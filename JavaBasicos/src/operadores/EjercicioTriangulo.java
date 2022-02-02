package operadores;

import java.util.Scanner;

public class EjercicioTriangulo {


	   public static void main(String[] args) {
	     
	       Scanner sc = new Scanner(System.in);
	       double angulo1,angulo2,angulo3;
	       System.out.print("Introduzca el primer ángulo");
	       angulo1 = sc.nextDouble();
	       System.out.print("Introduzca el segundo ángulo");
	       angulo2 = sc.nextDouble();
	       System.out.print("Introduzca el tercer ángulo");
	       angulo3 = sc.nextDouble();
	       
	       if (angulo1 + angulo2 + angulo3 == 180)
	               System.out.println(" Los ángulos corresponden a un triángulo");
	               else{
	               if (angulo1==angulo2 || angulo1==angulo3 || angulo2==angulo3);
	               }
}
}
