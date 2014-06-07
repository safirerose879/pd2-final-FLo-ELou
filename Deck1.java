import java.util.*;
import java.io.*;

public class Deck1 extends ArrayList<Cards> {

	ArrayList<Cards> Starter;
	
	public Deck1(){
		Bob a = new Bob();
		Bob b = new Bob();
		Bob c = new Bob();
		Bob d = new Bob();
		Bob e = new Bob();
		Dave f = new Dave();
		Dave g = new Dave();
		Dave h = new Dave();
		Dave i = new Dave();
		Dave j = new Dave();
		Cards[] BoringDeck = {a,b,c,d,e,f,g,h,i,j};
		Starter = new ArrayList<Cards>();
		int k = 0;
		while(BoringDeck[k] != null){
			int num = (int) (Math.random() * BoringDeck.length - 1);
			Starter.add(BoringDeck[num]);
			BoringDeck[num] = null;
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
		Deck1 a = new Deck1();
		System.out.println(a.ShowDeck());
		
	}
}
