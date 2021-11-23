/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dati;
import java.util.*;

/**
 *
 * @author alessandrobarazzuol
 */

public class dati {
    /**
     * Java ha dati semplici quali il C++, ed in piu ha dati che sono delle classi 
     * con metodi per il loro trattamento
     * @param args 
     */
    
    
     public static void main(String[] args) {
         
         int a=4;
         int b=4;
         int c=9;
         Integer i=new Integer(a);
         Integer j=new Integer(b);
         Integer k=new Integer(c);
     
         /*confronto tra dati*/
         if(a==b)
             System.out.println("Uguali");//esce uguali
         else
             System.out.println("Diversi");
         
         
         /*confronto tra oggetti*/
         if(i==j)
             System.out.println("Uguali");
         else
             System.out.println("Diversi");//esce diverrsi 
         
         
         
         /*confronto tra valore degli oggetti*/
         if(i.intValue()==j.intValue())
             System.out.println("Uguali");//esce uguali
         else
             System.out.println("Diversi");
         
         
     }
    
}
