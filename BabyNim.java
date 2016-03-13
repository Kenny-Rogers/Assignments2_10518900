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
public class BabyNim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        a=b=c=3;
        int user;
        String userC;
        
        System.out.println("A: 3 \tB: 3\tC: 3");
        
        while((a>0)||(b>0)||(c>0)){
            System.out.print("Choose a pile: ");
            userC=input.next();
            System.out.print("How many to remove from pile " +userC+": ");
            user=input.nextInt();
            if(userC.equals("A")){
                a=a-user;
                System.out.println("A: "+a+" \tB: "+b+"\tC: "+c);
            }
            else if(userC.equals("B")){
                b=b-user;
                System.out.println("A: "+a+" \tB: "+b+"\tC: "+c);
            }
            else if(userC.equals("C")){
                c=c-user;
                System.out.println("A: "+a+" \tB: "+b+"\tC: "+c);
            }
        }
        System.out.println("All piles are empty. Good job!");
    }
    
}
