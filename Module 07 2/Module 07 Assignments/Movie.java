/**
 * Purpose: to declare/define a movie class
 *
 * @author William Van Uiert
 * @version 01/23/25
 *
 */

public class Movie
{
    // instance variables
    private int year;
    private String title;
    private String studio;

    // Constructor for objects of class Movie
    public Movie(String title, int year, String studio)
    {
        // initialize instance variables
        this.title = title;
        this.year = year;
        this.studio = studio;
    }

    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getStudio()
    {
        return studio;
    }
    
    public void setStudio(String studio)
    {
        this.studio = studio;
    }
    
    public int getYear()
    {
        return year;
    }
   
    public void setYear(int year)
    {
        this.year = year;
    }
   
    public String toString()
    {
        String str = String.format("%-30s %4d   %-20s", title, year, studio);
        return str;
    }
}
