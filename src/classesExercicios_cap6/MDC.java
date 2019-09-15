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
public class MDC {

    public void calcMdc() {

        int valor1 = 12;
        int valor2 = 30;

        int resto;
        while (valor2 != 0) {
            resto = valor1 % valor2;
            valor1 = valor2;
            valor2 = resto;

        }
        System.out.println(valor1);
    }
}
