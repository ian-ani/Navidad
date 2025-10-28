/*
** ARBOL SEGURO
** Arbol para cuando la consola no permite codigo ANSI, o solo lo permite parcialmente
*/

/* PAQUETE */
package arboles;

/* LIBRERIAS */
import model.Colores;
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
        for (int alto = 0; alto < ALTURA_ARBOL; alto++) {
            for (int largo = 0; largo < (ALTURA_ARBOL * 2) - 1; largo++) {
                // Rango:
                // alto = 2 --> rango de largo >= 3 hasta alto <= 7
                // alto = 3 --> rango de largo >= 2 hasta alto <= 8
                if (largo >= (ALTURA_ARBOL - 1) - alto && largo <= (ALTURA_ARBOL - 1) + alto) {
                    // Estrellita
                    if (alto == 0) {
                        EntradaSalida.escribirMensaje("*");
                        continue;
                    }

                    // Si alto y largo son pares, pon bolitas
                    // Asi hay un espacio de separacion, tanto verticalmente como horizontalmente
                    if (largo % 2 == 0 && alto % 2 == 0) {
                        EntradaSalida.escribirMensaje("o");
                    } else {
                        EntradaSalida.escribirMensaje("+");
                    }
                } else {
                    EntradaSalida.escribirMensaje(" ");
                }
            }

            // Salto de linea por cada iteracion externa
            EntradaSalida.escribirMensaje("\n");
        }
    }

    public void crearMaceta() {
        for (int alto = 0; alto < ALTURA_MACETA; alto++) {
            for (int largo = 0; largo <= LARGO_MACETA * 2; largo++) {
                if (largo >= (LARGO_MACETA - 1)) {
                    EntradaSalida.escribirMensaje("#");
                } else {
                    EntradaSalida.escribirMensaje(" ");
                }
            }

            EntradaSalida.escribirMensaje("\n");
        }
    }
}
