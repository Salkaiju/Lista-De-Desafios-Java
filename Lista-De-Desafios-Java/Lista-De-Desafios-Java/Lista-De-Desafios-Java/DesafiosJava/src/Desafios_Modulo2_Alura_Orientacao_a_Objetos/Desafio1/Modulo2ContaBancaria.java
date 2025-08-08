package Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio1;

import javax.swing.*;

public class Modulo2ContaBancaria {
    private static int numeroConta;
    private static double saldo;
    public static String titular;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void exibirFicha(){
        JOptionPane.showMessageDialog(null,"Número da conta: " + numeroConta + "\nSaldo da conta: " + saldo + "\nTitular da conta: " + titular);
    }
}
