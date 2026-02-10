package reino;

public abstract class Vehiculo {

    protected String nombre;
    protected String categoria;
    protected double velocidadMaxima;
    protected double precio;

    public Vehiculo(String nombre, String categoria, double velocidadMaxima, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.velocidadMaxima = velocidadMaxima;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void mostrarInfo();
}
