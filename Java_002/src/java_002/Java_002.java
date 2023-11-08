/* Ejercicio_02: Diseñe una función que pida el nombre y la edad de N personas e 
imprima los datos de las personas ingresadas por teclado e indique si son mayores
o menores de edad. Después de cada persona, el programa debe preguntarle al usuario
si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”. */
package java_002;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_002 {
    public static void main(String[] args) {
        boolean aux= false;
        while (aux==false) {
            PedirDatos();
            aux= Preguntar();
        }
    }
    public static void PedirDatos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre= leer.next();
        System.out.println("Ingrese edad: ");
        int edad= leer.nextInt();
        while (edad<=0) {
            System.out.println("Error. Ingrese la edad nuevamente: ");
            edad= leer.nextInt();
        }
        if (edad>=18) {
            System.out.println(nombre + " es mayor de edad");
        } else{
            System.out.println(nombre + " es menor de edad");
        }
    }
    public static boolean Preguntar(){
        Scanner leer = new Scanner(System.in);
        boolean var=false;
        System.out.println("¿Desea ingresar datos de otra persona? S/N");
        String letra= leer.next();
        if (!letra.equalsIgnoreCase("s")) {
            System.out.println("Finalizando. Gracias por utilizar el programa");
            var=true;
        }
        return var;
    }
}
