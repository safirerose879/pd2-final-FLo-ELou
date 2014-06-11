import java.util.Scanner;

public class Driver{

    int numGames = 1;


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

	Player name = new Player();
	Player FloEm = new Player();
	System.out.println("Level: " + name.getLevel());
	System.out.println("Experience: " + name.getExp());

	System.out.println("Welcome to your " + numGames +" game.");

	System.out.println("Your first opponent is FloEm.");

	while(FloEm != null){

	    System.out.println("Which aspect do you wnat to use? \n Type: W for Wisdom, L for Likability, E for Enthusiasm, C for Charisma, and B for Bravery.");
	    Scanner c = new Scanner(System.in);
	    String move = c.next();
	    if(move.equals("")){

	    }

	}

    }

}