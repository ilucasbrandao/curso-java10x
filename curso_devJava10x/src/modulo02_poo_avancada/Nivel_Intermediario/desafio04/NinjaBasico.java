package modulo02_poo_avancada.Nivel_Intermediario.desafio04;

public class NinjaBasico implements Ninja{
    private String nome;
    private int idade;

    public NinjaBasico(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é: " + nome);
        System.out.println("Minha idade é: " + idade);
        System.out.println("Sou um ninja básico, sem habilidade ainda.");

    }

    @Override
    public void executarHabilidade() {
        System.out.println("Não tenho habilidade ainda.");

    }
}
