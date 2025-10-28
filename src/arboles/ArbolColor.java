/*
** ARBOL COLOR
** Arbol para cuando la consola si permite ANSI completamente
*/

/* PAQUETE */
package arboles;

/* LIBRERIAS */
import model.Colores;
import utiles.EntradaSalida;

// Clase ArbolColor, hija de la clase Arbol, implementa la interfaz IArbol
public class ArbolColor extends Arbol implements IArbol  {
    /* METODO PRINCIPAL */
    public void crearArbol() throws InterruptedException {
        for (int tiempo = 0; tiempo < VECES_ANIMACION; tiempo++) {
            // Hojas
            crearHojas(tiempo);

            // Maceta
            crearMaceta();

            EntradaSalida.escribirMensaje("\n¡Feliz Navidad!");

            // Esperar 1s y limpiar pantalla
            limpiarPantalla();
        }
    }

    /* METODOS AUXILIARES */
    public void crearHojas(Integer tiempo) {
        for (int alto = 0; alto < ALTURA_ARBOL; alto++) {
            // Contar cuantas bolitas hay por iteracion
            int contarBolitas = 0;

            for (int largo = 0; largo < (ALTURA_ARBOL * 2) - 1; largo++) {
                // Rango:
                // alto = 2 --> rango de largo >= 3 hasta alto <= 7
                // alto = 3 --> rango de largo >= 2 hasta alto <= 8
                if (largo >= (ALTURA_ARBOL - 1) - alto && largo <= (ALTURA_ARBOL - 1) + alto) {
                    // Estrellita
                    if (alto == 0) {
                        EntradaSalida.escribirMensaje(Colores.ANSI_AMARILLO + "*" + Colores.ANSI_RESET);
                        continue;
                    }

                    // Si alto y largo son pares, pon bolitas
                    // Asi hay un espacio de separacion, tanto verticalmente como horizontalmente
                    if (largo % 2 == 0 && alto % 2 == 0) {
                        if ((tiempo + contarBolitas + alto) % 2 == 0) {
                            EntradaSalida.escribirMensaje(Colores.ANSI_ROJO + "o" + Colores.ANSI_RESET);
                        } else {
                            EntradaSalida.escribirMensaje(Colores.ANSI_CYAN + "o" + Colores.ANSI_RESET);
                        }
                        contarBolitas++;
                    } else {
                        EntradaSalida.escribirMensaje(Colores.ANSI_VERDE + "*" + Colores.ANSI_RESET);
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
                    EntradaSalida.escribirMensaje(Colores.ANSI_AZUL + "#" + Colores.ANSI_RESET);
                } else {
                    EntradaSalida.escribirMensaje(" ");
                }
            }

            EntradaSalida.escribirMensaje("\n");
        }
    }
}
