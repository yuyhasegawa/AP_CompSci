/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/2/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int geuss, random = (int)(Math.random() * 1000) + 1;
		
		while(true)
		{
			System.out.print("Please geuss the random number 1 ~ 1000: ");
			geuss = sc.nextInt();
			
			if(geuss < random)
			{
				System.out.println("You're a little too low!\n");
			}
			
			else if(geuss > random)
			{
				System.out.println("You're a little too high!\n");
			}
			
			else
			{
				System.out.println("You geussed it right!!!");
				break;
			}
		}
	}
}
