import java.util.Scanner;

public class SistemaCalificaciones {
     String nombreEstudiante;
     String cedula;
    String nombreMateria;
     double notaACD;
     double notaAPE;
     double notaAA;

    // Método para ingresar datos del estudiante (usando el Scanner pasado desde main)
    public void ingresarDatos(Scanner scanner) {
        System.out.print("Ingrese nombre del estudiante: ");
        nombreEstudiante = scanner.nextLine();

        System.out.print("Ingrese cédula: ");
        cedula = scanner.nextLine();

        System.out.print("Ingrese nombre de la materia: ");
        nombreMateria = scanner.nextLine();

        // Validación de la nota ACD
        do {
            System.out.print("Ingrese nota ACD (máximo 3.5): ");
            notaACD = scanner.nextDouble();
            if (notaACD < 0 || notaACD > 3.5) {
                System.out.println("Error: La nota debe estar entre 0 y 3.5");
            }
        } while (notaACD < 0 || notaACD > 3.5);

        // Validación de la nota APE
        do {
            System.out.print("Ingrese nota APE (máximo 3.5): ");
            notaAPE = scanner.nextDouble();
            if (notaAPE < 0 || notaAPE > 3.5) {
                System.out.println("Error: La nota debe estar entre 0 y 3.5");
            }
        } while (notaAPE < 0 || notaAPE > 3.5);

        // Validación de la nota AA
        do {
            System.out.print("Ingrese nota AA (máximo 3.0): ");
            notaAA = scanner.nextDouble();
            if (notaAA < 0 || notaAA > 3.0) {
                System.out.println("Error: La nota debe estar entre 0 y 3.0");
            }
        } while (notaAA < 0 || notaAA > 3.0);

        // Limpiar el buffer del Scanner
        scanner.nextLine();
    }

    // Método para verificar si el estudiante aprobó
    public boolean verificarAprobacion() {
        double totalNotas = notaACD + notaAPE + notaAA;
        return totalNotas >= 7.0;
    }

    // Método para calcular la nota necesaria en recuperación
    public double calcularRecuperacion() {
        double totalActual = notaACD + notaAPE + notaAA;
        double puntosFaltantes = 7.0 - totalActual;
        return Math.min(puntosFaltantes, 3.5);
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("\n--- Informe de Calificaciones ---");
        System.out.println("Estudiante: " + nombreEstudiante);
        System.out.println("Cédula: " + cedula);
        System.out.println("Materia: " + nombreMateria);
        System.out.printf("Nota ACD: %.2f\n", notaACD);
        System.out.printf("Nota APE: %.2f\n", notaAPE);
        System.out.printf("Nota AA: %.2f\n", notaAA);

        if (verificarAprobacion()) {
            System.out.println("Resultado: APROBADO");
        } else {
            System.out.println("Resultado: REPROBADO");
            System.out.printf("Nota de Recuperación Requerida: %.2f\n", calcularRecuperacion());
        }
    }

    // Método principal (main)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese número de estudiantes a evaluar: ");
        int totalEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer después de leer un entero

        int aprobados = 0;
        int reprobados = 0;

        // Bucle para procesar cada estudiante
        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.println("\n--- Evaluación del Estudiante " + (i + 1) + " ---");
            SistemaCalificaciones estudiante = new SistemaCalificaciones();
            estudiante.ingresarDatos(scanner); // Pasamos el Scanner existente
            estudiante.mostrarInformacion();

            if (estudiante.verificarAprobacion()) {
                aprobados++;
            } else {
                reprobados++;
            }

            System.out.println("--------------------");
        }

        // Mostrar estadísticas del curso
        System.out.println("\nEstadísticas del Curso:");
        System.out.println("Total Estudiantes: " + totalEstudiantes);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.printf("Porcentaje Aprobación: %.2f%%\n", (aprobados * 100.0 / totalEstudiantes));

        // Cerrar el Scanner
        scanner.close();
    }
}
