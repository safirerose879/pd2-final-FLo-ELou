import java.util.ArrayList;
import java.util.Random;

public class Player{

    int level, exp;
    Deck2 one;
    
    public Player(){
	one = new Deck2();
	level = 1;
	exp = 0;
    }

    public int getLevel(){
	return level;
    }

    public int getExp(){
	return exp;
    }
    
    public String levelup(){
    	if(exp == level * 50){
	    one.addSpCard();
	    return "Congrats, you leveled up! -insert coco's famous smiley faces- Your level is " + level + ". You have " + exp + "experience.";
    	}
    	return "Sorry you didn't level up. -insert coco's famous sad faces- Your level is " + level + ". You have " + exp + "experience.";
    }
    
}
