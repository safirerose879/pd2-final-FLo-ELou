import java.io.Serializable;

public abstract class Cards implements Serializable {

	public int wisdom, likability, Enthusiasm, Charisma, Bravery;
	public String name,description;
	
	public Cards(String name,
			String descripton,
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
	
	
	
	
}
