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
public class Nim {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        a=b=c=3;
        int user;
        String userC;
        String play1;
        String play2;
        String dispName;
        int num=1;
        
        System.out.print("Player 1, Enter your name: ");
        play1=input.nextLine();
        System.out.print("Player 2, Enter your name: ");
        play2=input.nextLine();
        
        System.out.println("A: 3 \tB: 3\tC: 3");
        
        do{
            if(num%2!=0){
                dispName=play1;
            }else{
                dispName=play2;
            }
            System.out.print("\n"+dispName +", Choose a pile: ");
            userC=input.next();
            System.out.print( "How many to remove from pile " +userC+": ");
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
            num++;
        }while((a>0)||(b>0)||(c>0));
        
        if(num%2!=0){
                dispName=play1;
            }else{
                dispName=play1;
            }
        System.out.println("\n"+dispName+", there are no counters left, so you WIN!");
    }
    
}
