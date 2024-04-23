package co.edu.uniquindio.poo;

public class UsuarioEncargado {
    
    public static int TARIFA_MOTO_CLASICA = 2000; 
    public static int TARIFA_MOTO_HIBRIDA = 5000; 
    public static int TARIFA_CARRO = 10000;       

    public static void setTarifas(int tarifaMotoClasica, int tarifaMotoHibrida, int tarifaCarro) {
        tarifaMotoClasica = TARIFA_MOTO_CLASICA;
        tarifaMotoHibrida = TARIFA_MOTO_HIBRIDA;
        tarifaCarro = TARIFA_CARRO;
    }
}
