/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesExercicios_cap6;

/**
 *
 * @author Regis_Maximo
 */
public class NumerosPrimos {

    int num = 9;
    int aux;

    public void verifica() {

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                aux++;
            }
        }
        if (aux <= 2) {
            System.out.println("primo");
        } else {
            System.out.println("nao primo");
        }
    }

    public void primosAte10000() {
        
        for(int i = 1; i <= 10; i++) {
            int cont = 0;
            for(int k = 1; k <= i; k++) {
                if(i % k == 0) {
                    ++cont;
                }
            }
            if(cont == 2) {
                System.out.println("o numero "+ i + " é primo");
            }
        }
    }
}
    

