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
public class LetterAtATime {
    /*
    1)it is because the value of the message.length will be out of index
    2)"box" -> lenght=3  x-> position=2
    */
    public static void main(String [] args){
    Scanner kb = new Scanner(System.in);

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1;
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");

		for ( int i=0; i<message.length(); i++ )
		{
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		int a_count = 0;

		for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' )
			{
				a_count++;
			}
                        else if ( letter == 'e' || letter == 'E' )
			{
				a_count++;
			}
                        else if ( letter == 'i' || letter == 'I' )
			{
				a_count++;
			}
                        else if ( letter == 'o' || letter == 'o' )
			{
				a_count++;
			}
                        else if ( letter == 'u' || letter == 'U' )
			{
				a_count++;
			}
		}

		System.out.println("\nYour message contains " + a_count + " vowels. Isn't that interesting?");

	}
    
}
