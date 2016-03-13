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
public class CountingMachine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int user;
        
        System.out.print("Count to: ");
        user=input.nextInt();
        
        for(int i=0; i<=user; i++){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
    
}
