/*
 *	Author:  Yuya Hasegawa
 *  Date: 8/29/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*1000) + 1;
		int geuss;
		
		System.out.print("Please geuss a number: ");
		geuss = sc.nextInt();
		
		if(geuss < random)
		{
			System.out.println("The number is greater than " + geuss);
		}
		
		else if(geuss > random)
		{
			System.out.println("The number is less than " + geuss);
		}
		
		else
		{
			System.out.println("You geussed the number right!");
		}
	}
}
