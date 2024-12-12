/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/24/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer[] performer = {new Performer(), new Musician(), new Apprentice(), new Actor()};
		
		for(int i = 0; i < 4; i++)
			System.out.println(performer[i]);
			
		
		for(int i = 1; i < 4; i++)
		{
			if(performer[0].equals(performer[i]))
				System.out.println("Performer1 and Performer" + (i + 1) + " has the same name");
			
			else
				System.out.println("Performer1 and Performer" + (i + 1) + " has the different name");
		}
	}
}
