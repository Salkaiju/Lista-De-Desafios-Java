package Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio2;

import javax.swing.*;

public class IdadePessoa {
    private static String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void verificarIdade(int idade){
        if (idade > 18){
            JOptionPane.showMessageDialog(null, nome + " possui mais de 18 anos.");
        } else if(idade < 18){
            JOptionPane.showMessageDialog(null, nome + " possui menos de 18 anos.");
        } else{
            JOptionPane.showMessageDialog(null, nome + " possui 18 anos.");
        }
    }
}
