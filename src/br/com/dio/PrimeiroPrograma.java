package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;
        System.out.println("Olá, Mundo! " + (a + b));*/

        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro1 = new Livro("O nome da rosa", 100);
        System.out.println(livro1);;

    }

}

class Livro {
    private String nome;
    private int numPaginas;

    public Livro(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

}
