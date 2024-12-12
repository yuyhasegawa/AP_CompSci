/*
 *	Author: Yuya Hasegawa
 *  Date: 11/5/2024
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int[] arr = new int[1001];
		 int counter = 0;
		 while(counter < 1001)
			arr[counter++] = (counter) * 3;
		
		int[] arr2 = new int[1001];
		int i = 0;
		counter--;
		while(counter >= 0)
			arr2[i++] = counter--;
			
		i = 0;
		while(i < 1001)
			System.out.println(i+": " + arr1[i++]);
			
		i = 0;
		while(i < 1001)
			System.out.println(i+": " + arr2[i++]);
	}
}