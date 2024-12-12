/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/2/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a)
	{
		System.out.print(a);
	}
	
	public static void toStringCombined(String a, String b)
	{
		System.out.print(a + " " + b);
	}
	
	public static void main(String args[]) {
		toString("Hello");
		toStringCombined("\nHello", "World\n");
	}
}
