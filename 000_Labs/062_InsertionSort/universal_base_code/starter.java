/*
 *	Author:  Yuya Hasegawa
 *  Date: 10/10/2024
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr = new int[200];
		for(int i = 0 ; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 999) + 1;
		
		arr = InsertionSort(arr);
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static int[] InsertionSort(int[] a)
	{
		int out, in, key;
		
		for(out = 1; out < a.length; out++)
		{
			key = a[out];
			in = out - 1;
	
			while(in >= 0 && a[in] > key)
			{
				a[in + 1] = a[in];
				in--;
			}
			a[in + 1] = key;
		}
		
		return a;
	}
}
