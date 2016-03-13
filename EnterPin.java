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
public class EnterPin {
    /*
        1)while and if statements all have test conditions
        2)while loop performs the check more than one time
           if statements perform the check only once
        3)because entry has already being declared and placing an int before it will 
          cause it to be re-declared throughout the lifetime of the loop
        4)it causes the loop to execute indefinately because the initial "entry" makes
          the loop test condition true whenever it is  checked
    */
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
    
}
