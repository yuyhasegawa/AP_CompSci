/*
 *	Author:	Yuya Hasegawa
 *  Date: 9/9/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[]  rand_num = new int[1000];
		for(int i = 0; i <= 999; i++)
		{
			rand_num[i] = rand.nextInt(1000);
		}
		
		for(int i = 0; i <= 999; i++)
		{
			System.out.println(rand_num[i]);
		}
	}
}
