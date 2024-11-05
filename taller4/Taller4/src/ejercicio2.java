import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        // Bloque de declaracion de variables
    double gastohijo1, gastohijo2, gastohijo3, totalgasto;
    Scanner Teclado = new Scanner (System.in);
    //Bloque de lectura de datos de entrada
        System.out.println("Dame los gastos del hijo 1");
    gastohijo1 = Teclado.nextDouble();
        System.out.println("Dame los gastos del hijo 2");
    gastohijo2 = Teclado.nextDouble();
        System.out.println("Dame los gastos del hijo 3");
    gastohijo3 = Teclado.nextDouble();
    //Bloque de procesamiento 
    totalgasto = gastohijo1 + gastohijo2 + gastohijo3;
    //Bloque de salidad de resultado
        System.out.println("Gasto total = " + totalgasto);
    
    }
}
/***
 * run
 gasto hijo 1
 * 56
 gasto hijo 2
 * 67
 gasto hijo 3
 * 58
 gasto total
 * 181
 */
