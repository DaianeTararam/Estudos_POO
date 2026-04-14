package edu.curso;

import java.time.LocalDate;

public class Aluno {
    private long id;
    private LocalDate nascimento;
    private String nome;
    private String ra;

    public Aluno(long id, LocalDate nascimento, String nome, String ra) {
        this.id = id;
        this.nascimento = nascimento;
        this.nome = nome;
        this.ra = ra;

    }
    public long getId(){
        return id;
    }

    public void setId( long id){
        this.id = id;
    }

    public LocalDate getNascimento(){
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa(){
        return ra;
    }

    public void setRa(String ra){ 
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nascimento=" + nascimento +
                ", ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
