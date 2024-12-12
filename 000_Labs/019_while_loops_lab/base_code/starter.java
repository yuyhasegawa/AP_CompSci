/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/2/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int time, counter = 0;
		String name;
		
		System.out.print("Please enter your name: ");
		name = new String(sc.nextLine());
		
		System.out.print("Please ente the number of time you want to repeat your name: ");
		time = sc.nextInt();
		
		while(true)
		{
			System.out.println(name);
			if(counter == (time - 1))
			{
				break;
			}
			
			counter++;
		}
	}
}
