package modulo02_poo_avancada.Nivel_Intermediario;

public abstract class Hogakes {

    private String nome;
    private int idade;
    private boolean vivoOuMorto;
    private String aldeia;
    private int missoes;


    public Hogakes(String nome, int idade, boolean vivoOuMorto, String aldeia, int missoes) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
        this.aldeia = aldeia;
        this.missoes = missoes;
    }

    public abstract void sabedoria();

    public void infos(){
        System.out.println("Nome: " + nome +
                           "\nIdade: " + idade +
                            "\nVivo ou Morto: " + vivoOuMorto +
                            "\nAldeia: " + aldeia +
                            "\nMissões: " + missoes);
    }

}
