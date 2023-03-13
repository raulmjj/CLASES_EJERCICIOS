//dado un vector de números, y un número X, que sume todos los números > X y
//retorne el resultado

import java.util.Scanner;

public class clase_03_ejercicio_01_punto_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		 int[] numeros = new int[5];

	        pedirNumeros(entrada, numeros);
	        
	        System.out.println("ingrese un numero");
	        int num=entrada.nextInt();
	        sumaNumeros(numeros,num);        

	}
	 public static void pedirNumeros(Scanner scanner, int[] numeros) {
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Introduce el número " + (i+1) + ":");
	            numeros[i] = scanner.nextInt();
	        }
	    }
	 public static void sumaNumeros(int[] numeros, int num) {
		 int suma=0;
		  for (int i = 0; i < numeros.length; i++) {
			  if (numeros[i] > num) {
	                suma += numeros[i];
	            }
	        }
		  System.out.println("la suma de los numeros mayores que "+num+ " es: "+suma);
	 }

}
