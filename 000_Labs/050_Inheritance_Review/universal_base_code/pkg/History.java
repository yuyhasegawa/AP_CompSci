package pkg;

public class History extends CourseClass
{
    String era;
    
    public History(String teacher, int grade, String era)
    {
        super(teacher, grade);
        this.era = era;
    }
    
    public String getEra()
    {
        return era;
    }
    
    public void setEra(String era)
    {
        this.era = era;
    }
    
    public String toString()
    {
        return "Teacher: " + teacher + "    credit: " + getCredit() + "   Era: " + era;
    }
}