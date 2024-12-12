/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/11/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String fullName;
		System.out.println("Please enter you fist and last name with a space in the middle.");
		fullName = sc.nextLine();
		int index = fullName.indexOf(' ');
		System.out.println("The last name is: " + fullName.substring(index + 1));
	}
}
