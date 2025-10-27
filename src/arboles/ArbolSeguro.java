/*
** ARBOL SEGURO
** Arbol para cuando la consola no permite codigo ANSI, o solo lo permite parcialmente
*/

/* PAQUETE */
package arboles;

/* LIBRERIAS */
import utiles.EntradaSalida;

// Clase ArbolSeguro, hija de la clase Arbol, implementa la interfaz IArbol
public class ArbolSeguro extends Arbol implements IArbol {
    /* METODO PRINCIPAL */
    public void crearArbol() {
        // Hojas - no necesita dicho parametro para nada
        // Pero es mas sencillo cumplir asi con la interfaz
        crearHojas(null);

        // Maceta
        crearMaceta();

        EntradaSalida.escribirMensaje("\n¡Feliz Navidad!");
    }

    /* METODOS AUXILIARES */
    // Parametro "tiempo" no se usa
    public void crearHojas(Integer tiempo) {
        // Empieza en 1...
        for (int alto = 1; alto <= ALTURA_ARBOL; alto++) {
            // ...porque en 0 imprime una linea de mas al principio
            // Triangulo "invisible" a la inversa para crear los espacios
            for (int largo = ALTURA_ARBOL; largo > alto; largo--) {
                EntradaSalida.escribirMensaje(" ");
            }

            // Estrellita
            if (alto == 1) {
                EntradaSalida.escribirMensaje("*");
            }

            // Triangulo de izquierda a derecha
            for (int largo = 1; largo < alto; largo++) {
                if (largo % 2 == 0) {
                    EntradaSalida.escribirMensaje("o");
                } else {
                    EntradaSalida.escribirMensaje("+");
                }
            }

            // Triangulo de derecha a izquierda (empieza en 1 para que sea impar)
            // Se puede ver mejor si en lugar de ambos ser "*" uno es otro simbolo
            for (int largo = 1; largo < alto; largo++) {
                if (largo % 2 == 0 && largo != alto - 1) {
                    EntradaSalida.escribirMensaje("o");
                } else {
                    EntradaSalida.escribirMensaje("+");
                }
            }

            // Salto de linea por cada iteracion externa
            EntradaSalida.escribirMensaje("\n");
        }
    }

    public void crearMaceta() {
        for (int alto = 0; alto < ALTURA_MACETA; alto++) {
            for (int largo = 0; largo < DESPLAZAMIENTO; largo++) {
                EntradaSalida.escribirMensaje(" ");
            }

            for (int largo = 0; largo < LARGO_MACETA; largo++) {
                EntradaSalida.escribirMensaje("#");
            }

            EntradaSalida.escribirMensaje("\n");
        }
    }
}
