/*
 *	Author: Yuya Hasegawa
 *  Date: 9/22/2024
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your date (0~6): ");
		int date = sc.nextInt();
		
		if(date == 0 || date == 6)
		{
			System.out.println("It's the weekend! It's 10 am!");
		}
		
		else if(date > 0 && date < 6)
		{
			System.out.println("It's the weekday! Wake up! It's 7 am!");
		}
		
		else
		{
			System.out.println("error: unexpected input");
		}
	}
}
