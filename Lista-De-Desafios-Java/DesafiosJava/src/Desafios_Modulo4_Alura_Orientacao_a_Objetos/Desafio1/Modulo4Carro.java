package Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio1;


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
        System.out.println("Modelo do carro: " + modelo + "\n" +
                "Preço do primeiro ano: " + precoAno1 + "\n" +
                "Preço do segundo ano: " + precoAno2 + "\n" +
                "Preço do segundo ano: " + precoAno3 + "\n");
    }

    public void menorPreco(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
        double maior = precoAno1;
        if(maior > precoAno2){
            maior = precoAno2;
        } else if (maior > precoAno3){
            maior = precoAno3;
        }
        System.out.println("o menor preço é: " + maior);
    }

    public void maiorPreco(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
        double maior = precoAno1;
        if(maior < precoAno2){
            maior = precoAno2;
        } else if (maior < precoAno3){
            maior = precoAno3;
        }
        System.out.println("o maior preço é: " + maior);
    }


}
