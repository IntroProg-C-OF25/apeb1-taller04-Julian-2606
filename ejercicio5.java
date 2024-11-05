
import java.util.Scanner;


public class ejercicio5 {
    public static void main (String[] args) {
        double CPU, teclado, pantalla, raton, precioT;
        Scanner compu = new Scanner (System.in) ;
        System.out.print("Presupuesto del CPU: ");
        CPU = compu. nextDouble ();
        System.out.print("Presupuesto del teclado: ");
        teclado = compu.nextDouble () ;
        System.out.print("Presupuesto de la Pantalla: ");
        pantalla = compu. nextDouble ();
        System.out.print("Presupuesto del ratón: ");
        raton = compu.nextDouble();
        precioT = CPU + teclado + pantalla + raton;
        System.out.println("El precio es de: " + precioT);
    }

}