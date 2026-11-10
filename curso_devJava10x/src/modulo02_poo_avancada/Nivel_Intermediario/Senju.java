package modulo02_poo_avancada.Nivel_Intermediario;

public class Senju extends Hogakes{

    public Senju(String nome, int idade, boolean vivoOuMorto, String aldeia, int missoes) {
        super(nome, idade, vivoOuMorto, aldeia, missoes);
    }

    @Override
    public void sabedoria() {
        System.out.println("Acabei de receber sabedoria.");
    }
}
