package B4;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Jueves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, resultado=0;
        String logFileName = "logs/log.txt";

        try (PrintWriter logWriter = new PrintWriter(new FileWriter(logFileName))) {
            logWriter.println("Inicio del programa.");

            do {
                System.out.print("Ingrese el primer número entero: ");
                numero1 = scanner.nextInt();
                System.out.print("Ingrese el segundo número entero (distinto de cero): ");
                numero2 = scanner.nextInt();

                logWriter.println("Números ingresados: " + numero1 + ", " + numero2);

                if (numero2 == 0) {
                    System.out.println("El segundo número no puede ser cero. Inténtelo de nuevo.");
                    logWriter.println("Intento de división por cero.");
                    continue;
                }

                resultado = numero1 * numero2;
                System.out.println("La multiplicación de los números es: " + resultado);
                logWriter.println("Resultado de la multiplicación: " + resultado);

            } while (resultado <= 10);

            logWriter.println("Fin del programa.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de registro.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}


