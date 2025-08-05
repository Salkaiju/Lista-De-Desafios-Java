package Desafios.Desafio3_AluraOrientacaoObjetos;

public class Musica {
    public String titulo;
    public String artista;
    public int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    public void exibirFicha(){
        System.out.println("Titulo: " + titulo + "\n" +
                "Artista: " + artista + "\n" +
                "Ano de lançamento: " + anoLancamento + "\n" +
                "Número de avaliações: " + numAvaliacoes + "\n");
    }

    public void avaliar(double nota){
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

     public double pegaMedia() {
        return (somaDasAvaliacoes / numAvaliacoes);
    }
}
