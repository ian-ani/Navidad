/*
** Todos los arboles deben implementar estos metodos
*/

/* PAQUETE */
package arboles;

public interface IArbol {
    void crearHojas(Integer tiempo);
    void crearMaceta();
    void crearArbol() throws InterruptedException;
}
