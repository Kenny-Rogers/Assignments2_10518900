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
public class OneShotHilo {
    public static void main(String[] args) {
        Random r=new Random();
        int num=1+r.nextInt(100);
        Scanner input=new Scanner(System.in);
        
        System.out.println("I'm thinking of a number between 1-100. "
                + "Try to guess it");
        int ans=input.nextInt();
        if(ans< num)
            System.out.println("Sorry you are too low. I was thinking of "+ num);
        else if(ans> num)
            System.out.println("Sorry you are too high. I was thinking of "+ num);
        else if(ans==num)
            System.out.println("You guessed it!. What are the odds?!?");
    }
    
}
