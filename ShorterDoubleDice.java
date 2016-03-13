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
public class ShorterDoubleDice {
    /*
        a do-while loop is a special kind of while loop that tests the given 
        condition only after it executes its block of code at least once 
    */
     public static void main(String[] args) {
         Random r=new Random();
        Random j=new Random();
        int dice1= 1 + r.nextInt(6);
        int dice2=1 + j.nextInt(6);
        
        do {
        dice1= 1 + r.nextInt(6);
        dice2=1 + j.nextInt(6);
        
        System.out.println( "HERE COMES THE DICE!");
        System.out.println( "\nRoll #1: "+dice1);
        System.out.println( "Roll #2: "+dice2);
        System.out.println( "The total is "+(dice1+dice2)+ "!");
        }while(dice1!=dice2);
    }
}
