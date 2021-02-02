/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author Fabiane
 */
public class TesteFuncao01 {
    private static int soma (int v1, int v2) {
        int soma = v1+ v2;
        return soma;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int soma = soma(5,7);
        System.out.println("Começou o Programa!");
        System.out.println("A soma é " + soma);
        
    }
    
}
