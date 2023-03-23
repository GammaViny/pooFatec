package dinossrei;

/*
Nesta atividade vamos criar um pequeno jogo,
estilo Tamagochi

        Jogo do Dinossauro - skeep

        O Skeep é um dinossauro e será o personagem do nosso jogo,
        ele possui as seguintes características e comportamentos:

        Características ou atributos:

        energia
        velocidade
        temperatura
        humor

        Comportamentos ou metodos:

        pular()
        correr()
        comer()
        cantar()
        tomarSol()
        ficarNaSombra()

        Regras:

        O dinossauro precisa:

        Tomar Sol para aumentar a velocidade, (quando tomar sol, acrescenta a velocidade, temperatura e tornar o humor "feliz").
        a temperatura, além de deixa-lo com o humor feliz.
        Comer para aumentar a energia,
        diminui a velocidade, (quando comer, decrementa velocidade, acrescenta energia, e torna o humor "feliz").
        e deixar o humor feliz.
        Correr gasta energia e velocidade, (ao correr, velocidade e energia decrementa, porém o humor fica "feliz").
        mas deixa o humor feliz
        ficar na sombra recupera energia deixa o humor triste e diminui a temperatura (ficar na sombra, torna ele "triste", recupera energia, e decrementa a temperatura.
        cantar gasta energia e deixa o humor feliz. (cantar deixa o humor dele "feliz", e gasta energia).
        pular gasta energia e velocidade e deixa o humor feliz. (pular vai gastar energia e velocidade e o humor vai ficar "feliz").


        Faça uma classe chamada Dinossauro,
        contendo as características e comportamentos do Skeep.

        Crie uma classe de Teste com o método main,
        para executar as atividades abaixo:

        Crie uma instância do classe Dinossauro chamada de skeep
        Crie uma instância da classe Scanner chamada de scan
        Em um loop inifinito.

        Mostre na tela as características do objeto skeep
        Mostre um menu de opções para o usuário com as seguintes opções:

        (P)ular           (C)orrer               Co(M)er
        C(A)ntar        Tomar (S)ol          Ficar na S(O)mbra

        Pegue a primeira letra do que o usuário digitar como sendo a opção escolhida
        String textoMaiusculo = scan.nextLine().toUpperCase();
        char letra = textoMaiusculo.charAt(0);
        Conforme a opção escolhida execute o método correspondente no objeto skeep*/

public class skeepPrin {
}
