
/*
 *	Author: Yuya Hasegawa
 *  Date: 10/6/2024
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
    static String[] card = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    static int[] value = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ply = 0;
		System.out.println("What do you want to play?");
		System.out.println("1. Slots\n2.Blackjack");
		System.out.print("Enter the number that you want to play or to quiet enter any other number: ");
		ply = sc.nextInt();
		sc.nextLine();
		
		if(ply == 1)
		{
			int num1, num2, num3;
			int money = 100;
			
			System.out.println("Slot rules:");
			System.out.println("1. You will start with $100");
			System.out.println("2. Please input a wager less than your total money");
			System.out.println("3. The slot will roll a number from 1 to 10");
			System.out.println("   a. If two numbers are the same, your money will double");
			System.out.println("   b. If three numbers are the same, your money will triple");
			System.out.println("   c. If no numbers match, you will lose your moeny");
			
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
			String ans = sc.nextLine();
			while(money > 0)
			{
				num1 = (int)(Math.random() * 10) + 1;
				num2 = (int)(Math.random() * 10) + 1;
				num3 = (int)(Math.random() * 10) + 1;
				int bet = 0;
				
				if(ans.toLowerCase().equals("yes") || ans.toLowerCase().equals("y"))
				{
					System.out.print("How much would you like to bet? : ");
					bet = sc.nextInt();
					sc.nextLine();
					
					while(bet <= 0 || bet > money)
					{
						if(bet <= 0)
							System.out.print("No negatives or zeros! Please enter a bigger number: ");
						
						else if(bet > money)
							System.out.print("You can't bet bigger than your money! Pleae enter a smaller number: ");
						
						bet = sc.nextInt();
						sc.nextLine();
					}
					
					money -= bet;
					
					System.out.println("\nGreat! You have bet $" + bet + ". Let's play!\n\n Your rolls are: ");
					System.out.println("______________________");
					System.out.printf("| %d | %d | %d|\n", num1, num2, num3);
					System.out.println("______________________");
					
					if(num1 == num2 && num2 == num3)
					{
						System.out.println("You WON! Your bet has tripled!!!");
						bet = bet * 3;
						money += bet;
						System.out.println("You now have $" + money);
					}
					
					else if(num1 == num2 || num2 == num3 || num1 == num3)
					{
						System.out.println("You won! Your bet has doubled!");
						bet = bet * 2;
						money += bet;
						System.out.println("You now have $" + money);	
					}
					
					else
					{
						System.out.println("You didn't win, better luck next time!");
						System.out.println("You now have $" + money);
						if(money == 0)
							break;
					}
					
					System.out.println();
					System.out.println("------------------------------------------");
					System.out.println();
					System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
					ans = sc.nextLine();
				}
				else if(ans.toLowerCase().equals("no") || ans.toLowerCase().equals("n"))
				{
					System.out.println("Sad to see you go! You still have $" + money + " so please come back any time! Thanks!!!");
					break;
				}
				
				else
				{
					System.out.print("That wasn't a rigth anwswer, Try again: ");
					ans = sc.nextLine();
				}
	 		}
		}
		
		else if(ply == 2)
		{
			int money = 100;
	        int bet;
	        int[] player = new int[5];
	        int[] dealer = new int[5];
	        int hit_p, hit_d;
	        String ask = new String("");
	        String play;
	        System.out.println("Blackjack rules: ");
	        System.out.println("1. You and the dealer will be given to cards");
	        System.out.println("2. You will be asked, hit or stay.");
	        System.out.println("  a. If you hit, you will be given one more card, you can hit until you have 5 cards");
	        System.out.println("  b. If you stay, the dealer will stop giving you card");
	        System.out.println("3. Then the dealer will hit until he reaches more than 17");
	        System.out.println("4. To win");
	        System.out.println(" a. You must reach 21, this will triple your bet");
	        System.out.println(" b. You must hit unitl 5 card without busting, this will double your bet");
	        System.out.println(" c. Your total must be greater than or equal to dealers cards, this will double your bet");
	        System.out.println("5. Thats it!");
	    
	        while(money > 0)
	        {
	            System.out.print("Do you want to play blackjack? (Yes/yes/Y/y): ");
	            play = sc.nextLine();
	            if(play.toLowerCase().equals("yes") || play.toLowerCase().equals("y"))
	            {
	                System.out.print("How much would you like to bet? : ");
					bet = sc.nextInt();
					sc.nextLine();
					
					while(bet <= 0 || bet > money)
					{
						if(bet <= 0)
							System.out.print("No negatives or zeros! Please enter a bigger number: ");
						
						else if(bet > money)
							System.out.print("You can't bet bigger than your money! Pleae enter a smaller number: ");
						
						bet = sc.nextInt();
						sc.nextLine();
					}
					
					money -= bet;
					
	                for(int i = 0; i < 5; i++)
	                {
	                	player[i] = (int)(Math.random() * 13);
	                    dealer[i] = (int) (Math.random() * 13);
	                }
	                hit_p = 2;
	                hit_d = 2;
	                printHand(player, dealer, hit_p, hit_d);
	                
	                while((!ask.toLowerCase().equals("stay")|| !ask.toLowerCase().equals("s")) && hit_p < 5)
	                {
	                    System.out.print("Hit or Stay?: ");
	                    ask = sc.nextLine();
	                    
	                    if(ask.toLowerCase().equals("hit") || ask.toLowerCase().equals("h"))
	                    {
	                        hit_p++;
	                        printHand(player, dealer, hit_p, hit_d);
	                    }
	                    else if(!ask.toLowerCase().equals("stay") && !ask.toLowerCase().equals("s"))
	                        System.out.println("Not an expected output. Please try again.");
	                    else
	                        break;
	                }
	                
	                int playerValue = calcValue(player, hit_p);
	                if(playerValue > 21 && findAce(player, hit_p) == 0)
	                {
	                    System.out.println("Sorry, You busted!");
	                    System.out.println("You now have $" + money);
	                    continue;
	                }
	                
	                else if(playerValue > 21 && findAce(player, hit_p) != 0)
	                {
	                    int counter = 0;
	                    while(playerValue > 21 && counter < findAce(player, hit_p))
	                    {
	                        playerValue -= 10;
	                        counter++;
	                    }
	                    
	                    if(playerValue > 21)
	                    {
	                        System.out.println("Sorry, You busted!");
	                        System.out.println("You now have $" + money);
	                        continue;
	                    }
	                }
	                
	                System.out.println("Dealers turn!");
	                int dealerValue = calcValue(dealer, hit_d);
	                int count = 0;
	                while(dealerValue < 17)
	                {
	                    hit_d++;
	                    printHand(player, dealer, hit_p, hit_d);
	                    dealerValue += value[dealer[hit_d-1]];
	                        
	                    if(dealerValue > 21 && (findAce(dealer, hit_d) - count) > 0)
	                    {
	                        dealerValue -= 10;
	                        count++;
	                        System.out.println("You now have $" + money);
	                    }
	                }
	                if(playerValue == 21)
	                {
	                    System.out.println("Backjack!!!!!");
	                    money += bet + bet + bet;
	                    System.out.println("You now have $" + money);
	                }
	                else if(dealerValue > 21)
	                {
	                	System.out.println("You won!");
	                    money += bet;
	                    System.out.println("You now have $" + money);
	                }
	                else if(hit_p == 5)
	                {
	                    System.out.println("You won!!!");
	                    money += bet + bet;
	                    System.out.println("You now have $" + money);
	                }
	                    
	                else if(hit_d == 5)
	                {
	                    System.out.println("You lost, sorry");
	                    System.out.println("You now have $" + money);
	                }
	                    
	                else if(playerValue >= dealerValue)
	                {
	                    System.out.println("You won!!!");
	                    money += bet + bet;
	                    System.out.println("You now have $" + money);
	                }
	                    
	                else if(playerValue < dealerValue)
	                {
	                    System.out.println("You lost, sorry");
	                    System.out.println("You now have $" + money);
	                }
	                
	            }
	            
	            else if(play.toLowerCase().equals("no") || play.toLowerCase().equals("n"))
	            {
	                System.out.println("Sad to see you go! You still have $" + money + " so you can come back and play again!");
	                break;
	            }
	            else
	                System.out.println("Not expected output. Please try again.");
	    	}
		}
	}
	
    public static void printHand(int[] p, int[] d, int hit_p, int hit_d)
    {
        System.out.println("---------------------------------");
        System.out.print("Dealer: ");
        for(int i = 0; i < hit_d; i++)
            System.out.print("|" + card[d[i]] + "| ");
        
        System.out.print("\n\nPlayer: ");
        for(int i = 0; i < hit_p; i++)
            System.out.print("|" + card[p[i]] + "| ");
        System.out.println();
        System.out.println("---------------------------------");
    }
    

    public static int calcValue(int[] p, int hitNum)
    {
        int totalSum = 0;
        for(int i = 0; i < hitNum; i++)
            totalSum += value[p[i]];
        
        return totalSum;
    }
    
    public static int findAce(int[] p, int hit_p)
    {
        int counter = 0;
        for(int i = 0; i < hit_p; i++)
            if(p[i] == 0)
                counter++;
        
        return counter;
    }
}