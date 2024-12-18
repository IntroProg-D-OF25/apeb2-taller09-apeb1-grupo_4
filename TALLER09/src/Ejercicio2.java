/*** Ejercicio 2
Escriba un programa que permita presentar la siguiente serie:
1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos 
 * @author david
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int a = 1, b = 1, aux;
        int primo = 2;
         System.out.print("Ingrese la cantidad de términos: ");
        int numero = tcl.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(a + "/" + primo);

            aux = a + b; 
            a = b;
            b = aux;

            while (true) { 
                boolean esPrimo = true;
                for (int j = 2; j <= Math.sqrt(primo); j++) {
                    if (primo % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    break;
                }
                primo++;
            }
            primo++;
        }
    }
}

