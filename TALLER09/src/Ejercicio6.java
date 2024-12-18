/***Analice el siguiente código
Scanner entrada = new Scanner(System.in);
String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
String inicial;
boolean bandera = true;
while(bandera){
    System.out.println("Ingrese una letra");
    inicial = entrada.nextLine();
 * @author david
 */
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String letraIngresada;
        boolean encontrado = false;

        while (!encontrado) {
            System.out.print("Ingresa una letra: ");
            letraIngresada = scanner.nextLine().toUpperCase();

            for (String nombre : nombres) {
                if (nombre.toUpperCase().startsWith(letraIngresada)) {
                    System.out.println("¡Nombre encontrado: " + nombre + "!");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún nombre con esa letra, intenta de nuevo.");
            }
        }

        System.out.println("Fin del programa.");
    }
}