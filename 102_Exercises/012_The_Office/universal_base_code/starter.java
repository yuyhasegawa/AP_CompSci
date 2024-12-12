/*
 *	Author: Yuya Hasegawa
 *  Date: 10/22/2024
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee dwight = new Employee(1987, "Dewight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee john = new Employee(1234, "John", "White", 1.5);
		dwight.raiseSalary(10);
		jim.raiseSalary(20);
		pam.raiseSalary(150);
		john.raiseSalary(1);
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("Employee: " + dwight.getFirstName() + " " + dwight.getLastName());
		System.out.println("Salary: " + dwight.getSalary());
		System.out.println("Annual Salary: " + dwight.getAnnualSalary());
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("Employee: " + jim.getFirstName() + " " + jim.getLastName());
		System.out.println("Salary: " + jim.getSalary());
		System.out.println("Annual Salary: " + jim.getAnnualSalary());
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("Employee: " + pam.getFirstName() + " " + pam.getLastName());
		System.out.println("Salary: " + pam.getSalary());
		System.out.println("Annual Salary: " + pam.getAnnualSalary());
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("Employee: " + john.getFirstName() + " " + john.getLastName());
		System.out.println("Salary: " + john.getSalary());
		System.out.println("Annual Salary: " + john.getAnnualSalary());
		System.out.println("---------------------------------------------------------");
		System.out.println();
	}
}
