package pkg;

public class Musician extends Performer
{
    String instrument;
    
    public Musician()
    {
        instrument = "Cello";
    }
    
    public Musician(String instrument)
    {
        this.instrument = instrument;
    }
    
    public Musician(String name, String instrument)
    {
        super(name);
        this.instrument = instrument;
    }
    
    public Musician(String name, int age, String instrument)
    {
        super(name, age);
        this.instrument = instrument;
    }
    
    public String getInstrument()
    {
        return instrument;
    }
    
    public void playsInstrument()
    {
        System.out.println("The " + instrument + " is played beautifully");
    }
}