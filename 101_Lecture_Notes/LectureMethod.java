/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        greeting("Sean");
        
        double num = raise(6000, 6);;
        
        for(int i = 0; i < 10; i++)
        	        num = raise(num + 6000, 6);
        System.out.println(num);
	}
	
	public static double raise(double salary, int percent)
	{
		// OR double amount = salary + (salary * (percent/100.0));
		//return amount;
		return salary + (salary * (percent/100.0));
	}
	
	public static void greeting(String name)
	{
	    System.out.println("What's up " + name + "!");
	}
	
	public static void printAnimal()
	{
	    System.out.println(" |\\__/,|   (`\\");
	    System.out.println(" |_ _  |.--.) )");
	    System.out.println(" ( T   )     /");
	    System.out.println("(((^_(((/(((_/\n");
	}
}