import java.util.Scanner;
public class FacturacionFIAL {
public static void main(String[] args) {
int opEvento; //1: Teatro. 2: Musica. 3: Artes
int cantidadEntradas, valorEvento=0;
String tipoUsuario; // "Estudiante", "Adulto", "Normal"
String evento1="Teatro", evento2="Musica", evento3="Artes";
boolean tarjeta; //true => dispone tarjeta; false => NO dispone tarjeta
double subtotal, totalFact, descuento = 0;
Scanner tcl = new Scanner(System.in);
System.out.print("DAME TIPO USR (Estudiante, Adulto, Normal): ");
tipoUsuario = tcl.next();
System.out.print("DAME TIPO EVT (1: Teatro. 2: Musica. 3: Artes): ");
opEvento = tcl.nextInt();
System.out.print("DAME # ENTRADAS: ");
cantidadEntradas = tcl.nextInt();
System.out.print("TIENE TARJETA (true => dispone; false => NO dispone)?:");
tarjeta = tcl.nextBoolean();
    switch (opEvento) {
        case 1: valorEvento = 15;
break;
case 2: valorEvento = 10;
break;
case 3: valorEvento = 8;
break;
}
subtotal = (valorEvento * cantidadEntradas);
  /*descuento = (tipoUsuario.equals("Estudiante")) ? (subtotal * 0.2)
*
*/
(subtotal * 0.3);
if (tipoUsuario.equals("Estudiante"))
descuento = subtotal * 0.2;
else if (tipoUsuario.equals("Adulto"))
descuento = subtotal * 0.3;
//descuento = (tarjeta) ? descuento + (subtotal * 0.1) : descuento ;
if (tarjeta)
descuento = descuento + (subtotal * 0.1);
totalFact = subtotal - descuento;
System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
"CLIENTE", "TipoEv", "PrecEv", "TipoUsr",
"Tarjeta", "# Entradas", "Descuentos",
"SubTotal", "TOTAL");
System.out.printf("%s\t%d\t%d\t%s\t%b\t%d\t\t%.2f\t\t%.2f\t\t%.2f\n",
"David",opEvento,valorEvento,tipoUsuario,
tarjeta,cantidadEntradas,descuento,subtotal,totalFact);
}
}
