import java.util.Scanner;

public class ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
       float ingresos;
       int vehiculos,inmuebles,opc;
       
		System.out.println("¿cual es el ingreso mensual del hogar?");
		ingresos=entrada.nextFloat();
		System.out.println("¿cuantos vehiculos menores a 5 años de antiguadad posee?");
		vehiculos=entrada.nextInt();
		System.out.println("¿cuantos inmuebles posee?");
		inmuebles=entrada.nextInt();
		System.out.println("¿Posee una embarcación o una aeronave de lujo o es titular de activos"
				+ " societarios que demuestren capacidad económica plena? 1=si / 2=no");
        opc=entrada.nextInt();

       if(ingresos>=489083) {
    	   if(vehiculos>=3) {
    		   if(inmuebles>=3) {
    			   if(opc==1) {
    					System.out.println("Usted pertence al segmento de Ingresos Altos");
    			   }else {
    				   System.out.println("Usted pertence al segmento de Ingresos Bajos");
    			   }
    		   }else {
				   System.out.println("Usted pertence al segmento de Ingresos Bajos");}
    	   }else {
			   System.out.println("Usted pertence al segmento de Ingresos Bajos");}
       }else {
		   System.out.println("Usted pertence al segmento de Ingresos Bajos");}
	}

}
