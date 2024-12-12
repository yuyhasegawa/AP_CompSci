/*
 *	Author:  Yuya Hasegawa
 *  Date: 8/27/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 100) + 1;
        double c = Math.random() + 2.5;
        double d = (Math.random() * 575) + 14;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
	}
}
