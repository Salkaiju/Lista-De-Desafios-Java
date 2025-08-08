package Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio1.Desafio1;

public class Modulo4ModeloCarro extends Modulo4Carro {
    public static void main(String[] args) {
        Modulo4Carro meuCarro = new Modulo4Carro();
        meuCarro.setModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibir();
    }
}
