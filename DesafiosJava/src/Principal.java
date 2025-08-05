import Desafios.Desafio4_AluraOrientacaoObjetos.Carro;
import Desafios.Desafio5_AluraOrientacaoObjetos.Aluno;
import Desafios.Desafio6.Desafio6;
import Desafios.Desafio1_AluraOrientacaoObjetos.Pessoa;
import Desafios.Desafio2_AluraOrientacaoObjetos.Calculadora;
import Desafios.Desafio3_AluraOrientacaoObjetos.Musica;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Musica minhaMusica = new Musica();
        Carro meuCarro = new Carro();
        Aluno aluno = new Aluno();
        int opcao;
        int num;
        double mediaAvaliacoes;
        double nota;

        System.out.println("Qual desafio realizar?\n" +
                "0-Finalizar" +
                "1-Modulo 1: Desafio 1\n" +
                "2-Modulo 1: Desafio 2\n" +
                "3-Modulo 1: Desafio 3\n" +
                "4-Modulo 1: Desafio 4\n" +
                "5-Modulo 1: Desafio 5\n" +
                "6-Pessoal: Desafio 6\n");
        opcao = scan.nextInt();
        switch(opcao){
            case 1:{
                Pessoa.OlaMundo();
            }break;
            case 2:{
                scan.nextLine();
                System.out.println("Digite um número: ");
                num = scan.nextInt();
                scan.nextLine();
                num = Calculadora.retorna(num);
                System.out.println(num);
            } break;
            case 3:{
                scan.nextLine();
                System.out.println("Digite o nome da música: ");
                minhaMusica.titulo = scan.nextLine();
                System.out.println("Digite o nome do artista: ");
                minhaMusica.artista = scan.nextLine();
                System.out.println("Digite o ano de lançamento: ");
                minhaMusica.anoLancamento = scan.nextInt();

                minhaMusica.exibirFicha();
                scan.nextLine();
                System.out.println("digite a primeira nota: ");
                minhaMusica.avaliar(scan.nextDouble());
                System.out.println("digite a segunda nota: ");
                minhaMusica.avaliar(scan.nextDouble());
                System.out.println("digite a terceira nota: ");
                minhaMusica.avaliar(scan.nextDouble());

                minhaMusica.exibirFicha();
                mediaAvaliacoes = minhaMusica.pegaMedia();
                System.out.println("Média das avaliações: " + mediaAvaliacoes);
            }break;
            case 4:{
                scan.nextLine();
                System.out.println("Digite o modelo do carro: ");
                meuCarro.modelo = scan.nextLine();
                System.out.println("Digite o ano do carro: ");
                meuCarro.ano = scan.nextInt();
                scan.nextLine();
                System.out.println("Digite a cor do carro: ");
                meuCarro.cor = scan.nextLine();

                meuCarro.exibirFicha();
                
                System.out.println("Idade do carro: " + meuCarro.calcularIdade() + " anos");
            }break;
            case 5:{
                scan.nextLine();
                System.out.println("Digite o nome: ");
                aluno.nome = scan.nextLine();
                System.out.println("Digite a idade: ");
                aluno.idade = scan.nextInt();
                scan.nextLine();
                aluno.exibirInfo();

            }break;
            case 6:{
                Desafio6.NumeroPrimo();
            }break;
            default:{
                System.out.println("Opção " + opcao + " é inválida.");
                scan.close();
            }break;
        }
    }
}

