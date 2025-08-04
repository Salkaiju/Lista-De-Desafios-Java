import Desafios.Desafio1.Desafio1;
import Desafios.Desafio2.Desafio2;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        System.out.println("Qual desafio realizar?\n" +
                "1-(Desafio 1) Número Positivo ou Negativo\n" +
                "2-(Desafio 2) Numero Primo\n");
        opcao = scan.nextInt();
        switch(opcao){
            case 1:{
                Desafio1.Ternario1();
            } break;
            case 2:{
                Desafio2.NumeroPrimo();
            }break;
            default:{
                System.out.println("Opção " + opcao + " é inválida.");
            }break;
        }
    }
}

