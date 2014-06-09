import java.io.*;
import java.util.*;

public class PlayGame{

    private ArrayList<Cards>specialCards, normal, myDeck;

    public PlayGame(){
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


    }

    public void makeDeck(){

    }


}