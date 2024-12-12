/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/17/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class Corgi extends Dog{
	public String color;

	public Corgi() {
		color = "golden";
		name = "hello world";
	}

	public boolean hasSmallLegs(){
		return true;
	}

}
