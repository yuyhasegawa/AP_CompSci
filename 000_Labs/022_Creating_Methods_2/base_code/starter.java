/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/2/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int y)
	{
		int ans = 1, counter = 0;
		
		while(true)
		{
			ans = ans * x;
			counter++;
			if(counter == y)
			{
				return ans;
			}
		}
	}
	
	public static void main(String args[]) {
		System.out.println(pow(6,5));
	}
}
