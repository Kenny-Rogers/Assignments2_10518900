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
public class CountingFor {
    /*
    1)it controls the counter in the loop. Removing it makes the loop run undefinitely
    2)it declares and initialise a counter
    */
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n = 2 ; n <= 10 ; n = n+2 )
        {
            System.out.println( n + ". " + message );
        }

    }
    
}
