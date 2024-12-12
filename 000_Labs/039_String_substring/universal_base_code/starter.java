/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/11/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.print("Please enter a word: ");
		input = sc.nextLine();
		
		System.out.println("\nLetter by Letter:");
		
		for(int i = 0; i < input.length(); i++)
		{
			System.out.println(i + ": " + input.substring(i, i+1));
		}
	}
}
