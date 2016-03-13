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
public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count=0;
        int [] ans=new int[10];
        
        System.out.println("Enter three integers:");
        System.out.print("Side "+(count+1)+": ");
        ans[count]=input.nextInt();
        count++;
            
        do{
            System.out.print("Side "+(count+1)+": ");
            ans[count]=input.nextInt(); 
            if(ans[count-1]> ans[count]){
                System.out.println(ans[count]+" is smaller than "+ans[count-1]);
                continue;
            }else{
                count++;
            }
        }while((ans[count-1]> ans[count])&&(count<3));
        check(ans);
     
    }
    public static void check(int arr[]){
        if ((Math.pow(arr[2],2))==(Math.pow(arr[0],2)+Math.pow(arr[1],2))){
            System.out.println("Your three sides are "+arr[0]+" "+arr[1]+" "+arr[2]);
            System.out.println("These sides *do* make a right trinagle.");
        }else{
            System.out.println("Your three sides are "+arr[0]+" "+arr[1]+" "+arr[2]);
            System.out.println("These sides do not make a right trinagle.");
        }
    }
}
