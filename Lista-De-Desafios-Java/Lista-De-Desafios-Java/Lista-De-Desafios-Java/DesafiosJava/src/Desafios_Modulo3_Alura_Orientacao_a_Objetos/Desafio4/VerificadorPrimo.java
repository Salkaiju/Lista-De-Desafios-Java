package Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio4;

import javax.swing.*;

public class VerificadorPrimo extends NumerosPrimos {

    public static void verificarPrimo(int num) {
        if (verificarPrimalidade(num)){
            JOptionPane.showMessageDialog(null, num + " é primo");
        } else {
            JOptionPane.showMessageDialog(null, num + " não é primo");
        }
    }
}
