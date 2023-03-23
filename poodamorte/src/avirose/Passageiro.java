package avirose;

public class Passageiro extends Pessoinha{
    String passaporte;
    String passagem;
    int lugar = (Integer.min(01, 99));


    public Passageiro(String nome, int idade, int cpf, String passagem, String passaporte, int lugar){
        super(nome, idade, cpf);
        this.lugar = lugar;
        this.passagem = passagem;
        this.passaporte = passaporte;
    }

    @Override
    public String toString() {
        return "Passageiro com o passaporte: " + passaporte + ", da passagem =" + passagem + ", está np lugar =" + lugar;
    }
    public String validaCheckin(String validado){
        if (passagem != null) {
            return passagem;
        }else {
            validado = "Passagem invalida, passaporte vencido";
            return validado;
        }
    }

    public void entradaAeronave(int lugar){
        System.out.println("Entrou com sucesso na aeronave e" +
                " sentou-se no assento pré-reservado: " +lugar);
    }
}
