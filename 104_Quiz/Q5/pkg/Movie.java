package pkg;

public class Movie
{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    public Movie()
    {
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String movieName, double rating, int numRatings, int revenue)
    {
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    public void movieToString()
    {
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.print("\n");
    }
    
    public String getMovieName()
    {
        return movieName;
    }
    
    public double getRating()
    {
        return rating;
    }
    
    public int getNumRatings()
    {
        return numRatings;
    }
    
    public int getRevenue()
    {
        return revenue;
    }
    
    public void addRating(double rating)
    {
        double tempRating = (this.rating * numRatings) + rating;
        numRatings++;
        this.rating = tempRating/numRatings;
    }
    
    public boolean compareRatings(Movie a)
    {
        return this.rating > a.rating;
    }
    
    public String revenueToString()
    {
        String a = "" + revenue;
        String b = "";
        int num = a.length() / 3;
        int max = a.length();
        if(a.length() % 3 == 0)
            num--;
        
        for(int i = 0; i < num; i++)
        {
            b =  a.substring(max-3, max) + b;
            b =  "," + b;
            max = max - 3;
        }
        
        int rest = a.length() % 3;
        if(rest == 0)
            rest = 3;
        b = a.substring(0, rest) + b;
        return b;
    }
    
    public Movie pirateMovie()
    {
        return this;
    }
}
