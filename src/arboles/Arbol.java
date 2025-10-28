/* PAQUETE */
package arboles;

/* LIBRERIAS */
import model.Colores;
import utiles.EntradaSalida;

public abstract class Arbol {
    /* CONSTANTES */

    // Animacion
    protected static final int VECES_ANIMACION = 10;

    // Arbol
    protected static final int ALTURA_ARBOL = 8;
    protected static final int MILISEGUNDOS = 1000;

    // Maceta
    protected static final int ALTURA_MACETA = 2;
    protected static final int LARGO_MACETA = 5;

    /* METODOS AUXILIARES */
    protected static void limpiarPantalla() throws InterruptedException {
        // Esperar
        Thread.sleep(MILISEGUNDOS);
        // Limpiar
        EntradaSalida.escribirMensaje(Colores.ANSI_LIMPIAR.toString());
        System.out.flush();
    }
}
