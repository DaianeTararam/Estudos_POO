package edu.curso;

public class Dono {
    String nome;
    String endereco;
    String telefone;
    int idade;
    int quantidadeAnimais;

    public void alimentarAnimal(Animal animal) {
        System.out.println("O dono " + nome + " está alimentando o animal " + animal.nome + ".");
        animal.comer();
    }
}
