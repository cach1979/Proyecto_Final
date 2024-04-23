package co.edu.uniquindio.poo;

public class PreciosTarifa {

    private int MotoClasica;
    private int MotoHibrida;
    private int Carro;

    public PreciosTarifa(){
        this.MotoClasica = 2000;
        this.MotoHibrida = 5000;
        this.Carro = 10000;
    }

    public int CostoMotoClasica(){
        int horaMotoClasica = 2 * MotoClasica;
        return horaMotoClasica;
    }

    public int CostoMotoHibrida(){
        int horaMotoHibrida = 2 * MotoHibrida;
        return horaMotoHibrida;
    }

    public int CostoCarro(){
        int horaCarro = 2 * Carro;
        return horaCarro;
    }
}
