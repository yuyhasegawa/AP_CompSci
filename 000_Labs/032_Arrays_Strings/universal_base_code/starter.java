/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/9/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		String[] song = new String[10];
		song[0] = "Buddy you're a boy make a big noise";
		song[1] = "Playin' in the street gonna be a big man some day";
		song[2] = "You got mud on yo' face";
		song[3] = "You big disgrace";
		song[4] = "Kickin' your can all over the place";
		song[5] = "Singin'";
		song[6] = "We will we will rock you";
		song[7] = "We will we will rock you";
		song[8] = "Buddy you're a young man hard man";
		song[9] = "Shoutin' in the street gonna take on the world some day";
		
		int num = 0;
		
		while(num <= 9)
		{
			System.out.println(song[num++]);
		}
	}
}
