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

            // Esperar 1s y limpiar pantalla
            limpiarPantalla();
        }

        EntradaSalida.escribirMensaje("\n¡Feliz Navidad!");
    }

    /* METODOS AUXILIARES */
    public void crearHojas(Integer tiempo) {
        // Empieza en 1...
        for (int alto = 1; alto <= ALTURA_ARBOL; alto++) {
            // Contar cuantas bolitas hay por iteracion
            int contarBolitas = 0;

            // ...porque en 0 imprime una linea de mas al principio
            // Triangulo "invisible" a la inversa para crear los espacios
            for (int largo = ALTURA_ARBOL; largo > alto; largo--) {
                EntradaSalida.escribirMensaje(" ");
            }

            // Estrellita
            if (alto == 1) {
                EntradaSalida.escribirMensaje(Colores.ANSI_AMARILLO + "*" + Colores.ANSI_RESET);
            }

            // Triangulo de izquierda a derecha
            for (int largo = 1; largo < alto; largo++) {
                if (largo % 2 == 0) {
                    if ((tiempo + contarBolitas + alto) % 2 == 0) {
                        EntradaSalida.escribirMensaje(Colores.ANSI_ROJO + "o" + Colores.ANSI_RESET);
                    } else {
                        EntradaSalida.escribirMensaje(Colores.ANSI_MORADO + "o" + Colores.ANSI_RESET);
                    }
                    contarBolitas++;
                } else {
                    EntradaSalida.escribirMensaje(Colores.ANSI_VERDE + "*" + Colores.ANSI_RESET);
                }
            }

            // Triangulo de derecha a izquierda (empieza en 1 para que sea impar)
            // Se puede ver mejor si en lugar de ambos ser "*" uno es otro simbolo
            for (int largo = 1; largo < alto; largo++) {
                if (largo % 2 == 0 && largo != alto - 1) {
                    if ((tiempo + contarBolitas + alto) % 2 == 0) {
                        EntradaSalida.escribirMensaje(Colores.ANSI_ROJO + "o" + Colores.ANSI_RESET);
                    } else {
                        EntradaSalida.escribirMensaje(Colores.ANSI_MORADO + "o" + Colores.ANSI_RESET);
                    }
                    contarBolitas++;
                } else {
                    EntradaSalida.escribirMensaje(Colores.ANSI_VERDE + "*" + Colores.ANSI_RESET);
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
                EntradaSalida.escribirMensaje(Colores.ANSI_CYAN + "#" + Colores.ANSI_RESET);
            }

            EntradaSalida.escribirMensaje("\n");
        }
    }
}
