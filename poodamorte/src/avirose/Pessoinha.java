package avirose;

public class Pessoinha {
    String nome;
    int idade;
    float cpf;
    public Pessoinha(String nome, int idade, int cpf){
        super();
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void chorar() {
        System.out.println("Oh que dó está chorando");
    }

    public void alegria(){
        System.out.println("Oh está sorrido deve está bilu teteia das ideias");
    }
}
