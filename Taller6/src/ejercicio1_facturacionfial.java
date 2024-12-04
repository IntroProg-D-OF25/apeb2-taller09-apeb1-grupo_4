import java.util.Scanner;
public class ejercicio1_facturacionfial {
    public static void main(String[] args) {
        int opEvento;//1:teatro , 2:musica , 3:artes
        int cantidadEntradas, valorEvento = 0;
        String tipoUsuario; //"estudiante", "adulto"
        String evento1 = "Teatro", evento2 = "Musica", evento3 = "artes";
        boolean tarjeta;// true -> dispone tarjeta , false -> no dispone tarjeta
        double subtotal, totalfactura, descuento = 0;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Dame tipo usr (estudiante, adulto, normal)");
        tipoUsuario = tcl.next();
        System.out.println("Dame tipo de evento (1:teatro , 2:musica , 3:artes)");
        opEvento = tcl.nextInt();
        System.out.println("Dame numero de entradas");
        cantidadEntradas = tcl.nextInt();
        System.out.println("Tienes tarjeta?  (true -> dispone tarjeta , false -> no dispone tarjeta)");
        tarjeta = tcl.nextBoolean();
        switch (opEvento) {
            case 1: valorEvento = 15;
                    break;
            case 2: int ValorEvento = 10;
                    break;
            case 3: valorEvento = 8;
                    break;
        } 
        subtotal = (valorEvento * cantidadEntradas);
        //descuento = (tipoUsuario.equals("Estudiante")) ? (Subtotal* 0.20) : (subtotal * 0.30) 
        if (tipoUsuario.equals("Estudiante")) 
            descuento = subtotal * 0.20;
        else if (tipoUsuario.equals("adulto")) 
            descuento = subtotal * 0.30;
        //descuento = (tarjeta)? descuento + (subtotal * 0.1) : descuento;       forma larga
        if (tarjeta)
            descuento = descuento + (subtotal * 0.1);
        totalfactura = subtotal - descuento;
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", 
                "Cliente", "TipoEv", "PrecioEvento", "Tipousr", "Tarjeta", "Descuentos", "#entradas",
                 "Descuentos" ,"subtotal" ,"Total");
        System.out.printf("%s\t%d\t%d\t%s\t%b\t%d\t\t%.2f\t\t%.2f\t\t%.2f\n",
                "David", opEvento, valorEvento, tipoUsuario, tarjeta,
                cantidadEntradas, descuento, subtotal, totalfactura);

    }

}
