/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html;

/**
 *
 * @author danpg
 */
public abstract class Site {
    protected double tamanho;
    protected String cor;
    
    Site(double tamanho,String cor){
        this.tamanho = tamanho;
        this.cor = cor;
    }
    
    public static String ToString(double tam, String cor){
        return "\nTamanho: "+ tam +"\nCor: " + cor;
    }
}
