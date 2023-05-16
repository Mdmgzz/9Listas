package ejer02;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		String nombre="";
		
		System.out.println("Para finalizar introduce fin: ");
		System.out.println("Introduce Nombre: ");
		nombre=sc.next();
		
		while(!nombre.equalsIgnoreCase("fin")){
			nombres.add(nombre);
			
			System.out.println("Para finalizar introduce fin: ");
			System.out.println("Introduce Nombre: ");
			nombre=sc.next();
		}
		System.out.println(nombres);
		
		
		sc.close();
	}

}
