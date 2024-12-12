/*
 *	Author:  Yuya Hasegawa
 *  Date: 10/8/2024
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr = new int[200];
		for(int i = 0 ; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 999) + 1;
		
		arr = SelectionSort(arr);
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
	}
	
	public static int[] SelectionSort(int[] a)
	{
		int out, in, mid;
		for(out = 0; out < a.length; out++)
		{
			mid = out;
			for(in = out + 1; in < a.length; in++)
				if(a[mid] > a[in])
					mid = in;
				
				int temp = a[mid];
				a[mid] = a[out];
				a[out] = temp;
		}
		
		return a;
	}
	
}
