/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Fabiane
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int numero, soma = 0;
        String resp;
        
        do {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
            soma += numero;
            
            System.out.print("Você quer continuar? [S/N] "); 
            resp = teclado.next().toUpperCase();
        } while(resp.equals("S"));
        
        System.out.println("Soma = " + soma);
    }
    
}
