/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/11/2024
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[] warrior = new Warrior[100];
		Wizard[] wizard = new Wizard[100];
		
		for(int i = 0; i < 100; i++)
		{
			warrior[i] = new Warrior();
			wizard[i] = new Wizard();
		}
		
		int warrior_counter = 0;
		int wizard_counter = 0;
		
		while(!(warrior[99].isDead()) && !(wizard[99].isDead()))
		{
			wizard[wizard_counter].attack(warrior[warrior_counter]);
			if(warrior[warrior_counter].isDead() && warrior_counter < 99)
			{
				warrior_counter++;
			}
			
			warrior[warrior_counter].attack(wizard[wizard_counter]);
			if(wizard[wizard_counter].isDead() && wizard_counter < 99)
			{
				wizard_counter++;
			}
		}
		
		if(warrior_counter == 99)
		{
			System.out.println("Wizard have won with " + (100 - wizard_counter) + " figure left!");
		}
		
		else
		{
			System.out.println("Warrior have won with " + (100 - warrior_counter) + " figure left!");
		}
	}
}
