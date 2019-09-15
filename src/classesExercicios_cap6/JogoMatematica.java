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
public class JogoMatematica {
    
    Scanner tecla = new Scanner(System.in);
    Random numero1 = new Random();
    Random numero2 = new Random();
    int num1;
    int num2;

    public void play() {
        int nivel;
        int resposta;
        int resultado;
        System.out.println("Escolha um nivel\n1 - (SOMA)\n2 - (SUBTRAÇÂO)\n3 - (MULTIPLICAÇÂO)"
                + "4(DIVISÂO)");
        nivel = tecla.nextInt();

        switch (nivel) {
            case 1:
                num1 = 100 + numero1.nextInt(999);
                num2 = 100 + numero2.nextInt(999);
                resultado = num1 + num2;

            do {
                System.out.printf("Quantos que é %d + %d = ?\n", num1, num2);
                resposta = tecla.nextInt();
                    
                    if(resposta == resultado) {
                        System.out.println("Parabéns Você Acertou resposta correta = " +resposta);
                    } else {
                        System.out.println("Você Errou tente de novo...");
                    }
                
            } while(resposta != resultado);
            break;
            
             case 2:
                num1 = 100 + numero1.nextInt(999);
                num2 = 100 + numero2.nextInt(999);
                resultado = num1 - num2;

            do {
                System.out.printf("Quantos que é %d - %d = ?\n", num1, num2);
                resposta = tecla.nextInt();
                    
                    if(resposta == resultado) {
                        System.out.println("Parabéns Você Acertou resposta correta = " +resposta);
                    } else {
                        System.out.println("Você Errou tente de novo...");
                    }
                
            } while(resposta != resultado);
            break;
            
            case 3:
                num1 = 1 + numero1.nextInt(10);
                num2 = 1 + numero2.nextInt(10);
                resultado = num1 * num2;

            do {
                System.out.printf("Quantos que é %d X %d = ?\n", num1, num2);
                resposta = tecla.nextInt();
                    
                    if(resposta == resultado) {
                        System.out.println("Parabéns Você Acertou resposta correta = " +resposta);
                    } else {
                        System.out.println("Você Errou tente de novo...");
                    }
                
            } while(resposta != resultado);  
            break;
            
            case 4:
                num1 = 100 + numero1.nextInt(999);
                num2 = 100 + numero2.nextInt(999);
                resultado = num1 * num2;

            do {
                System.out.printf("Quantos que é %d / %d = ?\n", num1, num2);
                resposta = tecla.nextInt();
                    
                    if(resposta == resultado) {
                        System.out.println("Parabéns Você Acertou resposta correta = " +resposta);
                    } else {
                        System.out.println("Você Errou tente de novo...");
                    }
                
            } while(resposta != resultado);  
            break;
            
            default:
                System.out.println("digitado respostas inesperadas pelo sistema\nfechando...1");
        }
    }
    
}
