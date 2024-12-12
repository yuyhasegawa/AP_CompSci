/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/2/2024
*/

import java.util.Scanner;
import java.util.Random;
class Character
{
	String role = new String("Wizard");
	int strength = 5;
	int dexterity = 5;
	int intellegence = 5;
	int charsma = 5;
}

class starter {
	public static void main(String args[]) {
		Character a = new Character();
		
		System.out.println("Role: " + a.role);
		System.out.println("Strength: " + a.strength);
		System.out.println("Dexterity: " + a.dexterity);
		System.out.println("Intellegence: " + a.intellegence);
		System.out.println("Charsma: " + a.charsma);
	}
}
