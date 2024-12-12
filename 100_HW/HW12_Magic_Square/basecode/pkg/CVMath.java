package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void specialSquare(int n)
	{
		int counter = 0;
		int find = 0;
		for(int i = 1;; i++)
		{
			find = 0;
			int t = i*i;
			//System.out.println(t);
			for(int j = 0; find < t; j++)
			{
				find += j;
			}
			if(find == t)
			{
				System.out.println(t);
				counter++;
			}
			if(counter == n)
				return;
		}
	}
}
