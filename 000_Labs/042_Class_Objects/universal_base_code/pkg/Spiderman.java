/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	
	int age;
	String villian;
	String actor;
	
	public Spiderman() {
		actor = new String("Miles Morales");
		age = 13;
		villian = new String("King Pin");
	}
	
	public Spiderman(String actor)
	{
		this.actor = actor;
		villian = new String("None");
		age = 0;
	}
	
	public Spiderman(String actor, int age)
	{
		this.actor = actor;
		this.age = age;
		villian = new String("None");
	}
	
	public Spiderman(String actor, String villian)
	{
		this.actor = actor;
		this.villian = villian;
	}
	
	public void print()
	{
		System.out.println("----------------------------------------");
		System.out.println("The actor " + actor + " is " + age + " years old.");
		System.out.println("They play Spiderman who's villian is " + villian);
		System.out.println("----------------------------------------\n");
		
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setVillain(String villian)
	{
		this.villian = villian;
	}
}
