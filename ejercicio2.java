
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        double gasto1, gasto2, gasto3, gastototal;
                Scanner gastos = new Scanner(System.in);
                System.out.println("ingrese el gasto 1: ");
                gasto1 = gastos.nextDouble();
                System.out.println("ingrese el gasto 2: ");
                gasto2 = gastos.nextDouble();
                System.out.println("ingrese el gasto 3: ");
                gasto3 = gastos.nextDouble();
                gastototal = (gasto1 + gasto2 + gasto3);
                System.out.println("el gato total es " + gastototal);
                
                
    }
}
