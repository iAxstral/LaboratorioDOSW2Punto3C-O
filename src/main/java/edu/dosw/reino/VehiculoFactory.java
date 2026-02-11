package edu.dosw.reino;


public class VehiculoFactory {

    public static Vehiculo crearVehiculo(String tipo, Categoria categoria) {
        switch (tipo.toLowerCase()) {
            case "auto":
                return new Auto(categoria);
            case "moto":
                return new Moto(categoria);
            default:
                throw new IllegalArgumentException("Tipo de vehículo no válido");
        }
    }
}
