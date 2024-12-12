/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Hello " + name + "!");
        
        System.out.print("Please enter a number: ");
        int bob = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Please enter a number: ");
        int somethingelse = sc.nextInt();
        
        System.out.println("The sum of " + bob + " and " + somethingelse + " is " + (bob + somethingelse));
        sc.nextLine();        
        System.out.print("Please enter your favorite food: ");

        String food = sc.nextLine();
	}
}