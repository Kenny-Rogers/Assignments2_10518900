/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10518900;

import java.util.Scanner;

/**
 *
 * @author kenny
 */
public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int user=0;
        int total=0;
        
        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number :");
        user=input.nextInt();
        total=user+ total;
        System.out.println("The total so far is "+total);
        
        while(user!=0){
            System.out.print("Number :");
            user=input.nextInt();
            total=user+ total;
            System.out.println("The total so far is "+total);
        }
        System.out.println("\nThe total is "+total);
    }
    
}
