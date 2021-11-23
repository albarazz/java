/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maggiore;

import java.util.Scanner;

/**
 * maggiore tra 4 numeri
 * @author alessandrobarazzuol
 */

class max {
    
    
    
    private Scanner input =new Scanner(System.in);
    
    /*int a=input.nextInt();
    
    int b=input.nextInt();
    
    int c=input.nextInt();
    
    int d=input.nextInt();*/
    private int a,b,c,d;
    
    public max(int a, int b, int c, int d)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public int getMaggiore()
    {
        
    if(a>=b && a>=c && a>=d)
    return a;
    if(b>=a && b>=c && b>=d)
    return b;
    if(c>=b && c>=a && c>=d)
    return c;
    if(d>=a && d>=b && d>=c)
    return d;
    
    return -1;
    }
    
    
}
public class maggiore 
{
    
    public static void main(String[] arg)
    {
        max m=new max(10,10,10,10);
        
        System.out.println(m.getMaggiore());
    }
}