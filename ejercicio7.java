
import java.util.Scanner;


public class ejercicio7 {
    public static void main(String[] args) {
        Scanner luz = new Scanner(System.in);
        double costoK, numK, edadUsuario, valorPla, descuento, total = 0;
        System.out.println("ingrese el costo por Kilovatio/hora: ");
        costoK = luz.nextDouble();
        System.out.println("ingrese el numero de Kilovatios consumidos al mes: ");
        numK = luz.nextDouble();
        System.out.println("ingrese la edad del usuario: ");
        edadUsuario = luz.nextInt();
        valorPla = costoK * numK;
        System.out.println("EL VALOR ES DE: " + valorPla);
        if (edadUsuario > 65) {;
        descuento = valorPla * 0.10;
        total = valorPla -= descuento;
        }
        System.out.println("el valor total a pagar es: " + total);
        
    }
}
