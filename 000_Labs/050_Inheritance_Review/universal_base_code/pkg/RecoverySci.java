package pkg;

public class RecoverySci extends Science
{
    public RecoverySci(String teacher, int grade)
    {
        super(teacher, grade, "RecoverySci");
    }
    
    public void calcCredit()
    {
        if(super.getCredit() == 100)
            super.setCredit(3);
        else
            super.setCredit(0);
    }
    
    public String toString()
    {
        return "Teacher: " + teacher + "    credit: " + getCredit() + "    Field of Science: RecoverySci" ;
    }
}