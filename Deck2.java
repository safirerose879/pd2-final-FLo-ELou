import java.util.*;
import java.io.*;

public class Deck2 extends ArrayList<Cards> {

    private ArrayList<Cards> Starter, BoringDeck;
	
	public Deck2(){
		
		Bob b = new Bob();
		Dave d = new Dave();

		System.out.println("Checking");
		System.out.println(b.getName());

		BoringDeck.add(b);
		BoringDeck.add(b);
		BoringDeck.add(b);
		BoringDeck.add(b);
		BoringDeck.add(b);
		BoringDeck.add(d);
		BoringDeck.add(d);
		BoringDeck.add(d);
		BoringDeck.add(d);
		BoringDeck.add(d);
		
		System.out.println("hmmm");

		while(BoringDeck.size() > 0){
			int num = (int) (Math.random() * BoringDeck.size() + 1);
			Starter.add(BoringDeck.get(num));
			BoringDeck.remove(num);
		}

	}
	
	public String ShowDeck(){
		String str = "";
		for(int i = 0;i<Starter.size() ;i++){
		    str += Starter.get(i).getName() + "\n";
		}
		return str;
	}
	
	public static void main(String args[]){
		Deck2 a = new Deck2();
		System.out.println(a.ShowDeck());
		
	}
}
