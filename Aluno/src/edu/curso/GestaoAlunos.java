package edu.curso;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class GestaoAlunos {
    private int indice = 0;
    private Aluno[] alunos = new Aluno[50];
    private Scanner scan = new Scanner(System.in);

    public void criar() {
        if (indice >= alunos.length) {
            System.out.println("Capacidade máxima de alunos atingida.");
            return;
        }

        System.out.println("Digite o ID do aluno:");
        long id = Long.parseLong(scan.nextLine());

        System.out.println("Digite o RA do aluno:");
        String ra = scan.nextLine();

        System.out.println("Digite o nome do aluno:");
        String nome = scan.nextLine();

        System.out.println("Digite a data de nascimento do aluno (dd/MM/yyyy):");
        String data = scan.nextLine();
        LocalDate nascimento = LocalDate.parse(data, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Aluno novoAluno = new Aluno(id, nascimento, nome, ra);
        alunos[indice] = novoAluno;
        indice++;

        System.out.println("Aluno criado com sucesso!");
    }

    public void exibir() {
        System.out.println("Digite o RA do aluno que deseja exibir:");
        String ra = scan.nextLine();

        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.ra.equals(ra)) {
                System.out.println(aluno);
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void excluir() {
        System.out.println("Digite o RA do aluno que deseja excluir:");
        String ra = scan.nextLine();

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].ra.equals(ra)) {
                alunos[i] = null;
                System.out.println("Aluno excluído com sucesso!");
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void atualizar() {
    System.out.println("Digite o RA do aluno que deseja atualizar:");
    String ra = scan.nextLine();

    for (int i = 0; i < alunos.length; i++) {
        if (alunos[i] != null && alunos[i].getRa().equals(ra)) {
            System.out.println("Digite o novo nome do aluno:");
            String nome = scan.nextLine();

            System.out.println("Digite a nova data de nascimento do aluno (dd/MM/yyyy):");
            String data = scan.nextLine();
            LocalDate nascimento = LocalDate.parse(data, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            alunos[i].setNome(nome);
            alunos[i].setNascimento(nascimento);

            System.out.println("Aluno atualizado com sucesso!");
            return;
        }
    }
    System.out.println("Aluno não encontrado.");
}


    public void menu() {
        while (true) {
            System.out.println("\n*** Menu Gestão de Alunos ***");
            System.out.println("(C)riar  (E)xibir  (R)emover");
            System.out.println("(A)tualizar  (S)air");
            System.out.print("Escolha uma opção: ");

            String textoMaiusculo = scan.nextLine().toUpperCase();
            char letra = textoMaiusculo.charAt(0);

            switch (letra) {
                case 'C':
                    criar();
                    break;
                case 'E':
                    exibir();
                    break;
                case 'R':
                    excluir();
                    break;
                case 'A':
                    atualizar();
                    break;
                case 'S':
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}