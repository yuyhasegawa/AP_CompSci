/*
 *	Author:  Yuya Hasegawa
 *  Date: 9/24/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer[] performer = {new Performer(), new Musician(), new Apprentice(), new Actor()};
		
		performer[0].perform();
		performer[0].practice();
		
		performer[1].perform();
		performer[1].practice();
		
		((Apprentice)performer[2]).practiceAtUniversity();
		((Apprentice)performer[2]).playsInstrument();
		
		((Actor)performer[3]).monologue();
		((Actor)performer[3]).perform();
	}
}
