import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio4.Carro;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio5.Modulo1Aluno;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio1.Pessoa;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio2.Calculadora;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio3.Musica;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio1.ContaBancaria;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio2.IdadePessoa;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio3.Produto;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio4.Modulo2Aluno;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio5.Livro;
import Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio1.Desafio1.Modulo4Carro;
import Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio1.Desafio2.Cachorro;
import Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio1.Desafio2.Gato;



import javax.swing.*;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanOpcao = new Scanner(System.in);
        Musica minhaMusica = new Musica();
        Carro meuCarro1 = new Carro();
        Modulo1Aluno modulo1Aluno1 = new Modulo1Aluno();
        ContaBancaria conta1 = new ContaBancaria();
        IdadePessoa pessoa1 = new IdadePessoa();
        Produto produto1 = new Produto();
        Livro livro1 = new Livro();
        Modulo2Aluno modulo2Aluno2 = new Modulo2Aluno();
        Modulo4Carro meuCarro2 = new Modulo4Carro();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
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
                        3-Reaproveitando características e comportamentos
                        """);
                while (!scanOpcao.hasNextInt()) {
                    System.out.println("Valor inválido. Digite um número inteiro de 1 a 5 para a opção");
                }
                    opcao = scanOpcao.nextInt();
                if (opcao < 0 || opcao > 5){
                    System.out.println("Valor inválido. Digite um número inteiro de 1 a 5.");
                }
            } while (opcao < 0);
            switch (opcao) {
                case 0: {
                    System.out.println("Encerrando...");
                    opcao--;
                    scanOpcao.close();
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
                                """);
                        opcao = scanOpcao.nextInt();
                        if (opcao < 0) {
                            System.out.println("Inválido.\n");
                        }
                    } while (opcao < 0);
                    switch (opcao) {
                        case 1: {
                            Pessoa.OlaMundo();
                        }
                        break;
                        case 2: {
                            Scanner scanModulo1 = new Scanner(System.in);
                            System.out.println("Digite um número: ");
                            valorInt = scanModulo1.nextInt();
                            scanModulo1.nextLine();
                            valorInt = Calculadora.retorna(valorInt);
                            System.out.println(valorInt);
                            scanModulo1.close();
                        }
                        break;
                        case 3: {
                            Scanner scanModulo1 = new Scanner(System.in);
                            System.out.println("Digite o nome da música: ");
                            minhaMusica.titulo = scanModulo1.nextLine();
                            System.out.println("Digite o nome do artista: ");
                            minhaMusica.artista = scanModulo1.nextLine();
                            System.out.println("Digite o ano de lançamento: ");
                            minhaMusica.anoLancamento = scanModulo1.nextInt();
                            minhaMusica.exibirFicha();
                            scanModulo1.nextLine();
                            System.out.println("digite a primeira nota: ");
                            minhaMusica.avaliar(scanModulo1.nextDouble());
                            System.out.println("digite a segunda nota: ");
                            minhaMusica.avaliar(scanModulo1.nextDouble());
                            System.out.println("digite a terceira nota: ");
                            minhaMusica.avaliar(scanModulo1.nextDouble());

                            minhaMusica.exibirFicha();
                            valorDouble = minhaMusica.pegaMedia();
                            System.out.println("Média das avaliações: " + valorDouble);
                            scanModulo1.close();
                        }
                        break;
                        case 4: {
                            Scanner scanModulo1 = new Scanner(System.in);
                            scanOpcao.nextLine();
                            System.out.println("Digite o modelo do carro: ");
                            meuCarro1.modelo = scanModulo1.nextLine();
                            do {
                                System.out.println("Digite o ano do carro: ");
                                while(!scanModulo1.hasNextInt()) {
                                    System.out.println("Valor inválido. Digite um número inteiro para o ano.");
                                    scanModulo1.next();
                                }
                                meuCarro1.ano = scanModulo1.nextInt();
                            } while(false);
                            scanModulo1.nextLine();
                            System.out.println("Digite a cor do carro: ");
                            meuCarro1.cor = scanModulo1.nextLine();
                            meuCarro1.exibirFicha();
                            scanModulo1.close();
                        }
                        break;
                        case 5: {
                            Scanner scanModulo1 = new Scanner(System.in);
                            scanModulo1.nextLine();
                            System.out.println("Digite o nome: ");
                            modulo1Aluno1.nome = scanModulo1.nextLine();
                            System.out.println("Digite a idade: ");
                            modulo1Aluno1.idade = scanModulo1.nextInt();
                            scanModulo1.nextLine();
                            modulo1Aluno1.exibirInfo();
                            scanModulo1.close();
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
                        opcao = scanOpcao.nextInt();
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
                            modulo2Aluno2.setNome(JOptionPane.showInputDialog(null,"Digite o nome: "));
                            modulo2Aluno2.setNota1(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota: ")));
                            modulo2Aluno2.setNota2(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota: ")));
                            modulo2Aluno2.setNota3(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota: ")));
                            valorDouble = modulo2Aluno2.calcularMedia(modulo2Aluno2.getNota1(), modulo2Aluno2.getNota2(), modulo2Aluno2.getNota3());
                            JOptionPane.showMessageDialog(null,"Nome: " + modulo2Aluno2.getNome() + "\n" +
                                    "Notas: " + modulo2Aluno2.getNota1() + ", " + modulo2Aluno2.getNota2() + ", " + modulo2Aluno2.getNota3() + "\n" +
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
                            System.out.println("Opção " + opcao + " é inválida.");
                        }
                        break;
                    } // fim switch opcao desafio do modulo 2
                } break; // fim case do opcao 2
                case 3:{
                    do {
                        System.out.println("""
                                MODULO 3
                                Qual desafio realizar?
                                0-Retornar
                                1-Desafio 1
                                2-Desafio 2
                                3-Desafio 3
                                4-Desafio 4
                                5-Desafio 5
                                """);
                        opcao = scanOpcao.nextInt();
                        if (opcao < 0) {
                            System.out.println("Inválido.\n");
                        }
                    }while (opcao < 0);
                    switch (opcao) {
                        case 1: {
                            meuCarro2.setModelo(JOptionPane.showInputDialog("Digite o Modelo: "));
                            meuCarro2.definirPrecos(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço 1: ")), Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço 2: ")), Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço 3: ")));
                            meuCarro2.exibir();
                        }
                        break;
                        case 2: {
                            cachorro.emitirSom();
                            cachorro.abanar();
                            gato.emitirSom();
                            gato.arranhar();
                        }
                        break;
                        case 3: {
                            
                        }
                        break;
                        case 4: {

                        }
                        break;
                        case 5: {

                        }
                        break;
                        case 0: {
                            System.out.println("Retornando...");
                        }
                        break;
                        default: {
                            System.out.println("Opção " + opcao + " é inválida.");
                        }
                        break;
                    } // fim switch opcao desafio do modulo 3
                }break;
            } //fim switch opcao dos modulos do alura
        }while (opcao >= 0); //verificador do Encerrar
    } //fim main
} //fim public class principal

