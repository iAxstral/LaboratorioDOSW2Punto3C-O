package edu.dosw.reino;

public class Lujo implements Categoria {
    public double modificarPrecio(double precioBase) {
        return precioBase * 1.5;
    }
    public String getNombre() {
        return "Lujo";
    }
}
