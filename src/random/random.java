/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.stream.DoubleStream;

/**
 *
 * @author alessandrobarazzuol
 */
public class random {
      public static void main(String[] args) {
          Random r=new Random();
          /*stessi valori di seme 2*/
          r.setSeed(2);
          /*st è uno stream di valori 5 double da 10 a 11 escluso*/
          DoubleStream st=r.doubles(5, 10, 11);
          
          /*si usa per stampare---> st.forEach(System.out::println); 
          
          
          oppure 
          
          
          ---->PrimitiveIterator.OfDouble array=st.iterator();
         
             for(int i=0;i<5;i++)
             System.out.println(array.next());*/
         
         
      }
}
