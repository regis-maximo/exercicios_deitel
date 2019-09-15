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
public class CaraCoroa {

    int cara;
    int coroa;

    String tossCoin = "s";

    public void lancarMoeda() {
        Scanner tecla = new Scanner(System.in);
        Random lado = new Random();
        
        int lancamento;
        
            while (tossCoin.equals("s")) {
                System.out.println("digite s para continuar ou qualquer outra para sair");
                tossCoin = tecla.next();
            lancamento = 1 + lado.nextInt(2);
            if (lancamento == 1) {
                obtendoLado(true);
            } else {
                obtendoLado(false);
            }
        }
    }

    public void obtendoLado(boolean lado) {

        int soma;

        if (lado == true) {
            cara++;
            soma = cara;
            System.out.println("caiu em cara = soma total: " + soma);
        } else {
            coroa++;
            soma = coroa;
            System.out.println("caiu em coroa = soma total: " + soma);
        }
    }
}
