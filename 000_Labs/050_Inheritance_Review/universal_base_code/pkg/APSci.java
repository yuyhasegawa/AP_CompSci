package pkg;

public class APSci extends Science
{
    public APSci(String teacher, int grade)
    {
        super(teacher, grade, "APSci");
    }
    
    public void calcCredit()
    {
        if(super.getGrade() >= 90)
            super.setCredit(5);
        else if(super.getGrade() >= 80)
            super.setCredit(4);
        else if(super.getGrade() >= 70)
            super.setCredit(3);
        else if(super.getGrade() >= 60)
            super.setCredit(2);
        else if(super.getGrade() < 60)
            super.setCredit(1);
    }
    
    
    public String toString()
    {
        return "Teacher: " + teacher + "    credit: " + getCredit() + "    Field of Science: ApSci" ;
    }
}