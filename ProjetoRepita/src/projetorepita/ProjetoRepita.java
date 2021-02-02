/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Fabiane
 */
public class ProjetoRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, soma = 0, totValores = -1, totPares = -1, totImpares = -1, acima100 = 0, media = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(Valor 0 interrompe)<em></html>"));
            totValores++;
            soma = soma + num;
            if ((num % 2) == 0) {
                totPares++;
            } else if ((num % 2) != 0) {
                totImpares++;
            } 
            if (num > 100) {
                acima100++;
            }
        } while (num != 0);
        media = soma/totValores;
        JOptionPane.showMessageDialog(null, "<html>Resultado:  <hr>" +
                 "<br> Total de Valores: " + totValores + 
                 "<br> Total de Pares:  " + totPares + 
                 "<br> Total de Impares:  " + totPares + 
                 "<br> Acima de 100:  " + acima100 + 
                 "<br> Média dos Valores:  " + media + "<html/>");
    }
    
}
