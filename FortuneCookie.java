/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10518900;

import java.util.Random;

/**
 *
 * @author kenny
 */
public class FortuneCookie {
    public static Random r=new Random();
    public static void main(String[] args) {
        int fort=1 + r.nextInt(6);
        String display="";
        switch(fort){
                case 1:
                    display="You will buy a car this year.";
                    break;
                case 2:
                    display="You will travel abroad soon.";
                    break;
                case 3:
                    display="You will find a loved one.";
                    break;
                case 4:
                    display="You be sort for the world and over.";
                    break;
                case 5:    
                    display="You will gain more income.";
                    break;
                case 6:
                    display="You will be elevated in your company";
                    break;
            }    
        System.out.println(display);
        generator();
    }
    
    public static void generator(){
        int lotto=7+ r.nextInt(40);
        System.out.println( lotto + " - "+ (lotto-1)+
                           " - " +(lotto+8)+ " - "+
                           (lotto+10) +" - "+ (lotto -4)
                           +" - "+(lotto+3));
    }
    
}
