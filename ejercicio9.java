
import java.util.Scanner;


public class ejercicio9 {
    public static void main(String[] args) {
        double ladoCuadrado, areaCuadrado, alturaRec, areaTri, areaRec, areaPoligono;
        Scanner geo = new Scanner(System.in);
        
        System.out.print("Ingrese el lado del cuadrado: ");
        ladoCuadrado = geo.nextDouble();
        
        System.out.print("Ingrese la altura del Rectangulo: ");
        alturaRec = geo.nextDouble();
        
        areaCuadrado = Math.pow(ladoCuadrado, 2);
        System.out.println("Area del Cuadrado: " + areaCuadrado);
        
        areaTri = (ladoCuadrado * alturaRec) / 2;
        System.out.println("Area de los triángulos: " + areaTri);
        
        areaRec = (ladoCuadrado * alturaRec);
        System.out.println("Area del Rectangulo: " + areaRec);
        
        areaPoligono = (Math.pow(ladoCuadrado, 2)) + 3 * (ladoCuadrado * alturaRec / 2) + ladoCuadrado * alturaRec;
        System.out.println("El area del Poligono: " + areaPoligono);
    }
}


