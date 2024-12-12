/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/2/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter a = new myCharacter();
		
		System.out.println("Role: " + a.role);
		System.out.println("Strength: " + a.strength);
		System.out.println("Dexterity: " + a.dexterity);
		System.out.println("Intellegence: " + a.intellegence);
		System.out.println("Charsma: " + a.charsma);
	}
}
