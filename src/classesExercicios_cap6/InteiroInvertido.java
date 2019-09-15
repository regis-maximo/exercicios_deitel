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
public class InteiroInvertido {
    public void invertendo() {
        int numero = 12; 
        int i = 0;

    while(numero > 0) {
	i *= 10;
        i += (numero % 10);
        numero /= 10;
    }

    System.out.printf ("O número invertido é: %d.\n", i);

    }
}
