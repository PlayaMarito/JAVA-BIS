package B2;

import java.util.Scanner;

public class AreaCuadrado {
        public static void main(String[] args) {

            // Crear un objeto Scanner para obtener la longitud del lado del cuadrado
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa la longitud del lado del cuadrado: ");

            // Leer la longitud del lado del cuadrado
            double lado = scanner.nextDouble();

            // Calcular el área del cuadrado
            double area = lado * lado;

            // Mostrar el resultado
            System.out.println("El área del cuadrado es: " + area);

            // Cerrar el Scanner
            scanner.close();
        }



}
