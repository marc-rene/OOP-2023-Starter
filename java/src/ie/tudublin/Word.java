package ie.tudublin;

import java.util.ArrayList;
import ie.tudublin.Follow;

public class Word {
    private String word;
    private ArrayList<Follow> follows;

    public Word(String the_word) 
    {
        this.word = the_word;
        follows = new ArrayList<Follow>();
    }

    // Getters
    public String get_word() 
    {
        return this.word;
    }

    public ArrayList<Follow> get_follows() 
    {
        return this.follows;
    }


    public Follow find_follow(String the_string) 
    {
        for (Follow follow : follows) 
        {
            if (follow.get_word() == the_string) 
            {
                return follow;
            }
        }
        return null;
    }


    // Setters
    public void set_word(String the_word) 
    {
        this.word = the_word;
    }

    public void set_follows(ArrayList<Follow> the_follows) 
    {
        this.follows = the_follows;
    }

    public void add_follow(Follow follow) 
    {
        follows.add(follow);
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
