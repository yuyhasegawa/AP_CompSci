/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/9/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int counter = 0;
		int[] rand_num = new int[1000];
		
		while(counter <= 999)
		{
			rand_num[counter++] = rand.nextInt(1000);
		}
		counter = 0;
		
		while(counter <= 999)
		{
			System.out.println(rand_num[counter++]);
		}
	}
}
