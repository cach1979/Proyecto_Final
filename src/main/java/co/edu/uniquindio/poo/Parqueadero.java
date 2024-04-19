package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Parqueadero {

    public static String[][] carrosInicial = new String[8][8]; 
    public static String[][] motosInicial = new String[10][10]; 

    public static int contadorCarros = 0;
    public static int contadorMotos = 0; 

    public static void main(String[] args) {

        inicializarParqueadero();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n¿Qué acción desea realizar?");
            System.out.println("1. Registrar entrada de vehículo");
            System.out.println("2. Registrar salida de vehículo");
            System.out.println("3. Mostrar estado actual del parqueadero");
            System.out.println("4. Salir del programa");
            System.out.print("Ingrese el número de la acción: ");

            int opcion;

            try {
                opcion = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("Error al leer la opción. Por favor, ingrese un número válido.");
                scanner.next(); 
                continue;
            }

            switch (opcion) {

                case 1:

                    registrarEntrada(scanner);
                    break;

                case 2:

                    registrarSalida(scanner);
                    break;

                case 3:

                    mostrarEstadoParqueadero();
                    break;

                case 4:

                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;

                default:

                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;

            }

        }

    }

    public static void inicializarParqueadero() {

        for (String[] fila : carrosInicial) {
            Arrays.fill(fila, "Vacío");
        }
        for (String[] fila : motosInicial) {
            Arrays.fill(fila, "Vacío");
        }
    }

    public static void registrarEntrada(Scanner scanner) {

        System.out.println("\n¿Qué tipo de vehículo desea ingresar? (Carro/Moto)");
        String tipoVehiculo = scanner.next();

        System.out.println("Ingrese la placa del vehículo:");
        String placa = scanner.next();

        if (tipoVehiculo.equalsIgnoreCase("Carro")) {

            if (buscarPuestoLibre(carrosInicial)) {

                ocuparPuesto(carrosInicial, placa);
                System.out.println("Carro con placa " + placa + " ingresó al parqueadero.");
                System.out.println("Hora de entrada: " + LocalDateTime.now());
                contadorCarros++;

            } else {

                System.out.println("Lo sentimos, no hay puestos disponibles para carros en este momento.");
            }
        } else if (tipoVehiculo.equalsIgnoreCase("Moto")) {

            if (buscarPuestoLibre(motosInicial)) {

                ocuparPuesto(motosInicial, placa);
                System.out.println("Moto con placa " + placa + " ingresó al parqueadero.");
                System.out.println("Hora de entrada: " + LocalDateTime.now());
                contadorMotos++;

            } else {
                System.out.println("Lo sentimos, no hay puestos disponibles para motos en este momento.");
            }

        } else {

            System.out.println("Tipo de vehículo no válido. Ingrese 'Carro' o 'Moto'.");

        }

    }

    public static boolean buscarPuestoLibre(String[][] parqueadero) {

        for (String[] fila : parqueadero) {
            for (String puesto : fila) {
                if (puesto.equals("Vacío")) {
                    return true; 

                }

            }

        }

        return false; 

    }

    public static void ocuparPuesto(String[][] parqueadero, String placa) {

        for (String[] fila : parqueadero) {

            for (int i = 0; i < fila.length; i++) {

                if (fila[i].equals("Vacío")) {
                    fila[i] = placa;

                    return;

                }

            }

        }

    }

    public static void registrarSalida(Scanner scanner) {

        System.out.println("\nIngrese la placa del vehículo que va a salir:");
        String placa = scanner.next();

        if (buscarYDesocupar(carrosInicial, placa)) {
            System.out.println("Carro con placa " + placa + " salió del parqueadero.");
            System.out.println("Hora de salida: " + LocalDateTime.now());
            contadorCarros--;

        } else if (buscarYDesocupar(motosInicial, placa)) {
            System.out.println("Moto con placa " + placa + " salió del parqueadero.");
            System.out.println("Hora de salida: " + LocalDateTime.now());
            contadorMotos--;

        } else {
            System.out.println("El vehículo con placa " + placa + " no se encuentra en el parqueadero.");

        }
        
    }

    public static boolean buscarYDesocupar(String[][] parqueadero, String placa) {

        for (int i = 0; i < parqueadero.length; i++) {

            for (int j = 0; j < parqueadero[i].length; j++) {

                if (parqueadero[i][j].equals(placa)) {

                    parqueadero[i][j] = "Vacío";
                    calcularTiempoEstadia(placa);
                    return true;

                }

            }

        }

        return false;

    }

    public static void calcularTiempoEstadia(String placa) {

        LocalDateTime horaSalida = LocalDateTime.now();
        System.out.println("Tiempo de estadía del vehículo con placa " + placa + " : " + horaSalida);
    }

    public static void mostrarEstadoParqueadero() {

        System.out.println("\nEstado actual del parqueadero:");
        System.out.println("Carros ingresados: " + contadorCarros);
        System.out.println("Motos ingresadas: " + contadorMotos);
        System.out.println("Matriz de carros:");
        mostrarParqueadero(carrosInicial);
        System.out.println("Matriz de motos:");
        mostrarParqueadero(motosInicial);

    }

    public static void mostrarParqueadero(String[][] parqueadero) {

        for (String[] fila : parqueadero) {

            for (String puesto : fila) {

                System.out.print(puesto + "\t");
    
             }
            
             System.out.println();

        }

    }

}