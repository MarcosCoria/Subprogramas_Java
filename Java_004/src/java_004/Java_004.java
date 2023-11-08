/* Ejercicio-04: Crea una aplicación que nos pida un número por teclado y con una función
se lo pasamos por parámetro para que nos indique si es o no un número primo, debe devolver 
true si es primo, sino false. Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo. */
package java_004;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_004 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean aux = false;
        while (aux == false) {
            System.out.println("Ingrese un número: ");
            int num = leer.nextInt();
            boolean var = EsPrimo(num);
            if (var == true) {
                System.out.println(num + " es un número primo");
            } else {
                System.out.println(num + " no es un número primo");
            }
            aux= Preguntar();
        }
    }
    public static boolean EsPrimo(int num) {
        boolean var = false;
        int aux = 0;
        for (int i = 1; i < num; i++) {
            // Se puede determinar el resto de una división con '%'
            if (num % i == 0) {
                aux++;
            }
        }
        if (aux < 2) {
            var = true;
        }
        return var;
    }
    public static boolean Preguntar(){
        Scanner leer = new Scanner(System.in);
        boolean var= false;
        System.out.println("¿Desea agregar un nuevo número? S/N");
        String letra= leer.next();
        if (!letra.equalsIgnoreCase("s")) {
            System.out.println("Finalizando. Gracias por utilizar el programa");
            var=true;
        }
        return var;
    }
}
