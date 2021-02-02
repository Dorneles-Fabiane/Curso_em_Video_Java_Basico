/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Fabiane
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vet[] = {3, 7, 9, 5, 10, 20, 352};
        
        for (int pos : vet) {
            System.out.print(pos + " ");
        }
        System.out.println(" ");
        
        int pos = Arrays.binarySearch(vet, 352);
        
        System.out.println("Encontrei o valor na posição " + pos);
    }
    
}
