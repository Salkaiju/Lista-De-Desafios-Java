package Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio1;


import javax.swing.*;

public class Modulo4Carro {
private String modelo;
private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double preco1, double preco2, double preco3){
        this.precoAno1 = preco1;
        this.precoAno2 = preco2;
        this.precoAno3 = preco3;
    }

    public void exibir(){
        JOptionPane.showMessageDialog(null,
                "Modelo do carro: " + modelo + "\n" +
                "Preço do primeiro ano: " + precoAno1 + "\n" +
                "Preço do segundo ano: " + precoAno2 + "\n" +
                "Preço do segundo ano: " + precoAno3 + "\n" +
                "Menor Preço: " + menorPreco(precoAno1, precoAno2, precoAno3) + "\n" +
                "Maior Preço: " + maiorPreco(precoAno1, precoAno2, precoAno3)+ "\n");
    }

    public double menorPreco(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
        double menor = precoAno1;
        if(menor > precoAno2){
            menor = precoAno2;
        }
        if (menor > precoAno3){
            menor = precoAno3;
        }
        return menor;
    }

    public double maiorPreco(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
        double maior = precoAno1;
        if(maior < precoAno2){
            maior = precoAno2;
        }
        if (maior < precoAno3){
            maior = precoAno3;
        }
        return maior;
    }


}
