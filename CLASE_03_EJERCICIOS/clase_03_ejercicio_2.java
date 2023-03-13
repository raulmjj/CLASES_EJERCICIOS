import java.util.Scanner;

public class clase_03_ejercicio_2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        System.out.print("Ingrese un número de desplazamiento: ");
        int desplazamiento = scanner.nextInt();
        scanner.close();
        
        String textoCodificado = codificar(texto, desplazamiento);
        System.out.println("Texto codificado: " + textoCodificado);
        
        String textoDecodificado = decodificar(textoCodificado, desplazamiento);
        System.out.println("Texto decodificado: " + textoDecodificado);
    }

    public static String codificar(String texto, int desplazamiento) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isUpperCase(caracter)) {
                caracter = (char) (((int) caracter + desplazamiento - 65) % 26 + 65);
            } else if (Character.isLowerCase(caracter)) {
                caracter = (char) (((int) caracter + desplazamiento - 97) % 26 + 97);
            }
            resultado += caracter;
        }
        return resultado;
    }

    public static String decodificar(String texto, int desplazamiento) {
        return codificar(texto, 26 - desplazamiento);
}
}