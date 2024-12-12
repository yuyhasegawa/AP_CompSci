/*
 *	Author: Yuya Hasegawa
 *  Date: 10/13/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the range to print out the prime number: ");
		int prime = sc.nextInt();
		printPrime(prime);
	}
	
	public static boolean checkPrime(int x)
	{
		int a = 2;
		while(a <= x/2)
		{
			if(x % a == 0)
				return false;
			a++;
		}
		return true;
	}
	
	public static void printPrime(int x)
	{
		int a = 2;
		while(a <= x)
		{
			if(checkPrime(a))
				System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
	}
}
