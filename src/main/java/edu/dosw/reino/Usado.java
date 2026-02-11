package edu.dosw.reino;

public class Usado implements Categoria {
    public double modificarPrecio(double precioBase) {
        return precioBase * 0.6;
    }
    public String getNombre() {
        return "Usado";
    }
}
