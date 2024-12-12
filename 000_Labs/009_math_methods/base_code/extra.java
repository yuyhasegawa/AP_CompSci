/*
 *	Author:  Yuya Hasegawa
 *  Date: 8/27/2024
*/

import java.util.Scanner;

class extra {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.print("Please enter a double: ");
        x = sc.nextDouble();
        System.out.print("Please enter another double: ");
        y = sc.nextDouble();
        
        System.out.println("\nMaximum number between a and b is " + Math.max(x, y));
        System.out.println("square root of y is " + Math.sqrt(y));
        System.out.println("Power of x and y is " + Math.pow(x, y));
	}
}
