/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio58 {

	public static void main(String[] args) {
		boolean com = true;

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un Numero");

		int Num = scan.nextInt();

		String tabla[][] = new String[Num][Num];

		//String salto = scan.nextLine();
		
		//ANTES
		
		if (Num >= 3 && Num <= 5) {

			for (int i = 0; i < tabla.length; i++) {
				for (int x = 0; x < tabla[i].length; x++) {
					System.out.println("Introduce un Nombre");
					if (scan.hasNextLine() == true) {
						tabla[i][x] = scan.nextLine();
					} else {
						System.out.println("Debe ser un nombre");
					}
				}
			}

			for (int i = 0; i < tabla.length; i++) {
				for (int y = 0; y < tabla[i].length; y++) {
					System.out.print(tabla[i][y] + " ");
				}

				System.out.println("");
			}
		} else {
			System.out.println("El numero debe ser Comprendido entre 3 y 5");
		}
		
		
		//AHORA
		//Ejercicio 58 trata de crear una matriz dadle un tamanio el maximo de la matriz
		//y ir rellenandolo de nombres.
		
		while (com) {
			if (Num >= 3 && Num <= 5) {
				for (int i = 0; i < tabla.length; i++) {
					for(int x = 0;x<tabla.length;x++) {
						
						if (scan.hasNextLine()) {
							System.out.println("Introduce el nombre");
							tabla[i][x] = scan.next();
						}else {
							scan.next();
							x--;
							System.out.println("Debe ser un nombre");
						}
						
						
						if(i==tabla.length-1) {
							com = false;
						}
					}
						
				}

			}else {
				System.out.println("El numero debe ser entre 3 y 5");
			}

		}
		
		for (int i = 0; i < tabla.length; i++) {
			for (int y = 0; y < tabla[i].length; y++) {
				System.out.print(tabla[i][y] + " ");
			}

			System.out.println("");
		}
		
		
		
		System.out.println("HOLA");
	}

}
