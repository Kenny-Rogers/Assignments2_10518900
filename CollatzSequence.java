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
public class CollatzSequence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int user=0;
        int count=1;
        System.out.print("Starting number: ");
        user=input.nextInt();
        
        while(user!=1){
            System.out.print(user+"\t");
            if(count==9){
                System.out.println();
                count=count-count;
            }
            if(user%2==0){
                user=user/2;
            }
            else{
                user=(user*3)+1;
            }
            count++;
        }
        
        System.out.println("1");
    }
    
}
