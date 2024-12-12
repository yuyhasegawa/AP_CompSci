/*
 *	Author:  Yuya Hassegawa
 *  Date: 9/23/2024
*/

package pkg;

public class Actor extends Performer
{
    String type;
    
    public Actor()
    {
        super();
        type = new String("Theater");
    }
    
    public Actor(String name, String type)
    {
        super(name);
        this.type = type;
    }
    
    public void practice()
    {
        System.out.println(super.getName() + " practices for his next " + type + " performnce");
    }
    
    public void perform()
    {
        System.out.println(super.getName() + " performs amazingly.");
    }
    
    public void monologue()
    {
        System.out.println("お前はもう死んでいる！！！");
    }
}