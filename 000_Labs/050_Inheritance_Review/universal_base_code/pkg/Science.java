package pkg;

public class Science extends CourseClass
{
    String field;
    
    public Science(String teacher, int grade, String field)
    {
        super(teacher, grade);
        this.field = field;
    }
    
    public String getField()
    {
        return field;
    }
    
    public void setField(String field)
    {
        this.field = field;
    }
    
    public String toString()
    {
        return "Teacher: " + teacher + "    credit: " + getCredit() + "     Field of Science: " + field;
    }
}