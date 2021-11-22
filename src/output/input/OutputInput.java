/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package output.input;
import java.util.Scanner;

/**
 *
 * @author alessandrobarazzuol
 */
public class OutputInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*classe per leggere input da tastiera*/
    Scanner in =new Scanner(System.in);
        
    
    String s=in.nextLine();
    
    /*visualizzare un dato a tastiera*/
    System.out.println(s);
    
        
    }
    
}
