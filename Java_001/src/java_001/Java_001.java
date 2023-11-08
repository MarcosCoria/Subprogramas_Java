/* Ejercicio_01: Crea una aplicación que le pida dos números al usuario y 
este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática 
y deben devolver sus resultados para imprimirlos en el main. */
package java_001;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_001 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        boolean aux = false; // Variable auxiliar
        while (aux == false) {
            System.out.println("MENÚ:\n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n5-salir");
            int opt = leer.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("La suma de los números ingresados es: " + Sumar(num1, num2));
                    aux= Preguntar();
                    break;
                case 2:
                    System.out.println("La resta de los números ingresados es: " + Restar(num1, num2));
                    aux= Preguntar();
                    break;
                case 3:
                    System.out.println("La multiplicación de los números ingresados es: " + Multiplicar(num1, num2));
                    aux= Preguntar();
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error; no se puede dividir 0");
                        aux= Preguntar();
                    } else {
                        System.out.println("La división de los números ingresados es: " + Dividir(num1, num2));
                        aux= Preguntar();
                    }
                    break;
                case 5:
                    System.out.println("Finalizando. Gracias por utilizar el programa");
                    aux = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente: ");
                    ;
            }
        }
    }

    public static int Sumar(int num1, int num2) {
        return (num1 + num2);
    }

    public static int Restar(int num1, int num2) {
        return (num1 - num2);
    }

    public static int Multiplicar(int num1, int num2) {
        return (num1 * num2);
    }

    public static float Dividir(int num1, int num2) {
        float a= num1;
        float b= num2;
        return (a/ b);
    }

    public static boolean Preguntar() {
        Scanner leer = new Scanner(System.in);
        boolean var;
        System.out.println("¿Desea realizar otra operación? S/N");
        String letra = leer.next();
        if (!letra.equalsIgnoreCase("s")) {
            var = true;
            System.out.println("Finalizando. Gracias por usar el programa");
        } else {
            var = false;
        }
        return var;
    }
}
