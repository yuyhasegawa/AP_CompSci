// Yuya Hasegawa, 9/23/2024

package pkg;

public class Apprentice extends Musician
{
    String school;
    int yearsOfExperience;
    
    public Apprentice()
    {
        school = "CVHS";
        yearsOfExperience = 0;
    }
    
    public Apprentice(String school, int yearsOfExperience)
    {
        this.school = school;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public Apprentice(String insturment, String school, int yearsOfExperience)
    {
        super(insturment);
        this.school = school;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public Apprentice(String name, int age, String insturment, String school, int yearsOfExperience)
    {
        super(name, age, insturment);
        this.school = school;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public void playsInstrument()
    {
        System.out.println(super.getInstrument() + " is played okay");
    }
    
    public void practice()
    {
        super.practice();
        System.out.println(super.getName() + " has played for " + yearsOfExperience + " years");
    }
    
    public void perform()
    {
        super.perform();
        System.out.println("The performance needs more practicing.");
    }
    
    public void practiceAtUniversity()
    {
        super.practice();
        System.out.println(super.getName() + " practices " + super.getInstrument() + " at " + school);
    }
    
    public String toString()
    {
        return "Name: " + super.getName() + "     Instrument: " + super.getInstrument() + "     University: " + this.school;   
        
    }
}