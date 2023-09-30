import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Promedio de Notas de 5 estudiantes");

        int numEstudiantes = 5;
        double[] promedios = new double[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("\nEstudiante " + (i + 1));

            double sumaNotas = 0.0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Ingrese la nota " + j + ": ");
                double nota = scanner.nextDouble();
                sumaNotas += nota;
            }

            promedios[i] = sumaNotas / 5;
        }

        System.out.println("\nPromedio de Notas de los Estudiantes:");

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + promedios[i]);
        }

        scanner.close();
    }
}
