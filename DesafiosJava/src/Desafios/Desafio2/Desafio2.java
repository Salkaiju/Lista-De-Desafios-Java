package Desafios.Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void NumeroPrimo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        boolean primo = num <= 1 ? false : verifPrimo(num);
        System.out.println(primo ? "Primo" : "Não é primo");
        scan.close();
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