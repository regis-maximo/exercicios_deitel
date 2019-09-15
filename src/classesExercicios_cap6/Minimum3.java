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
public class Minimum3 {
    
    double a;
    double b;
    double c;
    
    public void menorValor() {
        
        a = Double.parseDouble(JOptionPane.showInputDialog("valor de A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("valor de B"));
        c = Double.parseDouble(JOptionPane.showInputDialog("valor de C"));
        double min = Math.min(a, b);
        double menor =  Math.min(min, c);
        JOptionPane.showMessageDialog(null,"O menor Valor dos três numeros\n"+ menor);
    }
    
}
