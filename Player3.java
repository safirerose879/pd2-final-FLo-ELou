import java.util.ArrayList;
import java.util.Random;

public class Player3{

    int level, exp;
    Deck3 one;
    
    public Player3(){
	one = new Deck3();
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
    		level ++;
    		return "Congrats, you leveled up! -insert coco's famous smiley faces- Your level is " + level + ". You have " + exp + " experience.";
    	}else{
        	return "Sorry you didn't level up. -insert coco's famous sad faces- Your level is " + level + ". You have " + exp + " experience.";	
    	}
    }
    
}
