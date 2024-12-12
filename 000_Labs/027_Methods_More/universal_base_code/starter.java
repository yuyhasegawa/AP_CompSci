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
		
		a.role = a.setRole("Warrior");
		a.strength = a.setStregnth(5);
		a.dexterity = a.setDexterity(5);
		a.intellegence = a.setIntelligence(5);
		a.charisma = a.setCharisma(5);
		
		a.myToString();
		
		a.setAll("Wizard",1 ,1 ,1 ,1 );
		a.myToString();
	}
}
