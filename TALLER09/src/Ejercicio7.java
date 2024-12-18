/***
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el ciclo,
 * la Dirección de la carrera de Computación a solicitado las siguientes estadísticas en función a los promedios obtenidos del ciclo
 * por estudiantes (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar).
 * Promedio del ciclo, del paralelo C.
 * Listado de estudiantes con su nota por encima del promedio.
 * Listado de estudiantes con su nota por debajo del promedio.
 * Estudiante con la mejor calificación.
 * Estudiante con la calificación mas baja.
 */
import java.util.Random;
public class Ejercicio7 {
    public static void main(String[] args) {
        int numEstudiantes = 28;
        double[] calificaciones = new double[numEstudiantes];
        Random random = new Random();
        for (int i = 0; i < numEstudiantes; i++) {
            calificaciones[i] = Math.round(random.nextDouble() * 10 * 100.0) / 100.0; 
        }
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        double promedioCiclo = suma / numEstudiantes;
        System.out.println("Promedio del ciclo paralelo C: " + String.format("%.2f", promedioCiclo));
        System.out.println("Estudiantes con calificación por encima del promedio:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (calificaciones[i] > promedioCiclo) {
                System.out.printf("Estudiante %d: %.2f%n", i + 1, calificaciones[i]);
            }
        }
        System.out.println("Estudiantes con calificación por debajo del promedio:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (calificaciones[i] < promedioCiclo) {
                System.out.printf("Estudiante %d: %.2f%n", i + 1, calificaciones[i]);
            }
        }
        double mejorCalificacion = calificaciones[0];
        double peorCalificacion = calificaciones[0];
        int indiceMejor = 0;
        int indicePeor = 0;

        for (int i = 1; i < numEstudiantes; i++) {
            if (calificaciones[i] > mejorCalificacion) {
                mejorCalificacion = calificaciones[i];
                indiceMejor = i;
            }
            else 
                if (calificaciones[i] < peorCalificacion) {
                peorCalificacion = calificaciones[i];
                indicePeor = i;
            }
        }
        System.out.printf("Estudiante con la mejor calificación: Estudiante %d con %.2f%n", indiceMejor + 1, mejorCalificacion);
        System.out.printf("Estudiante con la calificación más baja: Estudiante %d con %.2f%n", indicePeor + 1, peorCalificacion);
    }
}
/***
 * Promedio del ciclo paralelo C: 5,48
Estudiantes con calificaci�n por encima del promedio:
Estudiante 3: 8,74
Estudiante 4: 8,59
Estudiante 7: 9,07
Estudiante 12: 9,85
Estudiante 13: 7,67
Estudiante 14: 9,22
Estudiante 15: 7,33
Estudiante 16: 7,95
Estudiante 17: 6,78
Estudiante 19: 6,17
Estudiante 23: 8,37
Estudiante 26: 9,47
Estudiante 27: 6,93
Estudiantes con calificaci�n por debajo del promedio:
Estudiante 1: 5,26
Estudiante 2: 5,19
Estudiante 5: 3,02
Estudiante 6: 3,38
Estudiante 8: 1,45
Estudiante 9: 5,16
Estudiante 10: 4,97
Estudiante 11: 3,23
Estudiante 18: 0,73
Estudiante 20: 2,56
Estudiante 21: 3,42
Estudiante 22: 1,81
Estudiante 24: 0,31
Estudiante 25: 2,53
Estudiante 28: 4,14
Estudiante con la mejor calificaci�n: Estudiante 12 con 9,85
Estudiante con la calificaci�n m�s baja: Estudiante 24 con 0,31
BUILD SUCCESSFUL (total time: 0 seconds) 
 */