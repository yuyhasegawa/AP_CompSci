/*
   * Author: Yuya Hasegawa
   * Date: 12/8/2024
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String sentence;
		
		System.out.print("Please enter a sentece: ");
		sentence = sc.nextLine();
		System.out.println("Here is your pig latin");
		while(true)
		{
			if(sentence.indexOf(" ") == -1)
			{
				pigLatin(sentence);
				break;
			}
			String temp = sentence.substring(0, sentence.indexOf(" "));
			sentence = sentence.substring(sentence.indexOf(" ") + 1);
			pigLatin(temp);
		}
		System.out.println();
	}
	
	public static boolean vowelCheck(String a)
	{
		String vowel[] = {"a", "e", "i", "o", "u"};
		for(int i = 0; i < vowel.length; i++)
			if(a.equals(vowel[i].toLowerCase()))
				return true;
		return false;
	}
	
	public static void pigLatin(String a)
	{
		if(a.length() == 1)
		{
			System.out.print(a + "-way ");
			return;
		}
		
		String l1 = a.substring(0, 1);
		String l2 = a.substring(1, 2);
		
		if(vowelCheck(l1))
			System.out.print(a + "-way ");
		else
			if(vowelCheck(l2))
				System.out.print(a.substring(1) + "-" + l1 + "ay ");
			else
				if(a.length() == 2)
					System.out.print(a + "-ay ");
				else
					System.out.print(a.substring(2) + "-" + l1 + l2 + "ay ");
	}
}
