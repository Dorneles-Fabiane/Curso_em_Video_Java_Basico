/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Fabiane
 */
public class ResolucaoDaTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        Dimension tamanhoTela = toolKit.getScreenSize();
        
        System.out.print("A resoulução da sua tela é ");
        System.out.println(tamanhoTela.height + " X " + tamanhoTela.width);    
    }
    
}
