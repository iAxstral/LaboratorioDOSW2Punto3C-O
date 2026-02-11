package edu.dosw.reino;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Vehiculo> compra = new ArrayList<>();

        compra.add(VehiculoFactory.crearVehiculo("auto", new Economico()));
        compra.add(VehiculoFactory.crearVehiculo("moto", new Lujo()));
        compra.add(VehiculoFactory.crearVehiculo("auto", new Usado()));

        compra.forEach(Vehiculo::mostrarInfo);

        double total = compra.stream()
                .mapToDouble(Vehiculo::getPrecioFinal)
                .sum();

        System.out.println("TOTAL A PAGAR: $" + total);
    }
}
