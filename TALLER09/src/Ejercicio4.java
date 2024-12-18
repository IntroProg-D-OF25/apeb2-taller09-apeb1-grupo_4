/***Ejercicio 4
Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética.
int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 * @author david
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        
        int suma = 0;
        for (int valor : arreglo) {
            suma += valor;
        }
        
        double media = (double) suma / arreglo.length;
        int arribaMedia = 0, abajoMedia = 0;

        for (int valor : arreglo) {
            if (valor > media) {
                arribaMedia++;
            } else if (valor < media) {
                abajoMedia++;
            }
        }

        System.out.println("Media aritmética: " + media);
        System.out.println("Elementos arriba de la media: " + arribaMedia);
        System.out.println("Elementos debajo de la media: " + abajoMedia);
    }
}