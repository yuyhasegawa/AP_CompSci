/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/26/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[][] arr = 
		{
			{1, 2, 3, 4, 5},
			{65, 678, 12, 30, 30},
			{1020, 30434, 42304, 340, 3405},
			{123, 234, 345, 456, 567}
		};
		
		int avg = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
				avg = avg + arr[i][j];
		}
		
		avg = avg /(arr.length * arr[0].length);
		
		System.out.println(avg);
	}
}
