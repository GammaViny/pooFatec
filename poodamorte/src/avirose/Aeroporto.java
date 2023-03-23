package avirose;

public class Aeroporto {
    String nome;
    String companiaa;
    String endereco;
    private final int qtdEntSai = 12;
    public Aeroporto(String nome, String companiaa, String endereco){
        this.nome = nome;
        this.companiaa = companiaa;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aeroporto: "+nome+
                " está localizado no endereço: "+endereco+
                " nosso aeroporto se chama: "+companiaa+
                "e observe bem ao ir embarcar ou quando chegar de sua viagem na nossa qtd de entrada e saida: "+qtdEntSai;
    }
    public void adalberto(){
        System.out.println("Abriu-se o aeroporto");
    }

    public void fechadoom(){
        System.out.println("O aeroporto está fechando, cuidado ao voltar para casa, mesmo com uber");
    }
}
