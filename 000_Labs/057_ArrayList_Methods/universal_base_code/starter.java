/*
 *	Author:  Yuya Hasegawa
 *  Date:  10/1/2024
*/

import pkg.*;
import java.util.*;

class starter {
	
	public static void toStringArrayList(ArrayList<Integer> arr)
	{
		for(int i = 0; i < arr.size(); i++)
			System.out.print(arr.get(i) + " ");
		System.out.print("\n");
	}
	
	public static int getArrayListAvg(ArrayList<Integer> arr)
	{
		int avg = 0;
		for(int i = 0; i < arr.size(); i++)
			avg = avg + arr.get(i);
		return avg/arr.size();
	}
	
	public static int getArrayListMax(ArrayList<Integer> arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.size(); i++)
			if(arr.get(i) > max)
				max = arr.get(i);
		return max;
	}

	public static int getArrayListMin(ArrayList<Integer> arr)
	{
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.size(); i++)
			if(arr.get(i) < min)
				min = arr.get(i);
		return min;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr;
		int size;
		String ask = "yes";
		
		while(ask.toLowerCase().equals("yes") || ask.toLowerCase().equals("y"))
		{
			System.out.print("Please enter the ArrayList size: ");
			size = sc.nextInt();
			sc.nextLine();
			
			arr = new ArrayList<Integer>();
			
			for(int i = 0; i < size; i++)
			{
				System.out.println("run");
				arr.add(i, (int)(Math.random() * 100) + 1);
			}
			
			toStringArrayList(arr);
			System.out.println("Avg: " + getArrayListAvg(arr));
			System.out.println("Max: " + getArrayListMax(arr));
			System.out.println("Min: " + getArrayListMin(arr));
			System.out.println("\n\nDo you want to continue?(y or n) :");
			ask = sc.nextLine();
		}
		
		System.out.println("program ending...");
	}
}
