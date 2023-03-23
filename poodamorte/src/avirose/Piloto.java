package avirose;

public class Piloto extends Pessoinha{
    String uniforme;
    String licensa;
    double tmpServico;

    public Piloto(String nome, int idade, int cpf, String uniforme,
                  String licensa, double tmpServico) {
        super(nome, idade, cpf);
        this.uniforme = uniforme;
        this.licensa = licensa;
        this.tmpServico = tmpServico;
    }

    @Override
    public String toString() {
        return "Piloto com a licensa: "+ licensa
                +" com o unifome: " + uniforme +
                " tem esse tanto de carga horaria";
    }

    public void Pilotarviao() {
        System.out.println("Piloto está on");
    }
    public void DescerViao() {
        System.out.println("Piloto está chegando para estacionar avião");
    }
}
