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
public class KeepGuessing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random t=new Random();
        int guess=1+ t.nextInt(10);
        int ans=0;
        
        System.out.println("I have chosen a number between 1 and 10. "
                            + "Try to guess it.");
        System.out.print("Your guess: ");
        ans=input.nextInt();
        
        while(guess!=ans){
            System.out.println("That's incorrect. Guess Again.");
            System.out.print("Your guess: ");
            ans=input.nextInt();
        }
        System.out.println("That's right! You're a good guesser.");
    }
    
}
