/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10518900;

/**
 *
 * @author kenny
 */
public class XsAndYs {
    public static void main(String[] args) {
        System.out.println("X\n-------------");
        for(double i=-10.0; i<=10.0; i=i+0.5){
            System.out.println(i+"\t"+(Math.pow(i, 2)));
        }
    }
}
