package ie.tudublin;

import java.util.ArrayList;
import ie.tudublin.Follow;

public class Word 
{
    private String word;
    private ArrayList<Follow> follows;
    
    public void Word(String the_word)
    {
        this.word = the_word;
    }

    //Getters 
    public String get_word()
    {
        return this.word;
    }
    
    public ArrayList<Follow> get_follows()
    {
        return this.follows;
    }

    //Setters
    public void set_word(String the_word)
    {
        this.word = the_word;
    }
    public void set_follows(ArrayList<Follow> the_follows)
    {
        this.follows = the_follows;
    }

    public String toString()
    {
        String output = "";
        output += this.word + ": ";
        
        for (Follow follow : follows) 
        {
            output += follow.toString();
        }

        return output;
    }
}
