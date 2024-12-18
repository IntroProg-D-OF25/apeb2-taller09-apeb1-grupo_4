/***
 * Genera una aplicación que permita ingresar valores a un arreglo de cadenas. 
 * El arreglo almacena el número de elementos que el usuario lo disponga. 
 * Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.
 * Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe permitir ingresar ese número elementos.
 * Considerar las siguientes excepciones, no se contabilizan dentro del número de elementos, marcas que empiecen con las letras A, C, T.
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de marcas que desea registrar: ");
        int numeroDeMarcas = scanner.nextInt();
        scanner.nextLine(); 
        String[] marcas = new String[numeroDeMarcas];
        int contador = 0;
        while (contador < numeroDeMarcas) {
            System.out.print("Ingrese la marca de vehículo: ");
            String marca = scanner.nextLine();
            if (marca.length() > 0) {
                if (marca.equals("A") || marca.equals("C") || marca.equals("T") || 
                    marca.startsWith("A") || marca.startsWith("C") || marca.startsWith("T")) {
                    System.out.println("La marca no se contabiliza. Intente nuevamente.");
                } else {
                    marcas[contador] = marca;
                    contador++;
                }
            } else {
                System.out.println("La marca no puede estar vacía. Intente nuevamente.");
            }
        }
        System.out.println("\nMarcas de vehículos ingresadas:");
        for (int i = 0; i < marcas.length; i++) {
            System.out.println(marcas[i]);
        }
       
    }
}
/***
 * Ingrese el n�mero de marcas que desea registrar: 3
Ingrese la marca de veh�culo: Nissan
Ingrese la marca de veh�culo: Toyota
La marca no se contabiliza. Intente nuevamente.
Ingrese la marca de veh�culo: Chevrolet
La marca no se contabiliza. Intente nuevamente.
Ingrese la marca de veh�culo: Ford
Ingrese la marca de veh�culo: Skyline
Marcas de veh�culos ingresadas:
Nissan
Ford
Skyline
BUILD SUCCESSFUL (total time: 1 minute 23 seconds)
 */
