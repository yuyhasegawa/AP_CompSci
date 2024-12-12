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
	public int charisma = 0;
	
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
		System.out.println("Charisma: " + charisma);
		System.out.println("________________________________");
	}
	
	public String setRole(String a)
	{
		String xrole;
		if(a.equals("Warrior"))
		{
			System.out.println("You are a Warrior, how brave!");
			xrole = new String(a);
		}
		
		else if(a.equals("Wizard"))
		{
			System.out.println("You are a Wizard, how magical!");
			xrole = new String(a);
		}
		
		else if(a.equals("Rogue"))
		{
			System.out.println("You are a Rogue, how cunning!");
			xrole = new String(a);
		}
		
		else
		{
			System.out.println("Your role have been resetted to No Role");
			xrole = new String("No Role");
		}
		
		return xrole;
	}
	
	public int setStregnth(int a)
	{
		if(a < 0)
		{
			return 0;
		}
		
		else
		{
			return a;
		}
	}

	public int setDexterity(int a)
	{
		if(a < 0)
		{
			return 0;
		}
		
		else
		{
			return a;
		}
	}

	public int setIntelligence(int a)
	{
		if(a < 0)
		{
			return 0;
		}
		
		else
		{
			return a;
		}
	}

	public int setCharisma(int a)
	{
		if(a < 0)
		{
			return 0;
		}
		
		else
		{
			return a;
		}
	}
	
	public boolean setAll(String a, int b, int c, int d, int e)
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
		
		if(b < 0)
		{
			strength = 0;
		}
		
		else
		{
			strength = b;
		}

		if(c < 0)
		{
			dexterity = 0;
		}
		
		else
		{
			dexterity = c;
		}
		
		if(d < 0)
		{
			intellegence = 0;
		}
		
		else
		{
			intellegence = d;
		}
		
		if(e < 0)
		{
			charisma = 0;
		}
		
		else
		{
			charisma = e;
		}
		
		return true;
	}
}
