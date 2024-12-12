/*
 *	Author:  Yuya Hasegawa
 *  Date: 10/3/2024
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr = new int[200];
		
		for(int i = 0 ; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 999) + 1;
		
		arr = bubbleSort(arr);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static int[] bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
			for(int j = 0; j < arr.length - 1 - i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		return arr;
	}
}
