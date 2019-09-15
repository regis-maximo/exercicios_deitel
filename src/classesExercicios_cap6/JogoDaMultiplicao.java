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

public class JogoDaMultiplicao {
    Scanner tecla = new Scanner(System.in);
    Random numero1 = new Random();
    Random numero2 = new Random();
    int num1;
    int num2;

    public void gamePlay() {
        int resultado;
        int resposta;
        num1 = 1 + numero1.nextInt(10);
        num2 = 1 + numero2.nextInt(10);

        resultado = num1 * num2;
     
        do{
            System.out.println("Quantos que é???");
            System.out.printf("%d X %d = ", num1, num2);
            resposta = tecla.nextInt();
            
            if (resposta == resultado) {
                System.out.println("Você acertou Parabéns");
            } else {
                System.out.println("Você errou tente outra vez...");
            }
            
        }while(resposta != resultado);
    }
}
