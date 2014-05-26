import java.io.Serializable;

public abstract class Cards implements Serializable {

	public int wisdom, likability, teachingSkill, Enthusiasm, Charisma, Bravery;
	public String name,description;
	
	public Cards(String name,
			String descripton,
			int wisdom,
			int likability,
			int teachingSkill,
			int Enthusiasm,
			int Charisma,
			int Bravery
			){
		this.name = name;
		this.description = description;
		this.wisdom = wisdom;
		this.likability = likability;
		this.teachingSkill = teachingSkill;
		this.Enthusiasm = Enthusiasm;	
		this.Charisma = Charisma;
		this.Bravery = Bravery;
	}
	
	
	
	
}
