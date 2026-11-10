package modulo02_poo_avancada.Nivel_Intermediario;

public class Main {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha",18, "Aldeia da Folha", "Ataque de fogo");
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", 19, "Aldeia da Folha");
        Boruto Boruto = new Boruto("Boruto Hyuga Uzumaki", 9, "Aldeia da Folha");

        System.out.println(Naruto);
        System.out.println(Sasuke);

        Sasuke.ShariganAtivado();
        Naruto.modoSabioAtivado();
        Sasuke.habilidadeEspecial();
        Boruto.modoSabioAtivado();
        Boruto.AtivarKarma();
        Boruto.AtivarJougan();
        int idadeParaVerificar = Sasuke.calcularIdadeParaSerHokage(60);

        System.out.println("Você tem: " + Sasuke.getIdade() + " anos, falta: " + idadeParaVerificar + " anos para se tornar um Hokage.");

        System.out.println("-".repeat(50));
        System.out.println("Estudando sobre classes e métodos abstratos");

        Senju Tobirama = new Senju("Tobirama", 19, false, "Aldeia do Gelo",0);
        Tobirama.infos();
        Tobirama.sabedoria();
    }
}
