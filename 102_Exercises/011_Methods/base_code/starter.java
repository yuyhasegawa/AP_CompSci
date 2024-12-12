/*
 *	Author: Yuya Hasegawa
 *  Date: 10/14/2024
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
	
	public static boolean isLeapYear(int x)
	{
		return x % 4 == 0;
	}
	
	public static int getDigitSum(int x)
	{
		int counter = 5;
		int num = x;
		int a_num;
		int sum = 0;
		while(counter >= 0)
		{
			a_num = num % (int)Math.pow(10, counter);
			a_num = num - a_num;
			num = num - a_num;
			a_num = a_num/(int)Math.pow(10,counter);
			sum += a_num;
			counter--;
		}
		return sum;
	}
	
	public static void printIfConsecutive(int a, int b, int c)
	{
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a,b),c);
		int mid;
		
		if(max == a && min == b || min == a && max == b)
			mid = c;
		else if(max == a && min ==c || min == a && max == c)
			mid = b;
		else
			mid = a;
		
		if(min + 1 == mid && mid + 1 == max)
			System.out.println("These numbes are consecutive!");
		else
			System.out.println("These numbers are not consecutive");
	}
}
