/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/2/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		String statement = new String("");
		int i;
		if(shrek.isUgly()){
			statement = new String(shrek.getName() + " IS UGLY!");
		}
		System.out.println(statement);
		donkey.interact(shrek);
		for(i = 0; i < 5; i++){
			shrek.interact(donkey);
		}
		System.out.println("That printed out " + i + " times");

	}
}
