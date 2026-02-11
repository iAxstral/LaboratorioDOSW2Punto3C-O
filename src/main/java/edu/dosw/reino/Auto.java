package edu.dosw.reino;

public class Auto extends Vehiculo {

    public Auto(Categoria categoria) {
        super("Auto", 20000, categoria);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " | " + categoria.getNombre() +
                " | Precio: $" + getPrecioFinal());
    }
}
