package Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio5;

import javax.swing.*;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        JOptionPane.showMessageDialog(null, "Titulo: " + titulo +
                "Autor: " + autor);
    }
}
