package modulo02_poo_avancada.Nivel_Intermediario.desafio03;

public class Uchiha extends Ninja {
    private String habilidadeEspecial;

    public Uchiha(String nome, int idade, String missao, String nivelDificuldade, String statusMissao, String habilidadeEspecial) {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("Essa é minha habilidade especial: " + this.habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + this.habilidadeEspecial);
    }
}
