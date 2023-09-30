package B2;

import java.util.Scanner;

public class ConvertirDolaresAPesos {
    public static void main(String[] args) {
        // Definir la TRM actual en pesos por dólar
        double trm = 4100.0;

        // Crear un objeto Scanner para obtener la cantidad en dólares del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad en dólares: ");

        // Leer la cantidad en dólares
        double dolares = scanner.nextDouble();

        // Calcular el valor en pesos colombianos
        double pesos = dolares * trm;

        // Mostrar el resultado
        System.out.println("El valor en pesos colombianos es: " + pesos);

        // Cerrar el Scanner
        scanner.close();
    }
}