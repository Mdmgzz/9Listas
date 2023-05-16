package ejer05;

import java.util.HashMap;
import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		int op = 0;
		String nomProd = "";
		double presio = 0;

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// creamos el Hashmap que es el que utilizaremos debido a que es un mapa por que
		// es tipo clave:valor
		HashMap<String, Double> productos = new HashMap<>();

		// mostramos las opciones

		do {
			menu();
			op = sc.nextInt();
			sc.nextLine();
			
			switch (op) {
			case 1: {
				System.out.println("\n" + "Vas a introducir un nuevo producto.");
				System.out.print("Nombre del producto: ");
				nomProd = sc.next();
				sc.nextLine();
				System.out.print("\n" + "Precio del producto: ");
				presio = sc.nextDouble();
				sc.nextLine();
				if (añadirProd(nomProd, presio, productos)==1) {
					System.out.println("El producto EXISTE "+"\n");
				}else {
					System.out.println("AÑADIDO"+"\n");
				}
				break;
			}
			case 2: {
				System.out.println("\n" + "Vas a ELIMINAR un producto.");
				System.out.print("Introduce el nombre del producto a eliminar: ");
				nomProd = sc.next();
				sc.nextLine();
				if (borrar(nomProd, productos)==1) {
					System.out.println("No se encuentra el producto: "+nomProd+"\n");
				}
				break;
			}
			case 3: {
				System.out.println("Lista de Productos: ");
				System.out.println(productos+"\n");
				
				break;
			}
			case 4:{
				System.out.println("Saliendoooou");
			}
			default:
				System.out.println("Opción ERRONEA.");
			}

			}while (op != 4); 
			
		// cerramos scanner
		sc.close();

	}

	public static void menu() {
		System.out.println("1- Alta Producto.");
		System.out.println("2- Baja Producto");
		System.out.println("3- Listar Productos.");
		System.out.println("4-Salir.");
		System.out.println("Seleccione una opsion: ");
	}

	public static int añadirProd(String nombre, double precio, HashMap<String, Double> productos) {
		int esiste = 0;

		if (productos.containsKey(nombre)) {
			esiste = 1;
		} else {
			productos.put(nombre, precio);
		}
		return esiste;
	}

	public static int borrar(String nombre, HashMap<String, Double> productos) {
		int esiste = 0;

		if (!productos.containsKey(nombre)) {
			esiste = 1;
		} else {
			productos.remove(nombre);
		}
		return esiste;

	}

}
