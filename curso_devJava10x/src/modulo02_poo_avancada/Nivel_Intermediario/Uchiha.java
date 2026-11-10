package modulo02_poo_avancada.Nivel_Intermediario;

public class Uchiha extends Ninja{
    private String habilidade;

    public Uchiha(String nome, int idade, String aldeia, String habilidade) {
        super(nome, idade, aldeia);
        this.habilidade = habilidade;
    }

    public void ShariganAtivado(){
        System.out.println("O sharigan ativou!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + getNome() + " , esse é meu ataque especial: " + habilidade);
    }
}
