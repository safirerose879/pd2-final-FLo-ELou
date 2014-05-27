import java.io.*;
import java.util.*;

public abstract class Students extends Cards{

	public int Grades;
	
	public Students(String name,
			String descripton,
			int wisdom,
			int likability,
			int Enthusiasm,
			int Charisma,
			int Bravery,
			int Grades) {
		super(name, descripton, wisdom, likability, Enthusiasm, Charisma, Bravery);
		this.Grades = Grades;
	}

	public String toString()
    {
	return String.format("%s(%d/%d)", name, description, wisdom, likability, Enthusiasm, Charisma, Bravery, Grades);
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
	public int getGrades(){
		return Grades;
	}
	
}
