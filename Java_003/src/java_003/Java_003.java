/* Ejercicio_04: Crea una aplicación que a través de una función nos convierta 
una cantidad de euros introducida por teclado a otra moneda, estas pueden ser 
a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de 
euros y la moneda a convertir que será una cadena, este no devolverá ningún valor
y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */
package java_003;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_003 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de euros: ");
        float euros= leer.nextFloat();
        while (euros<=0) {
            System.out.println("Error.\nIngrese una cantidad de euros: ");
            euros= leer.nextFloat();
        }
        boolean aux=false;
        while (aux==false) {
            System.out.println("CONVERSIÓN\n1-Euro a Libra\n2-Euro a Yenes\n3-Euro a Dólares\n4-Salir");
            int opt= leer.nextInt();
            switch (opt) {
                case 1:
                    ConvertirLibra(euros);
                    aux= Preguntar();
                    break;
                case 2:
                    ConvertirYenes(euros);
                    aux= Preguntar();
                    break;
                case 3:
                    ConvertirDolar(euros);
                    aux= Preguntar();
                    break;
                case 4:
                    System.out.println("Finalizando. Gracias por utilizar el programa: ");
                    aux=true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente: ");
            }
        }
    }   
    public static void ConvertirLibra(float euros){
        System.out.println(euros + " es igual a= " + (euros*0.86));
    }
    public static void ConvertirDolar(float euros){
        System.out.println(euros + " es igual a= " + (euros*1.28611));
    }
    public static void ConvertirYenes(float euros){
        System.out.println(euros + " es igual a= " + (euros*129.852));
    }
    public static boolean Preguntar(){
        boolean var;
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Desea realizar otra conversión? S/N");
        String letra= leer.next();
        if (letra.equalsIgnoreCase("s")) {
            var= false;
        } else {
            System.out.println("Finalizando. Gracias por utilizar el programa");
            var=true;
        }
        return var;
    }
}
