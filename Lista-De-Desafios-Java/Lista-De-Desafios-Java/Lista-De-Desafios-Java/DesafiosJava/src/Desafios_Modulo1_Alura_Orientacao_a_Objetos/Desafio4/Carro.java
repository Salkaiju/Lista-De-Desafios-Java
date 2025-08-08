package Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio4;

public class Carro {
    public String modelo;
    public int ano;
    public String cor;

    public void exibirFicha(){
        System.out.println("Modelo: " + modelo + "\n" +
                "Ano do carro: " + ano + "\n" +
                "Cor do carro: " + cor + "\n" +
                "Idade do carro: " + calcularIdade(ano));
    }

    public int calcularIdade(int ano){
            return 2025 - this.ano;
    }
}
