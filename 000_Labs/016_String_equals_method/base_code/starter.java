/*
 *	Author:  Yuya Hasegawa
 *  Date: 8/29/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String role;
		System.out.println("What role do you want to be? You have Wizard, Warrior, or a Rogue!");
		
		role = new String(sc.nextLine());
		
		if(role.equals("Wizard"))
		{
			System.out.println("You are a Wizard!");
		}
		
		else if(role.equals("Warrior"))
		{
			System.out.println("You are a Warrior");
		}
		
		else if(role.equals("Rogue"))
		{
			System.out.println("You are a Rogue");
		}
		
		else
		{
			System.out.println("Sorry " + role + " is not included");
		}
	}
}
