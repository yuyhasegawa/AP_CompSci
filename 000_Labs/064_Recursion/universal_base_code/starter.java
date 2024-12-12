/*
 *	Author:  Yuya Hasegawa
 *  Date:  11/7/2024
*/

//import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int n = 5;
		System.out.println(n + ": " + factorial(n));
	}
	
	public static int factorial(int n)
	{
		if(n <= 1)
			return 1;
		return n*factorial(n-1);
	}
}
