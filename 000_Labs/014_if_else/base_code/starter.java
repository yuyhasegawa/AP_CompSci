/*
 *	Author:  Yuya Hasegawa
 *  Date: 8/29/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int random_number = (int)(Math.random() * 999 ) + 1;
		int geuss;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please geuss a random number: ");
		geuss = sc.nextInt();
		
		if(geuss == random_number)
		{
			System.out.println("You geussed correct!");
		}
		
		else
		{
			System.out.println("Sorry the correct number is " + random_number);
		}
	}
}
