package Desafios.Desafio4_AluraOrientacaoObjetos;

public class Carro {
    public String modelo;
    public int ano;
    public String cor;

    public void exibirFicha(){
        System.out.println("Modelo: " + modelo + "\n" +
                "Ano do carro: " + ano + "\n" +
                "Cor do carro: " + cor + "\n");
    }

    public int calcularIdade(){
        return 2025 - ano;
    }
}
