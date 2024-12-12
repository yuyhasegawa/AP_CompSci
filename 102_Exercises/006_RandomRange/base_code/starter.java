/*
 *	Author: Yuya Hasegawa
 *  Date: 9/16/2024
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x, y, rand;
		System.out.print("Please enter a number: ");
		x = sc.nextInt();
		System.out.print("Please enter another number (bigger than first one): ");
		y = sc.nextInt();
		
		if(x >= y)
		{
			System.out.println("error: x was less than or equal to y");
			System.out.println("closing program");
		}
		
		else
		{
			System.out.println("Your range is " + x + " to " + y);
			System.out.println("Here are the 5 numbers produced by this range: ");
			for(int i = 0; i < 100; i++)
			{
				System.out.print((int)(Math.random() * (y -x) + x) + " ");
			}
			System.out.println("");
		}
	}
}
