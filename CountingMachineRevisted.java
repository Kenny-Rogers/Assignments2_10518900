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
public class CountingMachineRevisted {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int userFrom;
        int userTo;
        int userBy;
        
        System.out.print("Count from: ");
        userFrom=input.nextInt();
        System.out.print("Count to: ");
        userTo=input.nextInt();
        System.out.print("Count by: ");
        userBy=input.nextInt();
        
        for(int i=userFrom; i<=userTo; i=i+userBy){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
    
}
