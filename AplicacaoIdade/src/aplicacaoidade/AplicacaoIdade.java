/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaoidade;

import java.util.Scanner;

/**
 *
 * @author Fabiane
 */
public class AplicacaoIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2020 - nasc;
        
        System.out.println("Sua idade é " + idade);
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }
    
}
