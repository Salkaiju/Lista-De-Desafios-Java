package Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio3;

import javax.swing.*;

public class Modulo3ContaBancaria {
    private static double saldo;

    public static void depositar(double saldo) {
        Modulo3ContaBancaria.saldo = Modulo3ContaCorrente.cobrarTarifaMensal(saldo);
        saldo = Modulo3ContaCorrente.cobrarTarifaMensal(saldo);
        JOptionPane.showMessageDialog(null,"Você depositou " + saldo + " tendo recebido um desconto de 5% pelo INSS");
    }

    public static double sacar(double saque) {
        if (saldo >= saque) {
            saldo = saldo - saque;
            JOptionPane.showMessageDialog(null, "Você sacou: " + saque + "\nSaldo Atual: " + saldo);
            return saldo;
        } else {
            JOptionPane.showMessageDialog(null, "Não possui saldo suficiente. Saldo: " + saldo);
            return saldo;
        }
    }

    public static void consultarSaldo () {
        JOptionPane.showMessageDialog(null,"Saldo Atual: " + saldo);
    }
}
