package Desafios.Desafio1;

import java.util.Scanner;

public class Desafio1 {
    public static void Ternario1(){
    Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
    int numero = scan.nextInt();
        System.out.println(numero == 0 ? "O número é zero." : verif(numero));
        scan.close();
        } //fim "Função Main"

    static String verif(int numero){
        return (numero >= 0 ? "positivo" : "negativo");
    } //fim Função
} //fpc
