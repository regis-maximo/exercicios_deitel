/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesExercicios_cap6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Regis_Maximo
 */
public class AdivinhaNumero_2 {

    int cont = 0;
    int resposta;
    int numero;

    Scanner input = new Scanner(System.in);
    Random aleatorio = new Random();

    public void play() {
        String continua = "s";

        System.out.println("jogo do adivinha digite um numero qualquer inteiro\n"
                + "Vamos começar, qual número?");
        resposta = input.nextInt();
        numero = 1 + aleatorio.nextInt(1000);

        if (resposta == numero) {
            System.out.println("Parabéns Você adinhou o número " + numero);
        }

        System.out.println("Você Errou, Deseja Continuar\n"
                + "tecle s para sim ou qualquer outra tecla para sair do jogo");
        continua = input.next();

        playAjuda(numero);

        if (!continua.equals("s")) {
            System.out.println("O Número correto era " + numero);
        }
    }

    public void playAjuda(int numero) {

        if (numero < 500) {
            System.out.println("Você quase conseguindo...");
            System.out.println("o numero está entre 1 e 500");
            playAjuda2(numero);
        } else {
            System.out.println("Você está quase conseguindo...");
            System.out.println("o numero está entre 1 e 199");
            playAjuda3(numero);
        }
        //System.out.println(vnumero);
    }

    public void playAjuda2(int numero) {
        int vnumero;
        int cont2 = 1;
        if (numero < 500) {
            do {
                vnumero = input.nextInt();
                if (vnumero == numero) {
                    System.out.println("Parabéns você Acertou");
                    System.out.println("numero correto é " + vnumero);
                } else {
                    System.out.println("digite..");
                    playAjuda3(numero);
                }
                cont2++;
            } while (cont2 < 10);
            playAjuda3(numero);
        }

    }

    public void playAjuda3(int numero) {

        int vnumero;
        int cont2 = 1;
        if (numero > 500) {
            do {
                vnumero = input.nextInt();
                if (vnumero == numero) {
                    System.out.println("Parabéns você Acertou");
                    System.out.println("numero correto é " + vnumero);
                } else {
                    System.out.println("Você errou");
                    System.out.println("digite um numero de 1 a 500");
                }
                cont2++;
            } while (cont2 < 10);
            System.out.println("Fim de Jogo");
        }
    }

}
