import java.util.Scanner;

public class ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int inicio,fin,opc;
		System.out.println("ingrese los numeros de inicio y fin");
		inicio= entrada.nextInt();
		fin= entrada.nextInt();
		//punto a
		while(inicio<=fin) {
			System.out.println(inicio++);
		}
		//punto b
		while(inicio<=fin) {
			int a=inicio++;
			if(a%2==0) {
			System.out.println(a);
			}
		}
		//punto c
		System.out.println("ingrese 1-Par o 2- Impar");
		opc=entrada.nextInt();
		
		if(opc==1) {
			while(inicio<=fin) {
				int a=inicio++;
				if(a%2==0) {
				System.out.println("numeros pares "+a);
				}
			}
		}if(opc==2) {
			while(inicio<=fin) {
				int a=inicio++;
				if(a%2!=0) {
					System.out.println("numeros impares "+a);
					}
			}
		}
		//punto d
		for (int i = fin; i >= inicio; i--) {
		    if (i % 2 == 0) {
		        System.out.println(i);
		    }
		}


		
	}

}
