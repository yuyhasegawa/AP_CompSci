/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr = {3,64,5,85, 467, 7345, 100000, 1, 0, 35};
		mergeSort(arr, 0, arr.length-1);
		for(var el : arr)
		{
			System.out.println(el + " ");
		}
		
		System.out.println();
	}
	
	public static void mergeSort(int[] arr, int first, int last)
	{
		if(first == last)
			return;
		else if(first+1 == last)
		{
			if(arr[first] > arr[last])
			{
				int temp = arr[first];
				arr[first] = arr[last];
				arr[last] = temp;
			}
		}
		
		else
		{
			int mid = last/2;
			mergeSort(arr,first, mid);
			mergeSort(arr, mid+1, last);
			
		}
	}
}
