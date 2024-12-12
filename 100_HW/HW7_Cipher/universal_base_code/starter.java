/*
 *	Author:Yuya Hasegawa
 *  Date: 10/20/2024
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a message to encode: ");
		String message = sc.nextLine();
		System.out.println("-------------------------------------------------------\n\n\n\n\nencoded message is: " + Cipher.encode(message));
	}
}
