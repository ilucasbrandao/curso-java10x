package modulo02_poo_avancada.Nivel_Intermediario.desafio04;

public class Main {
    public static void main(String[] args) {
        NinjaBasico ninja1 = new NinjaBasico("Marcos", 19);

        ninja1.mostrarInformacoes();
        ninja1.executarHabilidade();
        System.out.println("-".repeat(50));

        NinjaAvancado ninja2 = new NinjaAvancado("Paulo",20, TipoHabilidade.NINJUTSU, "Arte do Fogo");
        ninja2.mostrarInformacoes();
        ninja2.executarHabilidade();
    }
}
