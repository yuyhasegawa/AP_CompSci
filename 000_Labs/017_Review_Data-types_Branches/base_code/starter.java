/*
 *	Author:  Yuya Hasegawa
 *  Date: 8/29/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String characterName, characterTitle, characterRole, role;
		int totalPoints = 20, points, strength, dexterity, intelligence, charisma;
		
		System.out.print("Please enter your character name: ");
		characterName = sc.nextLine();
		
		System.out.print("\nPlease enter your title, ex Dragon Slayer: ");
		characterTitle = sc.nextLine();
		
		System.out.print("\nPlease enter your role (choice is are Wizard, Warrior, Rogue): ");
		role = sc.nextLine();
		role = role.toLowerCase();
		if(role.equals("wizard"))
		{
			characterRole = role;
			System.out.println("\n\nYour role will be Wizard!\n\n");
		}
		
		else if(role.equals("warrior"))
		{
			characterRole = role;
			System.out.println("Your role will be Warrior!");
		}
		
		else if(role.equals("rogue"))
		{
			characterRole = role;
			System.out.println("Your role will be Rogue!");
		}
		
		else
		{
			System.out.println(role + " is not an choosable role, so your role will be unset");
			characterRole = "unset";
		}
		
		
		System.out.println("Now you will set your points on strength, dexterity, intelligence, charisma.\nYou will have 20 points to use, and you can't set your points more than 10 on single skill");
		
		System.out.print("\n\nPlease enter your points for strength: ");
		points = sc.nextInt();
		
		if(points > 10 && points <= totalPoints)
		{
			strength = 0;
			System.out.println(totalPoints + " points left");
		}
		
		else
		{
			strength = points;
			totalPoints = totalPoints - points;
			System.out.println(totalPoints + " points left");
		}
		

		System.out.print("\n\nPlease enter your points for dexterity: ");
		points = sc.nextInt();
		
		if(points > 10 && points <= totalPoints)
		{
			dexterity = 0;
			System.out.println(totalPoints + " points left");
		}
		
		else
		{
			dexterity = points;
			totalPoints = totalPoints - points;
			System.out.println(totalPoints + " points left");
		}

		System.out.print("\n\nPlease enter your points for intelligence: ");
		points = sc.nextInt();
		
		if(points > 10 && points <= totalPoints)
		{
			intelligence = 0;
			System.out.println(totalPoints + " points left");
		}
		
		else
		{
			intelligence = points;
			totalPoints = totalPoints - points;
			System.out.println(totalPoints + " points left");
		}

		System.out.print("\n\nPlease enter your points for charisma: ");
		points = sc.nextInt();
		
		if(points > 10 && points <= totalPoints)
		{
			charisma = 0;
			System.out.println(totalPoints + " points left");
		}
		
		else
		{
			charisma = points;
			totalPoints = totalPoints - points;
			System.out.println(totalPoints + " points left");
		}
		
		System.out.println("\n\n\nStatus:");
		System.out.println("Name: " + characterName);
		System.out.println("Title: " + characterTitle);
		System.out.println("Role: " + role);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Charisma: " + charisma);
		System.out.println("\n\n\nGood luck on your quest!");
	}
}
