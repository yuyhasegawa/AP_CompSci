/*
 *	Author: Yuya Hasegawa
 *  Date: 11/10
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr = new int[20];
		System.out.println("----------------------------------------\nThese  are the 20 elements");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random()*10)+1;
			System.out.print(arr[i] + " ");
		}	
		System.out.println("\n----------------------------------------");
		int find =  (int)(Math.random()*10)+1;
		int counter = 0;
		System.out.println("The random number to look for is " + find);
		for(int i = 0; i < arr.length; i++)
			if(arr[i] == find)
			{
				System.out.println("Duplicate found at index " + i);
				counter++;
			}
		System.out.println("The total number of duplicate for " + find + " is " + counter);
		System.out.println("----------------------------------------\nLooking for two in a row:");
		for(int i = 0 ; i < arr.length-1; i++)
			if(arr[i] == arr[i+1])
				System.out.println("Two in a row found at indexes " + i + " and " + (i+1));
	}
}
