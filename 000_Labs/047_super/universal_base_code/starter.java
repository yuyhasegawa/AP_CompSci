/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/24/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Apprentice apprentice1 = new Apprentice();
		Apprentice apprentice2 = new Apprentice("USC", 10);
		Apprentice apprentice3 = new Apprentice("Alto sax", "UCB", 8);
		Apprentice apprentice4 = new Apprentice("John Smith", 19, "flute", "NYU", 9);
		
		apprentice1.playsInstrument();
		apprentice2.practice();
		apprentice3.perform();
		apprentice4.practiceAtUniversity();
	}
}
