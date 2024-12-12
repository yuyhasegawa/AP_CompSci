/*
 *	Author:  Yuya Hasegawa
 *  Date: 8/27/2024
*/

import java.util.Scanner;

class starter 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.print("Please enter a number: ");
		a = sc.nextInt();
		
		System.out.print("Please enter second number: ");
		b = sc.nextInt();
		
		if(a != b)
		{
			System.out.println(a + " is not equaled to " + b);
		}
		
		if(a == b)
		{
			System.out.println(a + " is equal to " + b);
		}
	}
}
