package Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio3;

import javax.swing.*;

public class Produto {
    private String nome;
    private Double preco;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aplicarDesconto(Double percentual){
        double desconto = preco * (percentual / 100);
        double liquido = preco - desconto;
        JOptionPane.showMessageDialog(null,"Nome: " + nome + "\n" +
                "Preço Bruto: " + preco + "\n" +
                "Porcentagem do desconto: " + percentual + "%\n" +
                "Valor Descontado: " + desconto +"\n" +
                "Liquido: " + liquido);
    }
}
