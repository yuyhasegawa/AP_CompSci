/*
 *	Author: Yuya Hasegawa
 *  Date: 9/28/2024
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int one, two;
		
		System.out.print("Please enter a integer: ");
		one = sc.nextInt();
		
		System.out.print("Please enter another integer: ");
		two = sc.nextInt();
		
		if(one % 2 == 0)
			System.out.println("\n\n\n" + one + " is even");
		
		else
			System.out.println("\n\n\n" + one + " is odd");
			
		if(one % 3 == 0)
			System.out.println(one + " is divisible by 3");
			
		if(one % 4 == 0)
			System.out.println(one + " is divisible by 4");
		
		if(one % 5 == 0)
			System.out.println(one + " is divisible by 5");
		
		if(one % 3 != 0 && one % 4 != 0 && one % 5 != 0)
			System.out.println(one + " is not divisible by 3 , 4, and 5");
			
			
			
			
			
			

		if(two % 2 == 0)
			System.out.println("\n\n\n" + two + " is even");
		
		else
			System.out.println("\n\n\n" + two + " is odd");
			
		if(two % 3 == 0)
			System.out.println(two + " is divisible by 3");
			
		if(two % 4 == 0)
			System.out.println(two + " is divisible by 4");
		
		if(two % 5 == 0)
			System.out.println(two + " is divisible by 5");
		
		if(two % 3 != 0 && two % 4 != 0 && two % 5 != 0)
			System.out.println(two + " is not divisible by 3 , 4, and 5");
	}
}
