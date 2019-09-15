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
public class JogodaSorte {

    private double bankBalance = 1000.00; // saldo para permitir apostas
    private double waper; //variável que receberá uma aposta

    private enum Status {
        CONTINUA, PERDE, GANHA
    }; //enumeração com constatntes
    // que representam o status do jogo

    private final static int SNAKE_EYES = 2; // constantes que representam lancamentos
    private final static int TREY = 3;       // dos dados
    private final static int SEVEN = 7;      // *
    private final static int YO_LEVEN = 11;  // *
    private final static int BOX_CARS = 12;  // *

    Scanner input = new Scanner(System.in);
    Random lancar = new Random();
    Random lancarFrases = new Random();

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public double getWaper() {
        return waper;
    }

    public void setWaper(double waper) {
        this.waper = waper;
    }

    public void insirirAposta() {

        do {
            System.out.println("Digite sua Aposta");
            this.waper = input.nextDouble();

            if (this.waper > this.bankBalance) {
                System.out.println("digite uma aposta inferior a R$ 1.000,00");
            }

        } while (this.waper > this.bankBalance);

        play();
    }

    public void play() {

        int pontos = 0; // pontos se não ganhar ou perder na 1° lançamento
        Status statusJogo; // pode ter CONTINUA, PERDE OU GANHA

        int somaDados = lancarDados();

        switch (somaDados) {
            case SEVEN:
            case YO_LEVEN:
                statusJogo = Status.GANHA;
                this.waper += this.waper; // somou a aposta que ganhou com que apostou
                this.waper += this.bankBalance; // atribui o valor de bankBalance + aposta
                setBankBalance(this.waper); // altera o valor de bankBalance
                int frase1 = 1 + lancarFrases.nextInt(3);
                System.out.println("VAlor atual: R$"+getBankBalance());
                switch (frase1) {
                    case 1:
                        System.out.println("Oh, Ai sim Maravilha Você Ganhou");
                        break;
                    case 2:
                        System.out.println("Hummm, Você ta Montado na Grana");
                        break;
                    case 3:
                        System.out.println("Hummm, Se fosse Você Parava Agora.");
                        break;
                }
                break;

            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                statusJogo = Status.PERDE;
                this.waper -= this.waper;
                this.waper -= this.bankBalance; // atribui o valor de bankBalance + aposta
                setBankBalance(this.waper); // altera o valor de bankBalance
                int frase2 = 1 + lancarFrases.nextInt(3);

                switch (frase2) {
                    case 1:
                        System.out.println("Ahhh, Que Pena Você perdeu não foi dessa vez");
                        break;
                    case 2:
                        System.out.println("Você Faliu");
                        break;
                    case 3:
                        System.out.println("Tenta da Próxima por que dessa você perdeu tudo");
                        break;
                }
                break;

            default:
                statusJogo = Status.CONTINUA;
                pontos = somaDados;
                System.out.println("Seus Pontos Atuais são: = " + pontos);
                System.out.println("saldo em conta de R$" + getBankBalance());
                break;
        }

        if (somaDados == pontos) {
            statusJogo = Status.GANHA;
            this.waper += this.waper; // somou a aposta que ganhou com que apostou
            this.bankBalance -= this.waper; // atribui o valor de bankBalance + aposta
            setBankBalance(this.waper); // altera o valor de bankBalance
            int frase1 = 1 + lancarFrases.nextInt(3);
            switch (frase1) {
                case 1:
                    System.out.println("Oh, Ai sim Maravilha Você Ganhou");
                    break;
                case 2:
                    System.out.println("Hummm, Você ta Montado na Grana");
                    break;
                case 3:
                    System.out.println("Hummm, Se fosse Você Parava Agora.");
                    break;
            }
             System.out.println("saldo em conta de R$" + getBankBalance());
        } else if (somaDados == SEVEN) {

            statusJogo = Status.PERDE;
            this.waper -= this.waper;
           this.bankBalance -= this.waper; // atribui o valor de bankBalance + aposta
            setBankBalance(this.waper); // altera o valor de bankBalance
            int frase2 = 1 + lancarFrases.nextInt(3);

            switch (frase2) {
                case 1:
                    System.out.println("Ahhh, Que Pena Você perdeu não foi dessa vez");
                    break;
                case 2:
                    System.out.println("Você Faliu");
                    break;
                case 3:
                    System.out.println("Tenta da Próxima por que dessa você perdeu tudo");
                    break;
            }
            
        }

    }

    public int lancarDados() {
        // seleciona os valores aleatórios para somar
        int dado1 = 1 + lancar.nextInt(6);
        int dado2 = 1 + lancar.nextInt(6);

        int soma = dado1 + dado2;

        System.out.println("Resultado dos Lançamentos");
        System.out.printf("dado1 dado2\n%d + %d = %d\n", dado1, dado2, soma);

        return soma;

    }

}
