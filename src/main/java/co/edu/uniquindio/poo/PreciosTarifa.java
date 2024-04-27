package co.edu.uniquindio.poo;

import java.util.Scanner;

public class PreciosTarifa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de vehículo:" + "\n" + "1: Moto Clásica" + "\n" + "2: Moto Híbrida" + "\n" + "3: Carro");
        int tipoVehiculo = scanner.nextInt();

        System.out.println("\n" + "Ingrese el número de horas de estacionamiento:");
        int horas = scanner.nextInt();

        int costo = 0;
        switch (tipoVehiculo) {
            case 1: 
                costo = horas * UsuarioEncargado.TARIFA_MOTO_CLASICA;
                UsuarioEncargado.IngresoMotoClasica(costo);
                break;
            case 2: 
                costo = horas * UsuarioEncargado.TARIFA_MOTO_HIBRIDA;
                UsuarioEncargado.IngresoMotoHibrida(costo);
                break;
            case 3: 
                costo = horas * UsuarioEncargado.TARIFA_CARRO;
                UsuarioEncargado.IngresoCarro(costo);
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                break;
        }

        if (costo > 0) {
            System.out.println("\n" + "El costo total del estacionamiento es: " + costo);
        } else {
            System.out.println("El costo debe ser mayor a cero (0)");
        }

        ReportesDiarios_Y_Mensuales.ReporteRecaudado();

        scanner.close();
    }
}