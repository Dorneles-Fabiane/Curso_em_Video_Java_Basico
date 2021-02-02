/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Fabiane
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Fabiane";
        String nome2 = "Fabiane";
        String nome3 = new String("Fabiane");
        String res;
        
        // res = (nome1==nome3) ? "Iguais":"Diferentes"; -> Retorna 'Diferentes'
        res = (nome1.equals(nome3)) ? "Iguais":"Diferentes"; // -> Retorna 'Iguais', forma utilizada para objetos.
        
        System.out.println(res);
    }
    
}
