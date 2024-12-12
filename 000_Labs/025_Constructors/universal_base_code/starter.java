/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/2/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String role;
		
		System.out.print("What role do you want to be?: ");
		role = new String(sc.nextLine());
		myCharacter a = new myCharacter();
		myCharacter b = new myCharacter(role);
		System.out.println("Constructor a, role: " + a.getRole());
		System.out.println("Constructor b, role: " + b.getRole());
	}
}
