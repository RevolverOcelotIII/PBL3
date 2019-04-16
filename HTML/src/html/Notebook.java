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
public class Notebook extends Dispositivos {
    @Override
    public void projectSize(ArrayList <Site> site){
        for(int i=0;i<site.size();i++){
            site.get(i).tamanho*=2;
        }
    }
}
