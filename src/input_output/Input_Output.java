/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;
import java.util.Scanner;
/**
 *
 * @author alessandrobarazzuol
 */
public class Input_Output {
    
    /**
     * Classe Scanner per input
     * Sistem.out per output
     * @param args 
     */
    public static void main(String[] args) {
       
          Scanner in = new Scanner(System.in);
          
          
          String s=in.nextLine();
          
          System.out.println(s);
    } 
 
    
}
