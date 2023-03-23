package avirose;

public class Aeronave {
    int capacidade;
    String nome;
    String companhia;

    public Aeronave(String nome, String companhia, int capacidade){
        this.nome = nome;
        this.companhia = companhia;
        this.capacidade = capacidade;
    }

    public void Decolar() {
        System.out.println("E saiu a notica que o mundo " +
                "antigo jamais acreditaria, " +
                "a ave de metal subiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!!!");
    }

    @Override
    public String toString() {
        return "Esse é o avião que vai te pegar: "+
                nome+ " na mistura da companhia: "+
                companhia+ "ele serve para até "+
                capacidade+ " capacidade de pessoas";
    }
}
