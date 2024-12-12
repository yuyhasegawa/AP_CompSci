/*
 *	Author:  Yuya Haseagawa
 *  Date: 9/13/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a senctence.");
		String sentence = sc.nextLine();
		int counter = 0;
		String reversed = "";
		for(int i = 0; i < sentence.length(); i++)
		{
			if(sentence.substring(i, i+1).equals(" "))
			{
				counter++;
			}
		}
		if(counter == 0)
		{
			System.out.println(sentence);
		}
		
		else
		{
			int[] spaces = new int[counter];
			counter = 0;
			for(int i = 0; i < sentence.length(); i++)
			{
				if(sentence.substring(i, i+1).equals(" "))
				{
					spaces[counter] = i;
					if(counter < spaces.length - 1)
					{
						counter++;
					}
				}
			}
			
			reversed += sentence.substring(spaces[counter] + 1);
			for(; counter > 0; counter--)
			{
				reversed += sentence.substring(spaces[counter-1], spaces[counter]);
			}
			reversed += " " + sentence.substring(0, spaces[0]);
			System.out.println(reversed);
		}
	}
}
