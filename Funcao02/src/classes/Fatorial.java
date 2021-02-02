/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Fabiane
 */
public class Fatorial {
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    public void setValor(int n) {
        num = n;
        String string = "";
        
        int fatorial = 1;
        
        for (int c = n; c > 1; c--) {
            fatorial *= c;
            string +=c + " X ";
        }
        string += "1 = ";
        fat = fatorial;
        formula = string;
    }
    
    public int getFatorial() {
        return fat;
    }
    
    public String getFormula() {
        return formula;
    }
}
