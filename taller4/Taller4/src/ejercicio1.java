import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        //Bloque declaraciuon de varaibales -> Datos de entrada y salida
        double baseTriang, altoTriang, areaTriang;
        Scanner teclado = new Scanner(System.in); // Para leer valores de consola
        //Bloque de procesamineto de adtos de entrada
        System.out.println("Dame la base del T");
        baseTriang = teclado.nextDouble();
        System.out.print("dame la altura del T");
        altoTriang = teclado.nextDouble();
        //Bloque DE PROCESAMIENTO DE DATOS DE ENTRADA LEIDOS
        areaTriang = (baseTriang * altoTriang) /2;
        // BLOQUE DE SALIDA DE RESULTADOS
        System.out.println( "Area del T. =" + areaTriang);
    }
    
}
/***
 * run
Dame la base del t:
* 23
Dame la altura del t:
* 43
Area del t:
* 494.5
* /


