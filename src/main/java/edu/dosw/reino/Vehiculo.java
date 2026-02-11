package edu.dosw.reino;


public abstract class Vehiculo {
    protected String nombre;
    protected double precioBase;
    protected Categoria categoria;

    public Vehiculo(String nombre, double precioBase, Categoria categoria) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.categoria = categoria;
    }

    public double getPrecioFinal() {
        return categoria.modificarPrecio(precioBase);
    }

    public abstract void mostrarInfo();
}
