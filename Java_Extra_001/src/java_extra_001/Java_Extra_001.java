/* Ejercicio_11:
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package java_extra_001;

import java.util.Scanner;

/* @author G96xyFast */
public class Java_Extra_001 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una secuencia de carácteres terminada en punto: ");
        String palabra = leer.nextLine();
        while (palabra.equals("") || palabra.equals(" ") || !palabra.substring( palabra.length()-1, palabra.length() ).equals(".")) {
            System.out.println("Error. Ingrese otra palabra: ");
            palabra = leer.nextLine();
        }
        Conversor(palabra);
    }

    public static void Conversor(String palabra) {
        String aux= "";
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.substring(i, i+1)) {
                case "a":
                    aux= aux + "@";
                    break;
                case "e":
                    aux= aux + "#";
                    break;
                case "i":
                    aux= aux + "$";
                    break;
                case "o":
                    aux= aux + "%";
                    break;
                case "u":
                    aux= aux + "*";
                    break;
                default:
                    aux= aux + palabra.substring(i, i+1);
            }
        }
        System.out.println("Palabra final: " + aux);
        /* 
        <<-- FORMA NÜMERO 2 (DENTRO DEL BUCLE 'FOR')-->>
            if (palabra.substring(i, i+1).equalsIgnoreCase("a")) {
                aux= aux + "@";
            } else if (palabra.substring(i, i+1).equalsIgnoreCase("e")) {
                aux= aux + "#";
            } else if (palabra.substring(i, i+1).equalsIgnoreCase("i")) {
                aux= aux + "$";
            } else if (palabra.substring(i, i+1).equalsIgnoreCase("o")) {
                aux= aux + "%";
            } else if (palabra.substring(i, i+1).equalsIgnoreCase("u")) {
                aux= aux + "*";
            } else {
                aux= aux + palabra.substring(i, i+1);
            }
        */
    }
}
