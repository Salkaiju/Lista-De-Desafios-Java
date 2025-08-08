package Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio3;

public class Modulo3ContaCorrente extends Modulo3ContaBancaria {
    public static double cobrarTarifaMensal(double saldo){
        double INSS = (( 5 * 100) / saldo);
        return saldo - INSS;
    }
}
