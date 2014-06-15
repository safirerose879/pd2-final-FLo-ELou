import java.util.ArrayList;
import java.util.Scanner;

public class Driver{
    public static int numGames = 1;

    
    public static void PlayGame(Player B){
    	Player A = new Player();
    	Deck2 SavedDeck = new Deck2();
    	for(int i = 0 ;i<A.one.Starter.size() ;i++){
    	    SavedDeck.add(A.one.Starter.get(i));
    	}

    	System.out.println(SavedDeck.ShowDeck());

    	//B = new Player();
    	
    	System.out.println("Your opponent's deck consists of: \n" + B.one.ShowDeck());
    	
    	System.out.println("Level: " + A.getLevel());
    	System.out.println("Experience: " + A.getExp());

    	if(numGames == 1){
    		System.out.println("Welcome to your " + numGames +"st game.");	
    	}

    	else if(numGames == 2){
    		System.out.println("Welcome to your " + numGames +"nd game.");
    	}

    	else if(numGames == 3){
    		System.out.println("Welcome to your " + numGames +"rd game.");
    	}
    	else{
    		System.out.println("Welcome to your " + numGames +"th game.");
    	}
    	
    	//System.out.println("Your first opponent is FloEm.");

    	while(B.one.Starter.size() != 0 && A.one.Starter.size() != 0){
    		
    		//System.out.println(A.one.Starter.size());
    		//System.out.println(A.one.ShowDeck());
    		
    		System.out.println(A.one.Draw());
    		
    		if(A.one.Starter.size() == 0){
    			System.out.println("I'm so sorry but you lost ....MWAHAHAHAHA...Better luck next time!");
    			break;
    		}
    		
    		Deck2 Tied = new Deck2();

    	    System.out.println("Which aspect do you what to use? \n Type: w for Wisdom, l for Likability, e for Enthusiasm, c for Charisma, and b for Bravery.");
    	    Scanner c = new Scanner(System.in);
    	    String move = c.next();
    	    if(move.equals("w")){
    	    	if(A.one.Starter.get(0).getWisdom() > B.one.Starter.get(0).getWisdom()){
    	    		if(Tied.size()!=0){
    	    			System.out.println("You got the tied cards as well!");
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				A.one.Starter.add(Tied.get(i));	
    	    			}
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				Tied.remove(i);
    	    			}
    	    		}
    	    		System.out.println("You win this round! Your opponent loses this card.");
    	    		A.one.Starter.add(B.one.Starter.get(0));
    	    		B.one.Starter.remove(0);
    	    	}
    	    	else if(A.one.Starter.get(0).getWisdom() < B.one.Starter.get(0).getWisdom()){
    	    		if(Tied.size()!=0){
    	    			System.out.println("You lost the tied cards as well!");
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				B.one.Starter.add(Tied.get(i));	
    	    			}
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				Tied.remove(i);
    	    			}
    	    		}
    	    		System.out.println("You lost this round! You lost a card.");
    	    		B.one.Starter.add(A.one.Starter.get(0));
    	    		A.one.Starter.remove(0);
    	    	}
    	    	else if(A.one.Starter.get(0).getWisdom() == B.one.Starter.get(0).getWisdom()){
    	    		System.out.println("Tied! You both lose your respective card.");
    	    		Tied.add(A.one.Starter.get(0));
    	    		Tied.add(B.one.Starter.get(0));
    	    		B.one.Starter.remove(0);
    	    		A.one.Starter.remove(0);
    	    	}
    	    	System.out.println("You have "+ A.one.Starter.size() + " cards left. And your opponent has " + B.one.Starter.size() +" cards left.");
    	    }
    	    else if (move.equals("l")){
    	    	if(A.one.Starter.get(0).getLikability() > B.one.Starter.get(0).getLikability()){
    	    		if(Tied.size()!=0){
    	    			System.out.println("You got the tied cards as well!");
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				A.one.Starter.add(Tied.get(i));	
    	    			}
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				Tied.remove(i);
    	    			}
    	    		}
    	    		System.out.println("You win this round! Your opponent loses this card.");
    	    		A.one.Starter.add(B.one.Starter.get(0));
    	    		B.one.Starter.remove(0);
    	    	}
    	    	else if(A.one.Starter.get(0).getLikability() < B.one.Starter.get(0).getLikability()){
    	    		if(Tied.size()!=0){
    	    			System.out.println("You lost the tied cards as well!");
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				B.one.Starter.add(Tied.get(i));	
    	    			}
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				Tied.remove(i);
    	    			}
    	    		}
    	    		System.out.println("You lost this round! You lost a card.");
    	    		B.one.Starter.add(A.one.Starter.get(0));
    	    		A.one.Starter.remove(0);
    	    	}
    	    	else if(A.one.Starter.get(0).getLikability() == B.one.Starter.get(0).getLikability()){
    	    		System.out.println("Tied! You both lose your respective card.");
    	    		Tied.add(A.one.Starter.get(0));
    	    		Tied.add(B.one.Starter.get(0));
    	    		B.one.Starter.remove(0);
    	    		A.one.Starter.remove(0);
    	    	}
    	    	System.out.println("You have "+ A.one.Starter.size() + " cards left. And your opponent has " + B.one.Starter.size() +" cards left.");
    	    }
    	    else if(move.equals("e")){
    	    	if(A.one.Starter.get(0).getEnthusiasm() > B.one.Starter.get(0).getEnthusiasm()){
    	    		if(Tied.size()!=0){
    	    			System.out.println("You got the tied cards as well!");
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				A.one.Starter.add(Tied.get(i));	
    	    			}
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				Tied.remove(i);
    	    			}
    	    		}
    	    		System.out.println("You win this round! Your opponent loses this card.");
    	    		A.one.Starter.add(B.one.Starter.get(0));
    	    		B.one.Starter.remove(0);
    	    	}
    	    	else if(A.one.Starter.get(0).getEnthusiasm() < B.one.Starter.get(0).getEnthusiasm()){
    	    		if(Tied.size()!=0){
    	    			System.out.println("You lost the tied cards as well!");
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				B.one.Starter.add(Tied.get(i));	
    	    			}
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				Tied.remove(i);
    	    			}
    	    		}
    	    		System.out.println("You lost this round! You lost a card.");
    	    		B.one.Starter.add(A.one.Starter.get(0));
    	    		A.one.Starter.remove(0);
    	    	}
    	    	else if(A.one.Starter.get(0).getEnthusiasm() == B.one.Starter.get(0).getEnthusiasm()){
    	    		System.out.println("Tied! You both lose your respective card.");
    	    		Tied.add(A.one.Starter.get(0));
    	    		Tied.add(B.one.Starter.get(0));
    	    		B.one.Starter.remove(0);
    	    		A.one.Starter.remove(0);
    	    	}
    	    	System.out.println("You have "+ A.one.Starter.size() + " cards left. And your opponent has " + B.one.Starter.size() +" cards left.");
    	    }
    	    else if(move.equals("c")){
    	    	if(A.one.Starter.get(0).getCharisma() > B.one.Starter.get(0).getCharisma()){
    	    		if(Tied.size()!=0){
    	    			System.out.println("You got the tied cards as well!");
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				A.one.Starter.add(Tied.get(i));	
    	    			}
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				Tied.remove(i);
    	    			}
    	    		}
    	    		System.out.println("You win this round! Your opponent loses this card.");
    	    		A.one.Starter.add(B.one.Starter.get(0));
    	    		B.one.Starter.remove(0);
    	    	}
    	    	else if(A.one.Starter.get(0).getCharisma() < B.one.Starter.get(0).getCharisma()){
    	    		if(Tied.size()!=0){
    	    			System.out.println("You lost the tied cards as well!");
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				B.one.Starter.add(Tied.get(i));	
    	    			}
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				Tied.remove(i);
    	    			}
    	    		}
    	    		System.out.println("You lost this round! You lost a card.");
    	    		B.one.Starter.add(A.one.Starter.get(0));
    	    		A.one.Starter.remove(0);
    	    	}
    	    	else if(A.one.Starter.get(0).getCharisma() == B.one.Starter.get(0).getCharisma()){
    	    		System.out.println("Tied! You both lose your respective card.");
    	    		Tied.add(A.one.Starter.get(0));
    	    		Tied.add(B.one.Starter.get(0));
    	    		B.one.Starter.remove(0);
    	    		A.one.Starter.remove(0);
    	    	}
    	    	System.out.println("You have "+ A.one.Starter.size() + " cards left. And your opponent has " + B.one.Starter.size() +" cards left.");
    	    }
    	    else if(move.equals("b")){
    	    	if(A.one.Starter.get(0).getBravery() > B.one.Starter.get(0).getBravery()){
    	    		if(Tied.size()!=0){
    	    			System.out.println("You got the tied cards as well!");
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				A.one.Starter.add(Tied.get(i));	
    	    			}
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				Tied.remove(i);
    	    			}
    	    		}
    	    		System.out.println("You win this round! Your opponent loses this card.");
    	    		A.one.Starter.add(B.one.Starter.get(0));
    	    		B.one.Starter.remove(0);
    	    	}
    	    	else if(A.one.Starter.get(0).getBravery() < B.one.Starter.get(0).getBravery()){
    	    		if(Tied.size()!=0){
    	    			System.out.println("You lost the tied cards as well!");
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				B.one.Starter.add(Tied.get(i));	
    	    			}
    	    			for(int i = 0;i<Tied.size() ;i++){
    	    				Tied.remove(i);
    	    			}
    	    		}
    	    		System.out.println("You lost this round! You lost a card.");
    	    		B.one.Starter.add(A.one.Starter.get(0));
    	    		A.one.Starter.remove(0);
    	    	}
    	    	else if(A.one.Starter.get(0).getBravery() == B.one.Starter.get(0).getBravery()){
    	    		System.out.println("Tied! You both lose your respective card.");
    	    		Tied.add(A.one.Starter.get(0));
    	    		Tied.add(B.one.Starter.get(0));
    	    		B.one.Starter.remove(0);
    	    		A.one.Starter.remove(0);
    	    	}
    	    	System.out.println("You have "+ A.one.Starter.size() + " cards left. And your opponent has " + B.one.Starter.size() +" cards left.");
    	    }
    	    else {
    	    	System.out.println("I'm sorry. Please type in w, l, e, c or b");
    	    }
    	    
    	}

    	if(A.one.size() > 0){
    		System.out.println("Good job you won!");
    		
    		while(A.one.size() != 0){
    			A.one.remove(0);
    		}
    		for(int i = 0;i< SavedDeck.size() ;i++){
    			A.one.add(SavedDeck.get(i));
    		}
    		
    		A.exp += 10;
    		System.out.println(A.levelup());
    		numGames++;
    		
    	}

    	
    }
	

    public static void main(String args[]){

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


	Player FloEm = new Player();
	
	Player Wooky = new Player();
	WookyungLee W = new WookyungLee();
	Wooky.one.Starter.add(W);
	Wooky.one.shuffle();

	Player Flo = new Player();
	FlorenceLo F = new FlorenceLo();
	Flo.one.add(F);
	Flo.one.shuffle();
	
	
	//PlayGame(FloEm);
	PlayGame(Wooky);
	PlayGame(Flo);
	
    }

}
