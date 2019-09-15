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
public class AdivinhaNumero {

    int resposta;
    int numero;

    Scanner input = new Scanner(System.in);
    Random aleatorio = new Random();

    public void play() {
        String continua = "s";

        do {
            System.out.println("jogo do adivinha digite um numero qualquer inteiro\n"
                    + "Vamos começar, qual número?");
            resposta = input.nextInt();
            numero = 1 + aleatorio.nextInt(1000);

            if (resposta == numero) {
                System.out.println("Parabéns Você adinhou o número " + numero);
            } else {
                System.out.println("Você Errou, Deseja Continuar\n"
                        + "tecle s para sim ou qualquer outra tecla para sair do jogo");
                continua = input.next();
            }

        } while (continua.equals("s"));

        if (!continua.equals("s")) {
            System.out.println("O Número correto era " + numero);
        }
    }

}
