package co.edu.uniquindio.poo;

import java.util.Scanner;

public class PreciosTarifa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de vehículo (1: Moto Clásica, 2: Moto Híbrida, 3: Carro):");
        int tipoVehiculo = scanner.nextInt();

        System.out.println("Ingrese el número de horas de estacionamiento:");
        int horas = scanner.nextInt();

        int costo = 0;
        switch (tipoVehiculo) {
            case 1: 
                costo = horas * UsuarioEncargado.TARIFA_MOTO_CLASICA;
                break;
            case 2: 
                costo = horas * UsuarioEncargado.TARIFA_MOTO_HIBRIDA;
                break;
            case 3: 
                costo = horas * UsuarioEncargado.TARIFA_CARRO;
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                break;
        }

        if (costo > 0) {
            System.out.println("El costo total del estacionamiento es: " + costo);
        }

        scanner.close();
    }
}
