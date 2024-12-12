/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/
import java.util.Scanner;

class LectureStringMethods{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.print("Please enter a sentence: ");
        a = sc.nextLine();
        
        int s1 = a.indexOf(" ");
        String w1 = a.substring(0, s1);
        int s2 = a.indexOf(" ", s1+1);
        String w2 = a.substring(s1+1, s2);
        
        // System.out.println(w1);
        // System.out.println(w2);
        
        while(true)
        {
            if(a.indexOf(" ") == -1)
                break;
            int s11 = a.indexOf(" ");
            String w11 = a.substring(0, s11);
            a = a.substring(s11+1);
            System.out.println(w11);
        }
        System.out.println(a);
    }
}