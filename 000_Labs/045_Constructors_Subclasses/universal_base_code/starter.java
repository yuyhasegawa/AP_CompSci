/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/19/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer performer1 = new Performer();
		Performer performer2 = new Performer("Sean", 37);
		Musician musician1 = new Musician();
		Musician musician2 = new Musician("Alto sax");
		
		System.out.println("Performer1's name is " + performer1.getName());
		performer1.practice();
		
		System.out.println("Performer2's name is " + performer2.getName());
		performer1.perform();
		
		System.out.println("Musician1's name is " + musician1.getName());
		musician1.perform();
		musician1.playsInstrument();
		
		musician2.practice();
		System.out.println("Musicain2's insturment is " + musician2.getInstrument());
		
		System.out.print("-------------------New Musicians------------------- ");
		
		Musician musician3 = new Musician("Arnold Schwarzenegger", "Dombbell");
		System.out.println("Musician3's name is " + musician3.getName());
		musician3.practice();
		System.out.println("Musicain3's insturment is " + musician3.getInstrument());
		
		Musician musician4 = new Musician("Sean Yusin", 36, "piano");
		System.out.println("Musician4's name is " + musician4.getName());
		musician4.perform();
		musician4.playsInstrument();
	}
}
