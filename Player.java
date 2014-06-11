public class Player{

    int level, exp;

    Player(){
	Deck2 one = new Deck2();
	level = 1;
	exp = 0;
    }

    public int getLevel(){
	return level;
    }

    public int getExp(){
	return exp;
    }

}