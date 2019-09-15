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
public class TabelaOct_Hex {
    
    public void tabela() {
        Integer a; 
        System.out.println("decimal binario hexadecimal octal");
        for(int i = 0; i<=256; i++) {
            a = i; System.out.print(a + " - "); 
            System.out.print(Integer.toBinaryString(i) + " - ");
            System.out.print(Integer.toHexString(i) + " - "); 
            System.out.println(Integer.toOctalString(i)); }
    }
    
}
