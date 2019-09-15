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
public class Distance {

    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double resultado;

    public Distance() {
        this.x1 = 0.0;
        this.x2 = 0.0;
        this.y1 = 0.0;
        this.y2 = 0.0;
    }
    
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    
        
    public void calcDistancia() {
        Scanner input = new Scanner (System.in);
        
       
        System.out.println("digite valor de x1");
        double vx1 = input.nextDouble();
        setX1(vx1);
        
        System.out.println("digite valor de x2");
        double vx2 = input.nextDouble();
        setX2(vx2);
        
        System.out.println("digite valor de y1");
        double vy1 = input.nextDouble();
        setY1(vy1);
        
        System.out.println("digite valor de y2");
        double vy2 = input.nextDouble();
        setY1(vy2);
        
        double dist_x = x1 - x2;
        double dist_y = y1 - y2;
        
        setResultado(dist_x);
        System.out.printf("Resultado de distância dos x's: %.2f\n", getResultado());
        setResultado(dist_y);
        System.out.printf("Resultado de distância dos y's: %.2f\n", getResultado());       
    }

    public double getResultado() {
        
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
