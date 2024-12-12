/*
	Author: Yuya Hasegawa
	Date: 12/5/2024
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        //String sentence = sc.nextLine();
        String word = sc.nextLine();
        String spongeWord = "";

        
        // while(true)
        // {
        //     if(sentence.indexOf(" ") == -1)
        //     {
        //         System.out.print(spongeCase(sentence) + " ");
        //         break;
        //     }
            
        //     int space = sentence.indexOf(" ");
        //     String word = sentence.substring(0, space);
        //     System.out.print(spongeCase(word) + " ");
        //     sentence = sentence.substring(space+1);
        // }
        
        // System.out.println(spongeWord);
        
        int s;
        String temp;
        int track = 0;
        s = word.indexOf(" ");
        while(s != -1)
        {
            temp = word.substring(0, s);
            for(int i = 0; i < temp.length(); i++)
            {
                if(track % 2 == 0)
                    spongeWord += temp.substring(i, i+1).toLowerCase();
                else
                    spongeWord += temp.substring(i, i+1).toUpperCase();
                track++;
            }
            spongeWord += " ";
            word = word.substring(s+1);
            s = word.indexOf(" ");
        }
                //for Single word
        for(int i = 0; i < word.length(); i++)
        {
            if(track % 2 == 0)
                spongeWord += word.substring(i, i+1).toLowerCase();
            else
                spongeWord += word.substring(i, i+1).toUpperCase();
            track++;
        }
        
        System.out.println(spongeWord);
	}
	
	public static String spongeCase(String word)
	{
		String spongeWord = "";
		for(int i = 0; i < word.length(); i++)
            if(i % 2 == 0)
                spongeWord += word.substring(i, i+1).toLowerCase();
            else
                spongeWord += word.substring(i, i+1).toUpperCase();
		
		return spongeWord;
	}
}
