/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/26/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int height, width;
		String symbol;
		
		System.out.print("Please enter the symbol you want to use: ");
		symbol = sc.nextLine();
		
		System.out.print("\nPlease enter the width of the box: ");
		width = sc.nextInt();
		
		System.out.print("\nPlease enter the hight of the box: ");
		height = sc.nextInt();
		
		System.out.println("\n\n");
		
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
				System.out.print(symbol);
			System.out.println("");
		}
	}
}
