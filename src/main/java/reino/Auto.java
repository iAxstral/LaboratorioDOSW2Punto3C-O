package reino;

public class Auto extends Vehiculo {

    public Auto(String categoria) {
        super("Auto", categoria, 180, 20000);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Vehículo: " + nombre +
                " | Categoría: " + categoria +
                " | Velocidad Máx: " + velocidadMaxima +
                " | Precio: $" + precio);
    }
}
