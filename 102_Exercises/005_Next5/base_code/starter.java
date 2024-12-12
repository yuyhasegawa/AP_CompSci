/*
 *	Author: Yuya Hasegawa
 *  Date: 9/11/2024
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		System.out.print("Please enter a number: ");
		input = sc.nextInt();
		
		System.out.println("Here are the next 5 numbers!");
		System.out.printf("%d, %d, %d, %d, %d, %d\n", input, input + 1, input + 2, input + 3, input + 4, input + 5);
		
		System.out.println("Here are the next 5 multiples of " + input + "!");
		System.out.printf("%d, %d, %d, %d, %d, %d\n", input, input*2, input*3, input*4, input*5, input*6);
		
		System.out.println("Here is " + input + " divided by 100!");
		System.out.println(input/100.0);
		
		System.out.println("Here is " + input + " divided by 10!");
		System.out.println(input/10.0);
	}
}
