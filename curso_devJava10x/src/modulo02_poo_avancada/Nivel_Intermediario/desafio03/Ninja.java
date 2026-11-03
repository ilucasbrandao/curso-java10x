package modulo02_poo_avancada.Nivel_Intermediario.desafio03;

public class Ninja {
    private String nome;
    private int idade;
    private String missao;
    private String nivelDificuldade;
    private String StatusMissao;

    public Ninja(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        StatusMissao = statusMissao;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Missao: " + this.missao);
        System.out.println("Nivel dificuldade: " + this.nivelDificuldade);
        System.out.println("Status: " + this.StatusMissao);
    }
}
