/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html;

import java.util.ArrayList;

/**
 *
 * @author danpg
 */
public class Desktop extends Dispositivos {
    @Override
    public void projectSize(ArrayList <Site> site){
        for(int i=0;i<site.size();i++){
            if(site.get(i) instanceof Paragrafo||site.get(i) instanceof Lista){
                site.get(i).tamanho+=site.get(i).tamanho*1.5;
            }
            if(site.get(i) instanceof Link){
                site.get(i).tamanho+=site.get(i).tamanho*1.2;
            }
        }
    }
}
