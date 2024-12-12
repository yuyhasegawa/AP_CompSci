/*
	Author: Yuya Hasegawa
	Date: 10/28/2024
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman test = new Spiderman();
		test.setActor("Tobey Mcguire");
		test.setAge(49);
		test.setVillain("Green Goblin");
		
		Spiderman two = new Spiderman("Andrew Garfield");
		two.setAge(41);
		
		Spiderman three = new Spiderman("Spider ham");
		three.setVillain("Ductor Doom");
		
		System.out.println("The villian is " + three.getVillain());
	}
}
