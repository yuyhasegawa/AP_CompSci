package pkg;

public class MAth extends CourseClass
{
    String diffculty;
    
    public MAth(String teacher, int grade, String diffculty)
    {
        super(teacher, grade);
        this.diffculty = diffculty;
    }
    
    public String getDiffculty()
    {
        return diffculty;
    }
    
    public void setDiffculty(String diffculty)
    {
        this.diffculty = diffculty;
    }
    
    public String toString()
    {
        return "Teacher: " + teacher + "    credit: " + getCredit() + "    Diffculty of math" + diffculty;
    }
}