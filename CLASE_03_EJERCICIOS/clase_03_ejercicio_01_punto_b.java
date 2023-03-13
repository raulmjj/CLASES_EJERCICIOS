//punto b_Dados 3 números y un orden (ascendente o decreciente) que ordene los
//mismos y los retorne en un vector de 3

import java.util.Arrays;
import java.util.Scanner;

public class clase_03_ejercicio_01_punto_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[3];

		pedirNumeros(entrada, numeros);
		System.out.println("¿Como quieres ordenar los numeros? (1_ascendente o 2_descendente)");
		int ordenar = entrada.nextInt();

		if (ordenar == 1) {
			ordenarAscendente(numeros);
		} else if (ordenar == 2) {
			ordenarDescendente(numeros);
		} else {
			System.out.println("Opcion incorrecta");
		}
		System.out.println("Los numeros ordenados son:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

	public static void pedirNumeros(Scanner entrada, int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero " + (i + 1) + ":");
			numeros[i] = entrada.nextInt();
		}
	}

	public static void ordenarAscendente(int[] numeros) {
		Arrays.sort(numeros);
	}

	public static void ordenarDescendente(int[] numeros) {
		Arrays.sort(numeros);
		for (int i = 0; i < numeros.length / 2; i++) {
			int temp = numeros[i];
			numeros[i] = numeros[numeros.length - 1 - i];
			numeros[numeros.length - 1 - i] = temp;
		}
	}

}
