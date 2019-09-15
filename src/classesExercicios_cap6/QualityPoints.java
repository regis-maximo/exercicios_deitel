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
public class QualityPoints {
    
    public void qualityPoints(int nota) {
        int retorno = 0;
        if(nota > 90 && nota < 100) {
        retorno = 4;
        }
        if(nota > 80 && nota < 90) {
        retorno = 3;
        }
        if(nota > 70 && nota < 80) {
        retorno = 2;
        }
        if(nota > 60 && nota < 70) {
        retorno =  1;
        }
        if(nota < 60) {
        retorno = 0;
        }
        obtendoNota(retorno);
    }
    
    public void obtendoNota(int nota) {
        switch(nota) {
            case 4: JOptionPane.showMessageDialog(null, "parabéns\n está com 4");
            break;
            case 3: JOptionPane.showMessageDialog(null, "boa nota\nestá com 3");
            break;
            case 2: JOptionPane.showMessageDialog(null, "ta bom, mas voçê pode melhorar\nestá com 2");
            break;
            case 1: JOptionPane.showMessageDialog(null, "foi por pouco dessa vez, estude mais.\nestá com 1");
            break;
            default: JOptionPane.showMessageDialog(null, "Infelizmente não foi dessa vez, estude mais\nestá com 0");
            break;
        }
    }
    
}
