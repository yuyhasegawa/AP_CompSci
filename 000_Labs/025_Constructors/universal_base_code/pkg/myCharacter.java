/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/2/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int strength = 0;
	int dexterity = 0;
	int intellegence = 0;
	int charsma = 0;
	
	public myCharacter()
	{
		role = new String("No Role");
	}
	
	public myCharacter(String a)
	{
		if(a.toLowerCase().equals("warrior"))
		{
			System.out.println("You are a Warrior, how brave!");
			role = new String(a);
		}
		
		else if(a.toLowerCase().equals("wizard"))
		{
			System.out.println("You are a Wizard, how magical!");
			role = new String(a);
		}
		
		else if(a.toLowerCase().equals("rogue"))
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
	
	public String getRole()
	{
		return role;
	}
}

