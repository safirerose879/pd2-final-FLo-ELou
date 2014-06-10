import java.util.*;
import java.io.*;

public class Deck2 extends ArrayList<Cards> {

    private ArrayList<Cards> Starter;
	
    public Deck2(){
		
	ArrayList<Cards> BoringDeck = new ArrayList<Cards>();
	Starter = new ArrayList<Cards>();
	Bob b = new Bob();
	Dave d = new Dave();

	//System.out.println("Checking");
	//System.out.println(b.getName());

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
		
	//System.out.println("hmmm");

	while(BoringDeck.size() > 0){
	    //int num = (int) (Math.random() * BoringDeck.size() + 1);
	    Random r = new Random();
	    int num = r.nextInt(BoringDeck.size());	    
	    Starter.add(BoringDeck.get(num));
	    BoringDeck.remove(num);
	}

    }
	
    public void shuffle(){
	ArrayList<Cards> temp = new ArrayList<Cards>();
	int n = Starter.size();

	for(int i = 0;i<Starter.size() ;i++){
	    temp.add(Starter.get(i));
	}

	while(temp.size() > 0){
	    Random r = new Random();
	    int num = r.nextInt(temp.size());	    
	    Starter.add(temp.get(num));
	    temp.remove(num);
	}

	for(int j = 0;j<n ;j++){
	    Starter.remove(j);
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
	System.out.println("\n");
	a.shuffle();
	System.out.println(a.ShowDeck());
		
    }
}
