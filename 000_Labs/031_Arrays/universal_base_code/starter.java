/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/3/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] num = new int[10];
		int counter = 0;
		int opcounter = 9;
		
		while(counter <= 9)
		{
			num[counter] = opcounter;
			counter++;
			opcounter--;
		}
		
		opcounter = 0;
		while(opcounter <= 9)
		{
			System.out.println(num[opcounter++]);

		}
	}
}
