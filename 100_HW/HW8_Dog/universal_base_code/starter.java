/*
 *	Author: Yuya Hasegawa
 *  Date: 10/27/2024
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog one = new Dog("Sean");
		one.setAge(9);
		Dog two = new Dog("John", "Husky");
		int dogBark = 0;
		if(one.isSleeping())
			System.out.println(one.getName() + " is sleeping");
		else
		{
			one.bark();
			dogBark = 1;
		}
		
		if(two.isSleeping())
			if(dogBark == 1)
				two.bark();
		else
			if(dogBark == 1)
				two.bark();
	}
}
