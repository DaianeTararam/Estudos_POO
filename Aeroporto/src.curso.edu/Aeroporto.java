public class Aeroporto {
    
    String nome;
    String cidade;  
    int capacidadeMaxima;

    public Aeroporto() {
        super();
    }

    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.nome = "Aeroporto Internacional";
        aeroporto.cidade = "São Paulo";
        aeroporto.capacidadeMaxima = 100;

        System.out.println("Nome do Aeroporto: " + aeroporto.nome);
        System.out.println("Cidade: " + aeroporto.cidade);
        System.out.println("Capacidade Máxima: " + aeroporto.capacidadeMaxima);
    }
}