/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesExercicios_cap6;

import java.util.Scanner;

/**
 *
 * @author Regis_Maximo
 */
public class TempCelsius {
    int celsius = 0;
    Scanner input = new Scanner(System.in);
    int c;
    
    public void calcCelsius() {
        
        System.out.println("digite a temperatura Em Fahrenheit");
        celsius = input.nextInt();
        
        c = (int) (5.0/9.0 * (celsius - 32));
        System.out.println("resultado: "+c);
    }
    
    public void calcFerh() {
        
        int ferh;
        System.out.println("digite a temperatura Em celsius");
        int valor = input.nextInt();
        
        ferh = (int) (9.0/5.0 * valor + 32);
        System.out.println("resultado: "+ferh);
    }
}
