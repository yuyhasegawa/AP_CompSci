import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;
        int none = 0;
		for(int j = 0; j < passwords.length; j++)
		{
		    if(passwords[j].length() >= 8 && (passwords[j].contains("!") || passwords[j].contains("@") || passwords[j].contains("#")|| passwords[j].contains("$")|| passwords[j].contains("%")|| passwords[j].contains("^")|| passwords[j].contains("&")|| passwords[j].contains("*")))
		        l3++;
		    else if(passwords[j].contains("!") || passwords[j].contains("@") || passwords[j].contains("#")|| passwords[j].contains("$")|| passwords[j].contains("%")|| passwords[j].contains("^")|| passwords[j].contains("&")|| passwords[j].contains("*"))
		        l2++;
		    else if(passwords[j].length() >= 8)
		        l1++;
		    else
		        none++;
		}
		
		System.out.println("There are " + l1 + " of strength 1 with 8 or more characters.");
		System.out.println("There are " + l2 + " passwords of strength 2 with special symbol.");
		System.out.println("There are " + l3 + " passwords of strength 3 with both strength 1 and 2.");
		System.out.println("There are " + none + " passwords with no strength.");
	}
}
