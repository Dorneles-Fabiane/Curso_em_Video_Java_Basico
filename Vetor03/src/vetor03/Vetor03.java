/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Fabiane
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {5.2, -4.5, 6, -2.1, 8.9};
        
        Arrays.sort(v);
        
        for (double pos : v) {
            System.out.print(pos + " ");
        }
    } 
    
}
