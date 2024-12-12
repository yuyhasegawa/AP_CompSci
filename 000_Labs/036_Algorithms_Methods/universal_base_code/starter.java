/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/11/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int arg[]){
		for(int i = 0; i < arg.length; i++)
		{
			System.out.println(arg[i]);
		}
	}
	
	public static int getArrayAverage(int arg[])
	{
		int avg = 0;
		for(int i = 0; i < arg.length; i++)
		{
			avg = avg + arg[i];
		}
		
		return (avg/arg.length);
	}
	
	public static int getArrayMax(int arg[])
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arg.length; i++)
		{
			if(max < arg[i])
			{
				max = arg[i];
			}
		}
		
		return max;
	}
	
	public static int getArrayMin(int arg[])
	{
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arg.length; i++)
		{
			if(min > arg[i])
			{
				min = arg[i];
			}
		}
		return min;
	}
	
	
	public static void main(String args[]) {
		Random rand = new Random();
		int num;
		
		int[] a = new int[100];
		int max, min, avg;
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = rand.nextInt(1, 101);
		}
		
		
		toStringArray(a);
		max = getArrayMax(a);
		min = getArrayMin(a);
		avg = getArrayAverage(a);
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Avg: " + avg);
	}
}
