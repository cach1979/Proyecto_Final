package co.edu.uniquindio.poo;

public class ReportesDiarios_Y_Mensuales {
    
    public static void ReporteRecaudado() {
        System.out.println("\n" + "Total recaudado por tipo de vehículo:");
        System.out.println("Moto Clásica: $" + UsuarioEncargado.getIngresoMotoClasica());
        System.out.println("Moto Híbrida: $" + UsuarioEncargado.getIngresoMotoHibrida());
        System.out.println("Carro: $" + UsuarioEncargado.getIngresoCarro());
    }
}
