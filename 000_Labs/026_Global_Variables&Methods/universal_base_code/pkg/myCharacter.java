/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/2/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int strength = 0;
	public int dexterity = 0;
	public int intellegence = 0;
	public int charsma = 0;
	
	public myCharacter()
	{
		role = new String("No Role");
	}
	
	public myCharacter(String a)
	{
		if(a.equals("Warrior"))
		{
			System.out.println("You are a Warrior, how brave!");
			role = new String(a);
		}
		
		else if(a.equals("Wizard"))
		{
			System.out.println("You are a Wizard, how magical!");
			role = new String(a);
		}
		
		else if(a.equals("Rogue"))
		{
			System.out.println("You are a Rogue, how cunning!");
			role = new String(a);
		}
		
		else
		{
			System.out.println("Your role have been resetted to No Role");
			role = new String("No Role");
		}
	}
	
	public void myToString()
	{
		System.out.println("Role: " + role);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intellegence: " + intellegence);
		System.out.println("Charsma: " + charsma);
		System.out.println("________________________________");
	}
}

