/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/9/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int rand_num = (int)(Math.random()*(201-51)) + 51;
		int[] num = new int[rand_num];
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double avg = 0;
		
		for(int i = 0; i < num.length; i++)
			num[i] = (int)(Math.random()*100) + 1;
		
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] < min)
				min = num[i];
			
			if(num[i] > max)
				max = num[i];
			
			avg = avg + num[i];
		}
		
		avg = avg/num.length;
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Average: " + avg);
		System.out.println("Elements: " + num.length);
	}
}
