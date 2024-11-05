import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        double costo_netflix, costo_youtube, costo_dropbox, costo_spotify, total_mensual, total_final;
        int edad;
        
        Scanner usuario = new Scanner(System.in);

        System.out.println("Ingrese el costo mensual de Netflix:");
        costo_netflix = usuario.nextDouble();

        System.out.println("Ingrese el costo mensual de YouTube Premium:");
        costo_youtube = usuario.nextDouble();

        System.out.println("Ingrese el costo mensual de Dropbox:");
        costo_dropbox = usuario.nextDouble();

        System.out.println("Ingrese el costo mensual de Spotify:");
        costo_spotify = usuario.nextDouble();

        System.out.println("Ingrese su edad:");
        edad = usuario.nextInt();

        total_mensual = costo_netflix + costo_youtube + costo_dropbox + costo_spotify;

        total_final = total_mensual * (edad < 30 ? 0.8 : 1.0);
        System.out.println("El valor total a pagar mensual es: " + total_final);

    }
        
}
/***
Ingrese el costo mensual de Netflix:
*16
Ingrese el costo mensual de YouTube Premium:
*8
Ingrese el costo mensual de Dropbox:
*7
Ingrese el costo mensual de Spotify:
*6
Ingrese su edad:
*18
El valor total a pagar mensual es: 29.6
 */
