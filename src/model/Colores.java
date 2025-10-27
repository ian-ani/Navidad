package model;

public enum Colores {
    ANSI_LIMPIAR("\033[H\033[2J"),
    ANSI_RESET("\u001B[0m"),
    ANSI_ROJO("\u001B[31m"),
    ANSI_VERDE("\u001B[32m"),
    ANSI_AMARILLO("\u001B[33m"),
    ANSI_AZUL("\u001B[34m"),
    ANSI_MORADO("\u001B[35m"),
    ANSI_CYAN("\u001B[36m");

    // Valor de cada parametro
    private final String color;

    // Constructor
    Colores(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
