import java.util.Scanner;

public class clase_03_ejercicio_01_punto_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String palabra="";
		char letra;
		
		System.out.println("escriba una palabra");
		palabra=entrada.nextLine();
		System.out.println("escriba la letra que desea buscar");
		letra=entrada.next().charAt(0);
		int contador= metodoContar(palabra,letra);
		
		System.out.println("La palabra "+palabra+" tiene "+contador+ " letras:"+letra);
		
	}
	//metodo
	public static int metodoContar(String palabra,char letra) {
		int cont=0;
		 for (int i = 0; i < palabra.length(); i++) {
	            if (palabra.charAt(i) == letra) {
	                cont++;
	            }
	        }
		 return cont;
	}

}
