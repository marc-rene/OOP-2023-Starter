package ie.tudublin;

public class Follow 
{
    private String word;
    private int count;
 
    public Follow(String the_word, int the_count)
    {
        this.word = the_word;
        this.count = the_count;
    }

    //Getters 
    public String get_word()
    {
        return this.word;
    }
    
    public int get_count()
    {
        return this.count;
    }

    //Setters
    public void set_word(String the_word)
    {
        this.word = the_word;
    }
    public void set_count(int the_count)
    {
        this.count = the_count;
    }

    public String toString()
    {
        return this.word + "(" + this.count + ")";
    }


}
