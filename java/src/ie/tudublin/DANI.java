package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import ie.tudublin.Word;
import ie.tudublin.Follow;

public class DANI extends PApplet {

	ArrayList<Word> model = new ArrayList<>();

	
	public void loadFile() 
	{
		String[] lines = loadStrings("small.txt");
		String[] words;
		String last_word = null;
		Word this_word;
		Follow this_follow;

		for (String line : lines) {
			words = split(line, ' ');

			for (String WORD : words) {
				WORD = WORD.replaceAll("[^\\w\\s]", "");
				WORD = WORD.toLowerCase();
				println("Previous word is " + last_word + " new is " + WORD);
				if (last_word != null) //null included invisable characters, "" works
				{
					this_word = find_word(last_word);
					if (this_word == null) 
					{
						println("adding word to model");
						this_word = new Word(last_word);
						model.add(this_word);
					}
					


					this_follow = this_word.find_follow(WORD);
					if (this_follow == null) 
					{
						// I cannot understand why 
						println("adding follow");

						Follow temp_follow = new Follow(WORD, 1);
						this_word.add_follow(temp_follow);
					} 
					else 
					{
						println("increasing follow count");
						this_follow.increase_count();
					}
				}

				last_word = WORD;
			}
		}
	}

	public Word find_word(String the_string) 
	{
		for (Word this_word : model) 
		{
			if (this_word.get_word().equals(the_string) ) // == caused issue, fixed
			{
				return this_word;
			}
		}
		return null;
	}


	public void printModel() 
	{
		for (Word word : model) {
			println(word.toString());
		}
	}


	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();
		printModel();
       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}
