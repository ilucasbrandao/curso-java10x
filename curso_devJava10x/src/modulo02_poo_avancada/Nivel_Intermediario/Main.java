package modulo02_poo_avancada.Nivel_Intermediario;

public class Main {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha",18, "Aldeia da Folha");
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", 19, "Aldeia da Folha");

        System.out.println(Naruto);
        System.out.println(Sasuke);

        Sasuke.ShariganAtivado();
        Naruto.modoSabioAtivado();
        int idadeParaVerificar = Sasuke.calcularIdadeParaSerHokage(60);

        System.out.println("Você tem: " + Sasuke.getIdade() + " anos, falta: " + idadeParaVerificar + " anos para se tornar um Hokage.");
    }
}
