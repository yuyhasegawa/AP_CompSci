package pkg;

public class CourseClass
{
    String teacher;
    int grade;
    int credit;
    
    public CourseClass(String teacher, int grade)
    {
        this.teacher = teacher;
        this.grade = grade;
    }
    
    public void calcCredit()
    {
        if(grade >= 90)
            credit = 4;
        else if(grade >= 80)
            credit = 3;
        else if(grade >= 70)
            credit = 2;
        else if(grade >= 60)
            credit = 1;
        else if(grade < 60)
            credit = 0;
    }
    
    public String getTeacher()
    {
        return teacher;
    }
    
    public int grade()
    {
        return grade;
    }
    
    public int credit()
    {
        return credit;
    }
    
    public void setTeacher(String teacher)
    {
        this.teacher = teacher;
    }
    
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    
    public int getGrade()
    {
        return grade;
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    public int getCredit()
    {
        return credit;
    }
    
    public boolean equals(Object other)
    {
        if(!(other instanceof CourseClass))
            return false;
        else
        {
            return this.teacher.equals(((CourseClass)other).teacher);
        }
    }
    
    public String toString()
    {
        return "Teacher: " + teacher + "    credit: " + getCredit();
    }
}