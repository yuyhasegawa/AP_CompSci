/*
 *	Author:  Yuya Hasegawa
 *  Date: 10/1/2024
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;
		ArrayList<String> arr;
		
		System.out.print("How many cookies do you want to name? : ");
		num = sc.nextInt();
		sc.nextLine();
		
		arr = new ArrayList<String>(num);
		System.out.println("\n");
		for(int i = 0; i < num; i++)
		{
			System.out.print("What do you want to name cookie #" + (i + 1) + "?: ");
			arr.add(sc.nextLine());
		}
		
		System.out.println("\n\n\n_________________________________________________");
		for(int i = 0; i < num; i++)
		{
			System.out.println("Cookie #" + (i + 1) + " : " + arr.get(i));
		}
	}
}
