package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Introduce la cantidad en pulgadas: ");
		double pulgadas = sc.nextDouble();
		
		double centimetros = pulgadas * 2.54;
		
		System.out.println(pulgadas + " pulgadas equivalen a " + centimetros + " centrímetros");
		
		sc.close();
	}

}
