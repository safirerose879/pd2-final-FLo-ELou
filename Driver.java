import java.util.ArrayList;
import java.util.Scanner;

public class Driver{

	

    public static void main(String args[]){

    	
        int numGames = 1;

	System.out.println("\n");

	System.out.println("Welcome to the wonderous world where Stuy students verses students, students vs teachers and the most exciting, teachers vs teachers. Please enjoy this game!  \n\n© Emma [F]Lo[u] and co. \n                             Press 's' to Start. \n");

	Scanner a = new Scanner(System.in);
	String answer = a.next();
	if (answer.equals("s")){
	    Scanner b = new Scanner(System.in);
	    System.out.println("Please enter your name.");
	    String name = b.next();
	    System.out.println("Welcome to the game " + name + ".");
	}
	else{
	    System.out.println("Oh you want to leave. Please come back and play soon.");
	}

	Player A = new Player();
	Player FloEm = new Player();
	
	System.out.println("Level: " + A.getLevel());
	System.out.println("Experience: " + A.getExp());

	if(numGames == 1){
		System.out.println("Welcome to your " + numGames +"st game.");	
	}

	else if(numGames == 2){
		System.out.println("Welcome to your " + numGames +"nd game.");
	}

	else if(numGames == 2){
		System.out.println("Welcome to your " + numGames +"rd game.");
	}
	else{
		System.out.println("Welcome to your " + numGames +"th game.");
	}
	
	System.out.println("Your first opponent is FloEm.");

	while(FloEm.one.Starter.size() != 0){
		
		//System.out.println(A.one.Starter.size());
		//System.out.println(A.one.ShowDeck());
		
		if(A.one.Starter.size() == 0){
			System.out.println("I'm so sorry but you lost to FloEm....MWAHAHAHAHA...Better luck next time!");
			break;
		}
		
		ArrayList<Cards> Tied = new ArrayList<Cards>();

	    System.out.println("Which aspect do you what to use? \n Type: w for Wisdom, l for Likability, e for Enthusiasm, c for Charisma, and b for Bravery.");
	    Scanner c = new Scanner(System.in);
	    String move = c.next();
	    if(move.equals("w")){
	    	if(A.one.Starter.get(0).getWisdom() > FloEm.one.Starter.get(0).getWisdom()){
	    		if(Tied.size()!=0){
	    			System.out.println("You got the tied cards as well!");
	    			for(int i = 0;i<Tied.size() ;i++){
	    				A.one.Starter.add(Tied.get(i));	
	    			}
	    			for(int i = 0;i<Tied.size() ;i++){
	    				Tied.remove(i);
	    			}
	    		}
	    		System.out.println("You win this round! FloEm loses this card.");
	    		A.one.Starter.add(FloEm.one.Starter.get(0));
	    		FloEm.one.Starter.remove(0);
	    	}
	    	else if(A.one.Starter.get(0).getWisdom() < FloEm.one.Starter.get(0).getWisdom()){
	    		if(Tied.size()!=0){
	    			System.out.println("You lost the tied cards as well!");
	    			for(int i = 0;i<Tied.size() ;i++){
	    				FloEm.one.Starter.add(Tied.get(i));	
	    			}
	    			for(int i = 0;i<Tied.size() ;i++){
	    				Tied.remove(i);
	    			}
	    		}
	    		System.out.println("You lost this round! You lost a card.");
	    		FloEm.one.Starter.add(A.one.Starter.get(0));
	    		A.one.Starter.remove(0);
	    	}
	    	else if(A.one.Starter.get(0).getWisdom() == FloEm.one.Starter.get(0).getWisdom()){
	    		System.out.println("Tied! You both lose your respective card.");
	    		Tied.add(A.one.Starter.get(0));
	    		Tied.add(FloEm.one.Starter.get(0));
	    		FloEm.one.Starter.remove(0);
	    		A.one.Starter.remove(0);
	    	}
	    	System.out.println("You have "+ A.one.Starter.size() + " cards left. And FloEm has " + FloEm.one.Starter.size() +" cards left.");
	    }
	    else if (move.equals("l")){
	    	if(A.one.Starter.get(0).getLikability() > FloEm.one.Starter.get(0).getLikability()){
	    		if(Tied.size()!=0){
	    			System.out.println("You got the tied cards as well!");
	    			for(int i = 0;i<Tied.size() ;i++){
	    				A.one.Starter.add(Tied.get(i));	
	    			}
	    			for(int i = 0;i<Tied.size() ;i++){
	    				Tied.remove(i);
	    			}
	    		}
	    		System.out.println("You win this round! FloEm loses this card.");
	    		A.one.Starter.add(FloEm.one.Starter.get(0));
	    		FloEm.one.Starter.remove(0);
	    	}
	    	else if(A.one.Starter.get(0).getLikability() < FloEm.one.Starter.get(0).getLikability()){
	    		if(Tied.size()!=0){
	    			System.out.println("You lost the tied cards as well!");
	    			for(int i = 0;i<Tied.size() ;i++){
	    				FloEm.one.Starter.add(Tied.get(i));	
	    			}
	    			for(int i = 0;i<Tied.size() ;i++){
	    				Tied.remove(i);
	    			}
	    		}
	    		System.out.println("You lost this round! You lost a card.");
	    		FloEm.one.Starter.add(A.one.Starter.get(0));
	    		A.one.Starter.remove(0);
	    	}
	    	else if(A.one.Starter.get(0).getLikability() == FloEm.one.Starter.get(0).getLikability()){
	    		System.out.println("Tied! You both lose your respective card.");
	    		Tied.add(A.one.Starter.get(0));
	    		Tied.add(FloEm.one.Starter.get(0));
	    		FloEm.one.Starter.remove(0);
	    		A.one.Starter.remove(0);
	    	}
	    	System.out.println("You have "+ A.one.Starter.size() + " cards left. And FloEm has " + FloEm.one.Starter.size() +" cards left.");
	    }
	    else if(move.equals("e")){
	    	if(A.one.Starter.get(0).getEnthusiasm() > FloEm.one.Starter.get(0).getEnthusiasm()){
	    		if(Tied.size()!=0){
	    			System.out.println("You got the tied cards as well!");
	    			for(int i = 0;i<Tied.size() ;i++){
	    				A.one.Starter.add(Tied.get(i));	
	    			}
	    			for(int i = 0;i<Tied.size() ;i++){
	    				Tied.remove(i);
	    			}
	    		}
	    		System.out.println("You win this round! FloEm loses this card.");
	    		A.one.Starter.add(FloEm.one.Starter.get(0));
	    		FloEm.one.Starter.remove(0);
	    	}
	    	else if(A.one.Starter.get(0).getEnthusiasm() < FloEm.one.Starter.get(0).getEnthusiasm()){
	    		if(Tied.size()!=0){
	    			System.out.println("You lost the tied cards as well!");
	    			for(int i = 0;i<Tied.size() ;i++){
	    				FloEm.one.Starter.add(Tied.get(i));	
	    			}
	    			for(int i = 0;i<Tied.size() ;i++){
	    				Tied.remove(i);
	    			}
	    		}
	    		System.out.println("You lost this round! You lost a card.");
	    		FloEm.one.Starter.add(A.one.Starter.get(0));
	    		A.one.Starter.remove(0);
	    	}
	    	else if(A.one.Starter.get(0).getEnthusiasm() == FloEm.one.Starter.get(0).getEnthusiasm()){
	    		System.out.println("Tied! You both lose your respective card.");
	    		Tied.add(A.one.Starter.get(0));
	    		Tied.add(FloEm.one.Starter.get(0));
	    		FloEm.one.Starter.remove(0);
	    		A.one.Starter.remove(0);
	    	}
	    	System.out.println("You have "+ A.one.Starter.size() + " cards left. And FloEm has " + FloEm.one.Starter.size() +" cards left.");
	    }
	    else if(move.equals("c")){
	    	if(A.one.Starter.get(0).getCharisma() > FloEm.one.Starter.get(0).getCharisma()){
	    		if(Tied.size()!=0){
	    			System.out.println("You got the tied cards as well!");
	    			for(int i = 0;i<Tied.size() ;i++){
	    				A.one.Starter.add(Tied.get(i));	
	    			}
	    			for(int i = 0;i<Tied.size() ;i++){
	    				Tied.remove(i);
	    			}
	    		}
	    		System.out.println("You win this round! FloEm loses this card.");
	    		A.one.Starter.add(FloEm.one.Starter.get(0));
	    		FloEm.one.Starter.remove(0);
	    	}
	    	else if(A.one.Starter.get(0).getCharisma() < FloEm.one.Starter.get(0).getCharisma()){
	    		if(Tied.size()!=0){
	    			System.out.println("You lost the tied cards as well!");
	    			for(int i = 0;i<Tied.size() ;i++){
	    				FloEm.one.Starter.add(Tied.get(i));	
	    			}
	    			for(int i = 0;i<Tied.size() ;i++){
	    				Tied.remove(i);
	    			}
	    		}
	    		System.out.println("You lost this round! You lost a card.");
	    		FloEm.one.Starter.add(A.one.Starter.get(0));
	    		A.one.Starter.remove(0);
	    	}
	    	else if(A.one.Starter.get(0).getCharisma() == FloEm.one.Starter.get(0).getCharisma()){
	    		System.out.println("Tied! You both lose your respective card.");
	    		Tied.add(A.one.Starter.get(0));
	    		Tied.add(FloEm.one.Starter.get(0));
	    		FloEm.one.Starter.remove(0);
	    		A.one.Starter.remove(0);
	    	}
	    	System.out.println("You have "+ A.one.Starter.size() + " cards left. And FloEm has " + FloEm.one.Starter.size() +" cards left.");
	    }
	    else if(move.equals("b")){
	    	if(A.one.Starter.get(0).getBravery() > FloEm.one.Starter.get(0).getBravery()){
	    		if(Tied.size()!=0){
	    			System.out.println("You got the tied cards as well!");
	    			for(int i = 0;i<Tied.size() ;i++){
	    				A.one.Starter.add(Tied.get(i));	
	    			}
	    			for(int i = 0;i<Tied.size() ;i++){
	    				Tied.remove(i);
	    			}
	    		}
	    		System.out.println("You win this round! FloEm loses this card.");
	    		A.one.Starter.add(FloEm.one.Starter.get(0));
	    		FloEm.one.Starter.remove(0);
	    	}
	    	else if(A.one.Starter.get(0).getBravery() < FloEm.one.Starter.get(0).getBravery()){
	    		if(Tied.size()!=0){
	    			System.out.println("You lost the tied cards as well!");
	    			for(int i = 0;i<Tied.size() ;i++){
	    				FloEm.one.Starter.add(Tied.get(i));	
	    			}
	    			for(int i = 0;i<Tied.size() ;i++){
	    				Tied.remove(i);
	    			}
	    		}
	    		System.out.println("You lost this round! You lost a card.");
	    		FloEm.one.Starter.add(A.one.Starter.get(0));
	    		A.one.Starter.remove(0);
	    	}
	    	else if(A.one.Starter.get(0).getBravery() == FloEm.one.Starter.get(0).getBravery()){
	    		System.out.println("Tied! You both lose your respective card.");
	    		Tied.add(A.one.Starter.get(0));
	    		Tied.add(FloEm.one.Starter.get(0));
	    		FloEm.one.Starter.remove(0);
	    		A.one.Starter.remove(0);
	    	}
	    	System.out.println("You have "+ A.one.Starter.size() + " cards left. And FloEm has " + FloEm.one.Starter.size() +" cards left.");
	    }
	    else {
	    	System.out.println("I'm sorry. Please type in w, l, e, c or b");
	    }

	}
	
	if(A.one.Starter.size() != 0){
		System.out.println("Good job you won!");
		A.exp += 10;
		A.levelup();
	}
	
    }

}