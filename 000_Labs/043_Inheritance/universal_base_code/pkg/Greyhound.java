/*
 *	Author:  Yuya Haseagawa
 *  Date: 9/17/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class Greyhound extends Dog{
	public String color;

	public Greyhound() {
		color = "grey";
	}

	public boolean isFast(){
		return true;
	}
}
