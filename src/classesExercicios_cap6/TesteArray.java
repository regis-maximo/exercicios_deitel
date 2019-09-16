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
public class TesteArray {

    int notas[] = {1, 2, 4, 2, 0, 1, 0, 0, 2, 5, 3};

    public void resultado() {

        System.out.printf("%s%13s\n", "Nota", "Quantidade");

        for (int cont = 0; cont < notas.length; cont++) {

            if (cont == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", cont * 10, cont * 10 + 9);
            }
            for (int stars = 0; stars < notas[cont]; stars++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
