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
public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("SQUARE ROOT!");
        System.out.print("Enter a number: ");
        num=input.nextInt();
        
        while(num<=0){
            System.out.print("You can't take the square root of negative "
                              + "numbers.\n"+"Try again:");
            num=input.nextInt();
        }
        
        System.out.println("The square of "+num+ " is " +Math.sqrt(num));
    }
    
}
