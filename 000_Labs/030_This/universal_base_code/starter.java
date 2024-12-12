/*
 *	Author:  Yuya Hasegawa;
 *  Date: 9/3/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	
	public static int randAge()
	{
		return (int)(Math.random() * 100);
	}
	public static void main(String args[]) {
	
		PooleDwarf a = new PooleDwarf(randName(), randAge());
		PooleDwarf b = new PooleDwarf(randName(), randAge());
		PooleDwarf c = new PooleDwarf(randName(), randAge());
		PooleDwarf d = new PooleDwarf(randName(), randAge());
		PooleDwarf e = new PooleDwarf(randName(), randAge());
		PooleDwarf f = new PooleDwarf(randName(), randAge());
		PooleDwarf g = new PooleDwarf(randName(), randAge());
		int counter = 0;
		
		if(a.isSameName(b.getName()))
		{

			counter = counter + 1;
		}
		
		if(a.isSameName(c.getName()))
		{
			counter = counter + 1;
		}
		
		if(a.isSameName(d.getName()))
		{
			counter = counter + 1;
		}
		
		if(a.isSameName(e.getName()))
		{
			counter = counter + 1;
		}
		
		if(a.isSameName(f.getName()))
		{
			counter = counter + 1;
		}
		
		if(a.isSameName(g.getName()))
		{
			counter = counter + 1;
		}
		
		System.out.println("The name was " + a.getName() + " and had " +  counter + " matches");
	}
}
