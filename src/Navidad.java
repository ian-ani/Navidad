/*
** NAVIDAD
** Programa que muestra un arbol de Navidad, consta de dos implementaciones dependiendo
** de si es Windows (menos probabilidades de soportar ANSI), Unix (soporta ANSI) o si es
** un IDE (no todos soportan totalmente ANSI)
*/

/* LIBRERIAS */
import arboles.ArbolColor;
import arboles.ArbolSeguro;

public class Navidad {
    /* METODO PRINCIPAL */
    public static void main(String[] args) throws InterruptedException {
        if (siSoportaAnsi()) {
            ArbolColor arbolColor = new ArbolColor();
            arbolColor.crearArbol();
        } else {
            ArbolSeguro arbolSeguro = new ArbolSeguro();
            arbolSeguro.crearArbol();
        }
    }

    /* METODOS AUXILIARES */
    private static boolean siSoportaAnsi() {
        // Obtener nombre del sistema operativo
        String os = System.getProperty("os.name").toLowerCase();

        // Si es Windows retorna false
        return !os.contains("win");
    }
}
