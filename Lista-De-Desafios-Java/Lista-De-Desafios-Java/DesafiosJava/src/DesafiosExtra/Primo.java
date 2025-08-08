package DesafiosExtra;

import javax.swing.*;

public class Primo {
    public static void NumeroPrimo() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        boolean primo = num <= 1 ? false : verifPrimo(num);
        JOptionPane.showMessageDialog(null, primo ? "Primo" : "Não é primo");
    } //fim "Função Main"

    public static boolean verifPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    } //fim Função
} //fpc