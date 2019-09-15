/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesExercicios_cap6;

import javax.swing.JOptionPane;

/**
 *
 * @author Regis_Maximo
 */
public class NumbersPerfect {

    public void perfect() {

        int num = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        int temp = 0;
       
            System.out.printf("soma dos numeros ");
        for(int i = 1; i < num; i++) {
           
            if(num % i == 0) {
                temp = temp + i;
              
                System.out.printf("%d ", i);              
            }         
        } 
        if(temp == num) {
            System.out.println("= "+ temp + " perfeito");
        } else { 
            System.out.println("= "+ temp + " não perfeito");
        }
    }
}
