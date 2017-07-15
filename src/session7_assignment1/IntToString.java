package session7_assignment1;

/**
 *  Package declaration is necessary
 */

import java.util.Scanner;

/**
 * @srinivas
 *This program converts the Integer to String 
 */
public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);            //Scanner to take input from user
		System.out.println("Please enter a integer valur to convert it to String");
		int value=scan.nextInt();
		
		String convert=new String();
		System.out.println(convert.valueOf(value));  // defined method of string class to implement the logic 
		scan.close();
	}

}
