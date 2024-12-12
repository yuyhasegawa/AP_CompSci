/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int n = 10;
		System.out.print(n + ": " );
		for(int i = 0; i < n; i++)
			System.out.print(fib(i) + " ");
		System.out.println();
	}
	
	public static int fib(int n)
	{
		if(n == 0)
			return 0;
		if(n == 1 || n == 2)
			return 1;
		else
			return (fib(n-1) + fib(n-2));
	}
}
