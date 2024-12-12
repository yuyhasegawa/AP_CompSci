/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("You are a student getting ready for school.\n Before going to school you have 3 choices\n. 1. Pack you backpack, 2. Choose your outfit, 3. Eat a breakfast");
        
        System.out.print("Please enter your number for choice: ");
        int choice1 = sc.nextInt();
        
        if(choice1 == 1)
        {
            System.out.println("You pakced your backpack!");
            System.out.println("After you packed your backpack, what action would you take?");
            System.out.println("1. double check your backpack, 2.Go to school, 3.Make sure you did your homework");
            int choice2 = sc.nextInt();
            if(choice2 == 1)
            {
                System.out.println("You double checked your backpack and everything was in your backpack!");
            }
            
            else if(choice2 == 2)
            {
                System.out.println("You left your house to go to school!");
            }
            
            else if(choice2 == 3)
            {
                System.out.println("You maded sure you did your homework! And everything was done!");
            }
            
            else
            {
                System.out.println("Wrong choice, you died!");
            }
        }
        
        else if(choice1 == 2)
        {
            System.out.println("You choose your outfit for school!");
            System.out.println("What choice would you take next?");
            System.out.println("1. pack your backpack, 2.eat breakfast school, 3.Make sure you did your homework");
            int choice2 = sc.nextInt();
            if(choice2 == 1)
            {
                System.out.println("You packed your backpack");
            }
            
            else if(choice2 == 2)
            {
                System.out.println("You ate your breakfast");
            }
            
            else if(choice2 == 3)
            {
                System.out.println("You maded sure you did your homework! And everything was done!");
            }
            
            else
            {
                System.out.println("Wrong choice, you died!");
            }
        }
        
        else if(choice1 == 3)
        {
            System.out.println("You ate a breakfast!\nWhat would you nexg?");
            System.out.println("1. Make your lunch, 2.Brush your teeth, 3.Make sure you did your homework");
            int choice2 = sc.nextInt();
            if(choice2 == 1)
            {
                System.out.println("You went to the kichten to make your lunch");
            }
            
            else if(choice2 == 2)
            {
                System.out.println("You went to bathroom to brush your teeth");
            }
            
            else if(choice2 == 3)
            {
                System.out.println("You maded sure you did your homework! And everything was done!");
            }
            
            else
            {
                System.out.println("Wrong choice, you died!");
            }
        }
        
        else 
        {
            System.out.println("You didn't make the right choice!");
        }
	}
}
