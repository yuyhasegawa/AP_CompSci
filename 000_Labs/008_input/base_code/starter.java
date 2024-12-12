/*
 *	Author:  Yuya Hasegawa
 *  Date: 8/27/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String firstName;
        int age, birthMonth, birthDate, birthYear;
        Double dollar;
        
        System.out.print("What is your first name?: ");
        firstName = sc.nextLine();

        System.out.print("What is your age?: ");
        age = sc.nextInt();

        System.out.print("When is your birth month?: ");
        birthMonth = sc.nextInt();

        System.out.print("When is your birth date?: ");
        birthDate = sc.nextInt();

        System.out.print("Wehn is your birth year?: ");
        birthYear = sc.nextInt();

        System.out.print("How much is a buck fifty?: ");
        dollar = sc.nextDouble();

        System.out.println("Hello " + firstName + "\nYour are born in " + birthMonth + " " + birthDate + " " + birthYear + " and " + age + " years old");
        System.out.println("And a buck fifty is $" + dollar + "0");
	}
}
