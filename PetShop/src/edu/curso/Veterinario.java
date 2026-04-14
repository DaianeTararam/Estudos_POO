package edu.curso;

public class Veterinario {
    String nome;
    String especialidade;
    String telefone;
    int idade;
    int anosExperiencia;

    public void examinarAnimal(Animal animal) {
        System.out.println("O veterinário " + nome + " está examinando o animal " + animal.nome + ".");
        
    }
}
