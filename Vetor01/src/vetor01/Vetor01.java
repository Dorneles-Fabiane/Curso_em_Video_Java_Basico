/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author Fabiane
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3, 5, 1, 8, 4, -5};
        
        Arrays.sort(n);
        
        
        for (int pos : n) {
            System.out.println(pos + " ");
        }
        
        for (int cont = 0; cont < n.length; cont++) {
            System.out.println("Na posição " + cont + " temos o valor " + n[cont]);
        }
    }
    
}
