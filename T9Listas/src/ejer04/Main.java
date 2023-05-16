package ejer04;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();

		int numero;
		int estrella;
		String seguir = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Quiere seguir introduciendo numeros? (S/N)");
		seguir = sc.next();
		sc.nextLine();

		while (seguir.equalsIgnoreCase("s")) {
			System.out.println("Introduce 5 num: ");
			for (int i = 0; i <5; i++) {
				numero = sc.nextInt();
				sc.nextLine();
				
				if (numeros.containsKey(numero)) {
					numeros.replace(numero, numeros.get(numero) + 1);
				} else {
					numeros.put(numero, 1);
				}
			}
			System.out.println("Introduce 2 ESTRELLAS: ");
			for (int i = 0; i <2; i++) {
				estrella = sc.nextInt();
				sc.nextLine();
				if (estrellas.containsKey(estrella)) {
					estrellas.replace(estrella, estrellas.get(estrella) + 1);
				} else {
					estrellas.put(estrella, 1);
				}
			}
			
			System.out.println("Quiere seguir introduciendo numeros? (S/N)");
			seguir = sc.next();
			sc.nextLine();
		}
		
		System.out.println("Numeros: "+numeros);
		System.out.println("Estrellas: "+estrellas);
		
		
		sc.close();

	}

}
