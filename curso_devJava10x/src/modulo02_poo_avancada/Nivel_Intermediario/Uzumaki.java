package modulo02_poo_avancada.Nivel_Intermediario;

public class Uzumaki extends Ninja {
    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void modoSabioAtivado(){
        System.out.println("Meu nome é: " + super.getNome() + " e eu ativei o modo sábio!");
    }
}
