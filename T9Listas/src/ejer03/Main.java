package ejer03;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		//en vez de un arraylist utilizamos treeset para mantener un orden alfabetico
		TreeSet<String> nombres = new TreeSet<String>();
		
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
