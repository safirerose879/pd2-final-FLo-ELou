import java.io.Serializable;
import java.io.*;
import java.util.*;

public abstract class Cards implements Serializable {

	public int wisdom, likability, Enthusiasm, Charisma, Bravery;
	public String name,description;
	
	public Cards(String name,
			String description,
			int wisdom,
			int likability,
			int Enthusiasm,
			int Charisma,
			int Bravery
			){
		this.name = name;
		this.description = description;
		this.wisdom = wisdom;
		this.likability = likability;
		this.Enthusiasm = Enthusiasm;	
		this.Charisma = Charisma;
		this.Bravery = Bravery;
	}

	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	public int getWisdom(){
		return wisdom;
	}
	public int getLikability(){
		return likability;
	}
	public int getEnthusiasm(){
		return Enthusiasm;
	}
	public int getCharisma(){
		return Charisma;
	}
	public int getBravery(){
		return Bravery;
	}

	
	
	
	
}
