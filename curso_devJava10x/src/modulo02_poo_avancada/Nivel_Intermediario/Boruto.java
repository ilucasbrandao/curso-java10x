package modulo02_poo_avancada.Nivel_Intermediario;

public class Boruto extends Uzumaki implements HyugaUzumaki {

    public Boruto(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void AtivarKarma() {
        System.out.println("O Karma foi ativado! Eu sou um Hyuga Uzumaki");
    }

    public void AtivarJougan() {
        System.out.println("Jougan foi ativado! Eu sou um Uzumaki");
    }
}
