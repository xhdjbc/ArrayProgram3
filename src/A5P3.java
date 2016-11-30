/**
 *
 * Name: Zichao Liu
 * Teacher: Mr.Hardman
 * Assignment 5, Program 3
 * Date Last Modified: 11/30/2016
 *
 */

import java.util.Scanner;
/**
 * 
 */

/**
 * @author z.liu
 *
 */
public class A5P3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		   
		int value;
		int maximum = 0;
		   
		for( int i = 0; i < 5; i++ ){

		   System.out.print( "Enter a number as an integer: " );   

		   value = userInput.nextInt( );

		   if( value > maximum ){

			   maximum = value;
		    	  
		   }

		}

		System.out.println( "The maximum number is " + maximum );
		      
		userInput.close();

	}

}
