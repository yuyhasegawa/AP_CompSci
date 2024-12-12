/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/26/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void CalcAvgRow(int[][] a)
	{
		int avg;
		for(int i = 0; i < a.length; i++)
		{
			avg = 0;
			for(int j = 0; j < a[0].length; j++)
			{
				avg = avg + a[i][j];
			}
			
			System.out.println("Row: " + (i+1) + "  Avg: " + ((double)avg/a[0].length));
		}
		
	}
	
	public static double CalcAvg(int[][] a)
	{
		int avg = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				avg = avg + a[i][j];
			}
		}
		
		return (double)avg/(a.length * a[0].length);
	}
	
	public static void PrintAll(int[][] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		double avg;
		System.out.print("Please choose your x value for the 2D array: ");
		x = sc.nextInt();
		
		System.out.print("Please choose your y value for the 2D array: ");
		y = sc.nextInt();
		
		int[][] arr = new int[x][y];
		
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y; j++)
				arr[i][j] = (int)(Math.random() * 9) + 1;
		}
		
		CalcAvgRow(arr);
		avg = CalcAvg(arr);
		System.out.println("All average: " + avg);
		PrintAll(arr);
	}
}
