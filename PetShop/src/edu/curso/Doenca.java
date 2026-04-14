package edu.curso;

public class Doenca {
    String nome;
    String sintomas;
    String tratamento;
    int duracaoDias;
    int gravidade;

    public void diagnosticarAnimal(Animal animal) {
        System.out.println("O animal " + animal.nome + " foi diagnosticado com a doença " + nome + ".");
    }
}
