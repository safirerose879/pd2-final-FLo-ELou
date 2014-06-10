import java.io.*;
import java.util.*;

public class PlayGame{

    private ArrayList<Cards>specialCards, normal, myDeck, everything;

    public PlayGame(){

	specialCards = new ArrayList<Cards>();
	normal = new ArrayList<Cards>();
	myDeck = new ArrayList<Cards>();
	everything = new ArrayList<Cards>();

	Bob b = new Bob();
	Dave d = new Dave();

	AngelaLin AL = new AngelaLin();
	BrownMykolyk BM = new BrownMykolyk();
	Cocoros CO = new Cocoros();
	EmmaLou EL = new EmmaLou();
	FlorenceLo FL = new FlorenceLo();
	JerryDai JD = new JerryDai();
	KevinKan KK = new KevinKan();
	LawrenceLim LL = new LawrenceLim();
	MicheleChan MC = new MicheleChan();
	WookyungLee WL = new WookyungLee();
	Zamansky ZA = new Zamansky();

	for (int i = 0; i < 5; i ++){
	    normal.add(b);
	    normal.add(d);
	}

	specialCards.add(AL);
	specialCards.add(BM);
	specialCards.add(CO);
	specialCards.add(EL);
	specialCards.add(FL);
	specialCards.add(JD);
	specialCards.add(KK);
	specialCards.add(LL);
	specialCards.add(MC);
	specialCards.add(WL);
	specialCards.add(ZA);

	for (int i = 0; i < normal.size(); i++){
	    everything.add(normal.get(i));
	}
	for (int i = 0; i < specialCards.size(); i++){
	    everything.add(specialCards.get(i));
	}

    }

    public String makeDeck(){

	Random r = new Random();
	for (int i = 0; i < 10; i++){
	    int n = r.nextInt(everything.size());
	    myDeck.add(everything.get(n));
	}
	String s = new String();
	for (int i = 0; i < myDeck.size(); i++){
	    s +=myDeck.get(i).getName() + "\n";
	}
	return s;
    }

    public static void main (String args[]){
	PlayGame a = new PlayGame();
	System.out.println(a.makeDeck());
    }


}