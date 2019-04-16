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
public class HTML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Site> ArrSt = new ArrayList();
        Site Pa = new Paragrafo(500,"Vermelho");
        Site Li = new Link(200,"Azul");
        Site Lis = new Lista(600,"Amalero");
        
        ArrSt.add(Pa);
        ArrSt.add(Li);
        ArrSt.add(Lis);
        
        Desktop dk = new Desktop();
        Notebook nt = new Notebook();
        Tablet tb = new Tablet();
        Celular cl = new Celular();
        
        dk.projectSize(ArrSt);
        
        ArrSt.forEach((st) -> {
            System.out.println(Site.ToString(st.tamanho, st.cor));
        });
        
        nt.projectSize(ArrSt);
        
        ArrSt.forEach((st) -> {
            System.out.println(Site.ToString(st.tamanho, st.cor));
        });
        
        tb.projectSize(ArrSt);
        
        ArrSt.forEach((st) -> {
            System.out.println(Site.ToString(st.tamanho, st.cor));
        });
        
        cl.projectSize(ArrSt);
        
        ArrSt.forEach((st) -> {
            System.out.println(Site.ToString(st.tamanho, st.cor));
        });
    }
}
