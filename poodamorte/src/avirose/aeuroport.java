package avirose;
/*
Criar exercício de dependência sobre Aeroporto,
fazendo os relacionamentos que julgar necessário com as entidades abaixo:
        Aeronave
        Pessoa
        Piloto
        Passageiro
        Aeroporto

        1.Desenhe o diagrama de classe dessas entidades,
        especificando as associações entre elas.
        Cada classe deve conter pelo menos 3 características e ao menos 1 comportamento,
        não se esqueça de fazer também a herança.

        2.Escreva o código em Java das classes

        3.Crie uma função main que instancie ao menos
        2 instâncias de cada classe, preenchendo as associações.
*/

public class aeuroport {
    public static void main(String[] args) {
        Aeroporto trampico = new Aeroporto("Falaeiras", "Foofocas", "Rua ciranda d.e tal");
        trampico.adalberto();

        Aeronave naive = new Aeronave("GOLLLL É VEM DECOLAR NO GOLLL", "salaminhocos", 99);
        naive.Decolar();

        Piloto lot = new Piloto("Aquaris", 57, 348745612, "Rocha funebre", "Em dia", 12.2);
        lot.Pilotarviao();

        Passageiro gero = new Passageiro("Lisinha da batatinha", 21, 841367783, "Maldivas", "OK", 55);
        gero.entradaAeronave();

        System.out.print("\n\n\n\n\n");
        System.out.println("=========objetos=========");
        System.out.println(trampico.toString());
        System.out.println(naive.toString());
        System.out.println(lot.toString());
        System.out.println(gero.toString());

        trampico.fechadoom();
    }
}
