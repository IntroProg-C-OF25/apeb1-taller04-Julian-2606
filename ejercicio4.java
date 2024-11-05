import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS DE ENTRADA
        double costoMinuto, cantidadMinutos, valorPlantilla;
        //BLOQUE DE ENTRADA DE DATOS
        Scanner teclado = new Scanner(System.in);
        System.out.println("DAME COSTO POR MINUTO: ");
        costoMinuto = teclado.nextDouble();
        System.out.println("DAME LA CANTIDAD DE MINUTOS: ");
        cantidadMinutos = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA
        valorPlantilla = costoMinuto * cantidadMinutos;
        //BLOQUE DE SALIDA DE RESULTADOS 
        System.out.println("valorPlantilla = " + valorPlantilla );
    }
}
