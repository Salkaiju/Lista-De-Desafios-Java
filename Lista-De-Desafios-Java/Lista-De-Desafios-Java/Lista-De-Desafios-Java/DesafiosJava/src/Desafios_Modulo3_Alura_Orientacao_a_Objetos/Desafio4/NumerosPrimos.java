package Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio4;

import javax.swing.*;

public class NumerosPrimos {

    public static boolean verificarPrimalidade(int numero){
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limite){
        JOptionPane.showMessageDialog(null, "primos até " + limite + " serão digitados no terminal.");
        for (int i = 2; i <= limite; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
