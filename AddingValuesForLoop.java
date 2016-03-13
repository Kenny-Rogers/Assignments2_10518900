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
public class AddingValuesForLoop {
    public static void main(String[] args){
     Scanner input=new Scanner(System.in);
        int user=0;
        int total=0;
        
       System.out.print("Number :");
       user=input.nextInt();
        
        for(int i=1; i<=user; i++){
            System.out.print(i+" ");
            total=user+ total;
        }
        System.out.println("\nThe sum is "+total);
    }
    
}
