import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio4.Carro;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio5.Aluno;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio6.Desafio6;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio1.Pessoa;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio2.Calculadora;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio3.Musica;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio1.ContaBancaria;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio2.IdadePessoa;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio3.Produto;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio5.Livro;

import javax.swing.*;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Musica minhaMusica = new Musica();
        Carro meuCarro = new Carro();
        Aluno aluno1 = new Aluno();
        ContaBancaria conta1 = new ContaBancaria();
        IdadePessoa pessoa1 = new IdadePessoa();
        Produto produto1 = new Produto();
        Livro livro1 = new Livro();
        Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio4.Aluno aluno2 = new Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio4.Aluno();
        int opcao;
        int valorInt;
        String valorString;
        double valorDouble;




        do {
            do {
                System.out.println("""
                        Qual módulo?\s
                        0-Encerrar
                        1-Modelando o screenmatch
                        2-Controlando o acesso e a escrita nos dados da aplicação
                        3-
                        """);
                opcao = scan.nextInt();
                if (opcao < 0){
                    System.out.println("Inválido.\n");
                }
            } while (opcao < 0);
            switch (opcao) {
                case 0: {
                    System.out.println("Encerrando...");
                    opcao--;
                    scan.close();
                }
                break;
                case 1: {
                    do {
                        System.out.println("""
                                MODULO 1
                                Qual desafio realizar?
                                0-Retornar
                                1-Desafio 1
                                2-Desafio 2
                                3-Desafio 3
                                4-Desafio 4
                                5-Desafio 5
                                6-Extra (Primo): Desafio 6
                                """);
                        opcao = scan.nextInt();
                        if (opcao < 0) {
                            System.out.println("Inválido.\n");
                        }
                    }while (opcao < 0);
                    switch (opcao) {
                        case 1: {
                            Pessoa.OlaMundo();
                        }
                        break;
                        case 2: {
                            scan.nextLine();
                            System.out.println("Digite um número: ");
                            valorInt = scan.nextInt();
                            scan.nextLine();
                            valorInt = Calculadora.retorna(valorInt);
                            System.out.println(valorInt);
                        }
                        break;
                        case 3: {
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
                            valorDouble = minhaMusica.pegaMedia();
                            System.out.println("Média das avaliações: " + valorDouble);
                        }
                        break;
                        case 4: {
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
                        }
                        break;
                        case 5: {
                            scan.nextLine();
                            System.out.println("Digite o nome: ");
                            aluno1.nome = scan.nextLine();
                            System.out.println("Digite a idade: ");
                            aluno1.idade = scan.nextInt();
                            scan.nextLine();
                            aluno1.exibirInfo();

                        }
                        break;
                        case 6: {
                            Desafio6.NumeroPrimo();
                        }
                        break;
                        case 0: {
                            System.out.println("Retornando...\n");
                        }
                        break;
                        default: {
                            System.out.println("Opção " + opcao + " é inválida.");
                        }
                        break;
                    } // fim switch opcao desafio do modulo 1
                } // fim case do opcao 1
                break;
                case 2: {
                    do {
                        System.out.println("""
                                MODULO 2
                                Qual desafio realizar?
                                0-Retornar
                                1-Desafio 1
                                2-Desafio 2
                                3-Desafio 3
                                4-Desafio 4
                                5-Desafio 5
                                """);
                        opcao = scan.nextInt();
                        if (opcao < 0) {
                            System.out.println("Inválido.\n");
                        }
                    }while (opcao < 0);
                    switch (opcao) {
                        case 1: {
                            conta1.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número da conta: ")));
                            conta1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo da conta: ")));
                            conta1.setTitular(JOptionPane.showInputDialog(null,"Digite o titular da conta: "));
                            ContaBancaria.exibirFicha();
                        }
                        break;
                        case 2: {
                            pessoa1.setNome(JOptionPane.showInputDialog(null, "Digite o nome: "));
                            pessoa1.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade: ")));
                            IdadePessoa.verificarIdade(pessoa1.getIdade());
                        }
                        break;
                        case 3: {
                            produto1.setNome(JOptionPane.showInputDialog(null, "Digite o nome do produto: "));
                            produto1.setPreco(Double.valueOf(JOptionPane.showInputDialog(null, "Digite o preço do produto: ")));
                            produto1.aplicarDesconto(Double.valueOf(JOptionPane.showInputDialog(null,"Desconto: ")));

                        }
                        break;
                        case 4: {
                            aluno2.setNome(JOptionPane.showInputDialog(null,"Digite o nome: "));
                            aluno2.setNota1(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota: ")));
                            aluno2.setNota2(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota: ")));
                            aluno2.setNota3(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota: ")));
                            valorDouble = aluno2.calcularMedia(aluno2.getNota1(), aluno2.getNota2(),aluno2.getNota3());
                            JOptionPane.showMessageDialog(null,"Nome: " + aluno2.getNome() + "\n" +
                                    "Notas: " + aluno2.getNota1() + ", " + aluno2.getNota2() + ", " + aluno2.getNota3() + "\n" +
                                    "Média: " + valorDouble);
                        }
                        break;
                        case 5: {
                            livro1.setTitulo(JOptionPane.showInputDialog(null,"Titulo: "));
                            livro1.setAutor(JOptionPane.showInputDialog(null,"Autor: "));
                            livro1.exibirDetalhes();
                        }
                        break;
                        case 0: {
                            System.out.println("Retornando...");
                        }
                        break;
                        default: {

                        }
                        break;
                    } // fim switch opcao desafio do modulo 2
                } break; // fim case do opcao 2
            } //fim switch opcao modulo
        }while (opcao >= 0); //verificador do Encerrar
    } //fim main
} //fim public class principal

