package edu.dosw.reino;


public class Moto extends Vehiculo {

    public Moto(Categoria categoria) {
        super("Moto", 12000, categoria);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " | " + categoria.getNombre() +
                " | Precio: $" + getPrecioFinal());
    }
}
