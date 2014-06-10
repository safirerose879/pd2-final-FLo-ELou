import java.util.Scanner;

public class Driver{

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



    }

}