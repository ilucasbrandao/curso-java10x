package modulo02_poo_avancada.Nivel_Intermediario.desafio04;

public class NinjaAvancado implements Ninja {
    private String nome;
    private int idade;
    private TipoHabilidade habilidade;
    private String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é: " + nome);
        System.out.println("Minha idade é: " + idade);
        System.out.println("Minha habilidade é: " + habilidade);

    }

    @Override
    public void executarHabilidade() {
        System.out.println("Usando minha habilidade especial: " + habilidade);
        System.out.println("Minha especialidade é: " + especialidade);
    }
}
