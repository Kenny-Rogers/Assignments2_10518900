/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10518900;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class BabyBlackjack {
    public static void main(String[] args) {
        int compTotal, userTotal, userDraw1, userDraw2, compDraw1, compDraw2;
        compTotal=userTotal=userDraw1=userDraw2=compDraw1=compDraw2=0;
        Random r=new Random();
        Random j=new Random();
        
        compDraw1=1+r.nextInt(10);
        compDraw2=1+j.nextInt(10);
        compTotal=compDraw2+compDraw1;
        
        System.out.println("Baby Blackjack!");
        userDraw1=1+ r.nextInt(10);
        userDraw2=1+ j.nextInt(10);
        userTotal=userDraw1+userDraw2;
        
        System.out.println("\nYou drew "+userDraw1+" and "+userDraw2+".");
        System.out.println("Your total is "+userTotal);
        
        System.out.println("\nThe dealer has "+compDraw1+" and "+compDraw2+".");
        System.out.println("The dealer's total is "+compTotal);
        
        if(userTotal<compTotal){
            System.out.println("\nYOU LOSE!");
        }
        else{
            System.out.println("\nYOU WIN!");
        }
    }
    
}
