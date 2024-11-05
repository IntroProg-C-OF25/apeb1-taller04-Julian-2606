
import java.util.Scanner;


public class ejercicio6 {
    public static void main(String[] args) {
        Scanner prestamo = new Scanner(System.in);
        double montoPrest, interesM, numMeses, pagoM;
        System.out.println("ingrese el monto del prestamo: ");
        montoPrest = prestamo.nextDouble();
        System.out.println("ingresar el interes mensual: ");
        interesM = prestamo.nextDouble();
        System.out.println("ingrese el numero de meses: ");
        numMeses = prestamo.nextDouble();
        pagoM = montoPrest * interesM * (Math.pow(1 + interesM,numMeses)) / (Math.pow(1+interesM,numMeses)) - 1;
        System.out.println("el pago mensual es de: " + pagoM);
        
    }
}
