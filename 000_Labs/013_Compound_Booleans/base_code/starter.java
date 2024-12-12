/*
 *	Author:  Yuya Hasegawa
 *  Date: 8/29/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		int c = 3;
		
		if(a > b && a > c){
			System.out.println(a + " is the greatest number");
		}
		
		if(b > a && b > c){
			System.out.println(b + " is the greatest number");
		}
		
		if(c > a && c > b){
			System.out.println(c + " is the greatest number");
		}
	}
}
