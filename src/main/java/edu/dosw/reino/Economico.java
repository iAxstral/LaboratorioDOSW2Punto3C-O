package edu.dosw.reino;

public class Economico implements Categoria {
    public double modificarPrecio(double precioBase) {
        return precioBase * 0.9;
    }
    public String getNombre() {
        return "Económico";
    }
}
