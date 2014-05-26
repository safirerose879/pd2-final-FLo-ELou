
public abstract class Students extends Cards{

	public int Grades;
	
	public Students(String name,
			String descripton,
			int wisdom,
			int likability,
			int teachingSkill,
			int Enthusiasm,
			int Charisma,
			int Bravery,
			int Grades) {
		super(name, descripton, wisdom, likability, teachingSkill, Enthusiasm, Charisma, Bravery);
		this.Grades = Grades;
	}

	public String toString()
    {
	return String.format("%s(%d/%d)", name, description, wisdom, likability, teachingSkill, Enthusiasm, Charisma, Bravery);
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
	public int getTeachingSkill(){
		return teachingSkill;
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
