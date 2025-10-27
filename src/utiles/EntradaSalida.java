/*
** Utiles de entrada/salida
*/

/* PAQUETE */
package utiles;

/* LIBRERIA */
import java.util.Scanner;

public class EntradaSalida {
    /* CONSTANTES */
    public static final Scanner sc = new Scanner(System.in);

    /* METODOS */

    /* PINTAR POR PANTALLA */
    public static void escribirMensaje(String texto) {
        System.out.print(texto);
    }

    public static void escribirMensajeError(String texto) {
        System.err.print(texto);
    }

    /* VALIDACION DE ENTRADAS */
    public static int validarEntero() {
        while (!sc.hasNextInt()) {
            escribirMensajeError("ERROR: El valor introducido no es un número entero.\nInténtalo de nuevo: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static double validarDecimal() {
        while (!sc.hasNextDouble()) {
            escribirMensajeError("ERROR: El valor introducido no es un número.\nInténtalo de nuevo: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    /* SCANNER */
    public static void cerrarScanner() {
        sc.close();
    }
}
