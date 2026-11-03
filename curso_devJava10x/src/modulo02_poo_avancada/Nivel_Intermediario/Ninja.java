package modulo02_poo_avancada.Nivel_Intermediario;

public class Ninja {
    private String nome;
    private int idade;
    private String aldeia;

    public Ninja(String nome, int idade,  String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public String EuSouUmNinja(){
        return "Oi, eu sou um ninja!";
    }

    public int calcularIdadeParaSerHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

    public int getIdade() {
        return idade;
    }
    public String getNome(){ return nome;}
}
