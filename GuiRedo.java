import java.util.*;
import java.io.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class GuiRedo extends JFrame implements ActionListener {

    private JFrame pane;
    private Container buttons;
    private JButton exitButton, wisdom, likability, enthusiasm, charisma, bravery, shuffle, nextGame, rules;
    private JLabel heading,test,playcard;
    private JLabel card = new JLabel(new ImageIcon("question.png"));
    private JTextArea ta;
    private JPanel panel,layout1,panel2, message, begCards, rulesIntro, result, result1, result2;

    private Deck3 d = new Deck3();
    private Deck3 Tied = new Deck3();

    private Player3 A = new Player3();
    private Player3 B = new Player3();
    //private Player A = new Player();
    //private Player B = new Player();
    //private ImageIcon card;
    private ImageIcon enemyQM;

    private int numShuffles;

    //METHODS
    private class myKeyListener implements KeyListener {
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {  
	}
    } 
    
    public void actionPerformed(ActionEvent e) {
	result = new JPanel();
	result1 = new JPanel();

        if (e.getSource() == exitButton) {
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? Your progress will not be saved.");
	    if (reply == JOptionPane.YES_OPTION){
		System.exit(0);
	    }
        } 
	if (e.getSource() == rules){
	    message = new JPanel();
	    message.add(new JLabel("Here are the rules:"));
	    JOptionPane.showMessageDialog(null, message);
	}

	if (e.getSource() == wisdom){
	    message = new JPanel();
	    message.add(new JLabel(A.one.Starter.get(0).getName() + " has " + String.valueOf(A.one.Starter.get(0).getWisdom()) + " WISDOM points. Your opponent played the " + B.one.Starter.get(0).getName() + " card which has " + String.valueOf(B.one.Starter.get(0).getWisdom()) + " WISDOM points.")) ;
	    JOptionPane.showMessageDialog(null, message);

	    if (A.one.Starter.get(0).getWisdom() > B.one.Starter.get(0).getWisdom()){
		result.add(new JLabel("You won this round! Your opponent loses"));
		JOptionPane.showMessageDialog(null, result);
		if(Tied.size()!=0){
		    result1.add(new JLabel("You got the tied cards as well."));	   
		    JOptionPane.showMessageDialog(null, result1);
		    for (int i = 0; i < Tied.size(); i++){
			A.one.Starter.add(Tied.get(i));
		    }
		    for (int i = 0; i < Tied.size(); i++){
			Tied.remove(i);
		    }
		}
		A.one.Starter.add(B.one.Starter.get(0));
		B.one.Starter.remove(0);
	    }

	    else if (A.one.Starter.get(0).getWisdom() < B.one.Starter.get(0).getWisdom()){
		result.add(new JLabel("You lost this round...You lost a card."));
		JOptionPane.showMessageDialog(null, result);
		if(Tied.size()!=0){
		    result1.add(new JLabel("You lost the tied cards as well."));
		    JOptionPane.showMessageDialog(null, result1);
		    for (int i = 0; i < Tied.size(); i++){
			A.one.Starter.add(Tied.get(i));
		    }
		    for (int i = 0; i < Tied.size(); i++){
			Tied.remove(i);
		    }
		}		
		B.one.Starter.add(A.one.Starter.get(0));
		A.one.Starter.remove(0);
	    }

	    else{
		result.add(new JLabel("It's a tie! You both lose your card."));
		Tied.add(A.one.Starter.get(0));
		Tied.add(B.one.Starter.get(0));
		B.one.Starter.remove(0);
		A.one.Starter.remove(0);
		JOptionPane.showMessageDialog(null, result);
	    } 
	}
 
	if (e.getSource() == likability){

	    message = new JPanel();
	    message.add(new JLabel(A.one.Starter.get(0).getName() + " has " + String.valueOf(A.one.Starter.get(0).getLikability()) + " LIKABILITY points. Your opponent played the " + B.one.Starter.get(0).getName() + " card which has " + String.valueOf(B.one.Starter.get(0).getLikability()) + " LIKABILITY points.")) ;
	    JOptionPane.showMessageDialog(null, message);

	    if (A.one.Starter.get(0).getLikability() > B.one.Starter.get(0).getLikability()){
		result.add(new JLabel("You won this round! Your opponent loses"));
		JOptionPane.showMessageDialog(null, result);
		if(Tied.size()!=0){
		    result1.add(new JLabel("You got the tied cards as well."));	   
		    JOptionPane.showMessageDialog(null, result1);
		    for (int i = 0; i < Tied.size(); i++){
			A.one.Starter.add(Tied.get(i));
		    }
		    for (int i = 0; i < Tied.size(); i++){
			Tied.remove(i);
		    }
		}
		A.one.Starter.add(B.one.Starter.get(0));
		B.one.Starter.remove(0);
	    }

	    else if (A.one.Starter.get(0).getLikability() < B.one.Starter.get(0).getLikability()){
		result.add(new JLabel("You lost this round...You lost a card."));
		JOptionPane.showMessageDialog(null, result);
		if(Tied.size()!=0){
		    result1.add(new JLabel("You lost the tied cards as well."));
		    JOptionPane.showMessageDialog(null, result1);
		    for (int i = 0; i < Tied.size(); i++){
			A.one.Starter.add(Tied.get(i));
		    }
		    for (int i = 0; i < Tied.size(); i++){
			Tied.remove(i);
		    }
		}		
		B.one.Starter.add(A.one.Starter.get(0));
		A.one.Starter.remove(0);
	    }

	    else{
		result.add(new JLabel("It's a tie! You both lose your card."));
		Tied.add(A.one.Starter.get(0));
		Tied.add(B.one.Starter.get(0));
		B.one.Starter.remove(0);
		A.one.Starter.remove(0);
		JOptionPane.showMessageDialog(null, result);
	    } 
	}
 
	if (e.getSource() == enthusiasm){
	    message = new JPanel();
	    message.add(new JLabel(A.one.Starter.get(0).getName() + " has " + String.valueOf(A.one.Starter.get(0).getEnthusiasm()) + " ENTHUSIASM points. Your opponent played the " + B.one.Starter.get(0).getName() + " card which has " + String.valueOf(B.one.Starter.get(0).getEnthusiasm()) + " ENTHUSIASM points.")) ;
	    JOptionPane.showMessageDialog(null, message);

	    if (A.one.Starter.get(0).getEnthusiasm() > B.one.Starter.get(0).getEnthusiasm()){
		result.add(new JLabel("You won this round! Your opponent loses"));
		JOptionPane.showMessageDialog(null, result);
		if(Tied.size()!=0){
		    result1.add(new JLabel("You got the tied cards as well."));	   
		    JOptionPane.showMessageDialog(null, result1);
		    for (int i = 0; i < Tied.size(); i++){
			A.one.Starter.add(Tied.get(i));
		    }
		    for (int i = 0; i < Tied.size(); i++){
			Tied.remove(i);
		    }
		}
		A.one.Starter.add(B.one.Starter.get(0));
		B.one.Starter.remove(0);
	    }

	    else if (A.one.Starter.get(0).getEnthusiasm() < B.one.Starter.get(0).getEnthusiasm()){
		result.add(new JLabel("You lost this round...You lost a card."));
		JOptionPane.showMessageDialog(null, result);
		if(Tied.size()!=0){
		    result1.add(new JLabel("You lost the tied cards as well."));
		    JOptionPane.showMessageDialog(null, result1);
		    for (int i = 0; i < Tied.size(); i++){
			A.one.Starter.add(Tied.get(i));
		    }
		    for (int i = 0; i < Tied.size(); i++){
			Tied.remove(i);
		    }
		}		
		B.one.Starter.add(A.one.Starter.get(0));
		A.one.Starter.remove(0);
	    }

	    else{
		result.add(new JLabel("It's a tie! You both lose your card."));
		Tied.add(A.one.Starter.get(0));
		Tied.add(B.one.Starter.get(0));
		B.one.Starter.remove(0);
		A.one.Starter.remove(0);
		JOptionPane.showMessageDialog(null, result);
	    } 
	}

	if (e.getSource() == charisma){
	    message = new JPanel();
	    message.add(new JLabel(A.one.Starter.get(0).getName() + " has " + String.valueOf(A.one.Starter.get(0).getCharisma()) + " CHARISMA points. Your opponent played the " + B.one.Starter.get(0).getName() + " card which has " + String.valueOf(B.one.Starter.get(0).getCharisma()) + " CHARISMA points.")) ;
	    JOptionPane.showMessageDialog(null, message);

	    if (A.one.Starter.get(0).getCharisma() > B.one.Starter.get(0).getCharisma()){
		result.add(new JLabel("You won this round! Your opponent loses"));
		JOptionPane.showMessageDialog(null, result);
		if(Tied.size()!=0){
		    result1.add(new JLabel("You got the tied cards as well."));	   
		    JOptionPane.showMessageDialog(null, result1);
		    for (int i = 0; i < Tied.size(); i++){
			A.one.Starter.add(Tied.get(i));
		    }
		    for (int i = 0; i < Tied.size(); i++){
			Tied.remove(i);
		    }
		}
		A.one.Starter.add(B.one.Starter.get(0));
		B.one.Starter.remove(0);
	    }

	    else if (A.one.Starter.get(0).getCharisma() < B.one.Starter.get(0).getCharisma()){
		result.add(new JLabel("You lost this round...You lost a card."));
		JOptionPane.showMessageDialog(null, result);
		if(Tied.size()!=0){
		    result1.add(new JLabel("You lost the tied cards as well."));
		    JOptionPane.showMessageDialog(null, result1);
		    for (int i = 0; i < Tied.size(); i++){
			A.one.Starter.add(Tied.get(i));
		    }
		    for (int i = 0; i < Tied.size(); i++){
			Tied.remove(i);
		    }
		}		
		B.one.Starter.add(A.one.Starter.get(0));
		A.one.Starter.remove(0);
	    }

	    else{
		result.add(new JLabel("It's a tie! You both lose your card."));
		Tied.add(A.one.Starter.get(0));
		Tied.add(B.one.Starter.get(0));
		B.one.Starter.remove(0);
		A.one.Starter.remove(0);
		JOptionPane.showMessageDialog(null, result);
	    } 
	}

	if (e.getSource() == bravery){
	    message = new JPanel();
	    message.add(new JLabel(A.one.Starter.get(0).getName() + " has " + String.valueOf(A.one.Starter.get(0).getBravery()) + " BRAVERY points. Your opponent played the " + B.one.Starter.get(0).getName() + " card which has " + String.valueOf(B.one.Starter.get(0).getBravery()) + " BRAVERY points.")) ;
	    JOptionPane.showMessageDialog(null, message);

	    if (A.one.Starter.get(0).getBravery() > B.one.Starter.get(0).getBravery()){
		result.add(new JLabel("You won this round! Your opponent loses"));
		JOptionPane.showMessageDialog(null, result);
		if(Tied.size()!=0){
		    result1.add(new JLabel("You got the tied cards as well."));	   
		    JOptionPane.showMessageDialog(null, result1);
		    for (int i = 0; i < Tied.size(); i++){
			A.one.Starter.add(Tied.get(i));
		    }
		    for (int i = 0; i < Tied.size(); i++){
			Tied.remove(i);
		    }
		}
		A.one.Starter.add(B.one.Starter.get(0));
		B.one.Starter.remove(0);
	    }

	    else if (A.one.Starter.get(0).getBravery() < B.one.Starter.get(0).getBravery()){
		result.add(new JLabel("You lost this round...You lost a card."));
		JOptionPane.showMessageDialog(null, result);
		if(Tied.size()!=0){
		    result1.add(new JLabel("You lost the tied cards as well."));
		    JOptionPane.showMessageDialog(null, result1);
		    for (int i = 0; i < Tied.size(); i++){
			A.one.Starter.add(Tied.get(i));
		    }
		    for (int i = 0; i < Tied.size(); i++){
			Tied.remove(i);
		    }
		}		
		B.one.Starter.add(A.one.Starter.get(0));
		A.one.Starter.remove(0);
	    }

	    else{
		result.add(new JLabel("It's a tie! You both lose your card."));
		Tied.add(A.one.Starter.get(0));
		Tied.add(B.one.Starter.get(0));
		B.one.Starter.remove(0);
		A.one.Starter.remove(0);
		JOptionPane.showMessageDialog(null, result);
	    } 
	}

	if(e.getSource() == shuffle){
	    if (numShuffles == 2){
		message = new JPanel();
		d.shuffle();
		d.makeLL();
		numShuffles = numShuffles - 1;
		message.add(new JLabel("You have " + String.valueOf(numShuffles) + " shuffle left."));
		JOptionPane.showMessageDialog(null, message);
	    }
	    else if (numShuffles > 0){
		message = new JPanel();
		d.shuffle();
		d.makeLL();
		numShuffles = numShuffles - 1;
		message.add(new JLabel("You have " + String.valueOf(numShuffles) + " shuffles left."));
		JOptionPane.showMessageDialog(null, message);
	    }
	    else{
		message = new JPanel();
		message.add(new JLabel("Sorry, you don't have any shuffles left."));
		JOptionPane.showMessageDialog(null, message);
	    }
	}
    }

    protected ImageIcon createImageIcon(String path,
					String description) {
	java.net.URL imgURL = getClass().getResource(path);
	if (imgURL != null) {
	    return new ImageIcon(imgURL, description);
	} else {
	    System.err.println("Couldn't find file: " + path);
	    return null;
	}
    }

    public void PlayGameGUI(Player3 B){
	begCards = new JPanel();
	rulesIntro = new JPanel();
	result2 = new JPanel();

	for (int i = 0; i < A.one.Starter.size(); i++){
	    d.add(A.one.Starter.get(i));
	    d.makeLL();
	}
	
	int reply = JOptionPane.showConfirmDialog(null, "Welcome to a Emma [F]Lo[u] and Co. production. Would you like to know about the rules?");
	    if (reply == JOptionPane.YES_OPTION){
		rulesIntro.add(new JLabel("The rules are:"));
		JOptionPane.showMessageDialog(null, rulesIntro);
	    }
	    else{
		rulesIntro.add(new JLabel("Great! If you ever forget anything, you can always press the 'RULES' button on the top. Enjoy the game!")); 
		JOptionPane.showMessageDialog(null, rulesIntro);
	    }

	    Object[]options = {"Let's do this!", "Nah, I'll come back another time."};
	    int n = JOptionPane.showOptionDialog(null, "Would you like to start the game?","Start the Game?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	    if(n ==1){
		System.exit(0);
	    }
	    card.setIcon(new ImageIcon("CARDS/"+ A.one.DrawName() + ".png", "PlayerA card"));

	begCards.add(new JLabel("Your cards are: " + "\n" + d.toString()));
	JOptionPane.showMessageDialog(null, begCards);
	/*begCards.add(new JLabel("Your opponent's cards are:" + "\n" + B.one.Starter.makeLL().toString()));
	  JOptionPane.showMessageDialog(null, begCards);*/

	//ACTUAL GAME COMMENCES

	while(B.one.Starter.size()!=0 && A.one.Starter.size() !=0){
	    card.setIcon(new ImageIcon("CARDS/"+ A.one.DrawName() + ".png"));

	    if(B.one.Starter.size() == 0 && A.one.Starter.size() > 0){
		result2.add(new JLabel("Good job. YOU WON!!"));
		JOptionPane.showMessageDialog(null, result2);
		//insert exp
		//insert lvl up
	    }
	    if (A.one.Starter.size() == 0){
		result2.add(new JLabel("SORRY 'BOUT THAT. BETTER LUCK NEXT TIME"));
		JOptionPane.showMessageDialog(null, result2);
	    }
	    //insert won??
	}

    }

    public GuiRedo(){
	numShuffles = 3;

	pane = new JFrame();
	pane.getContentPane().setLayout(new FlowLayout());
	pane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	exitButton = new JButton("QUIT");
	rules = new JButton("RULES");
	wisdom = new JButton("WISDOM");
	likability = new JButton("LIKABILITY");
	enthusiasm = new JButton("ENTHUSIASM");
	charisma = new JButton("CHARISMA");
	bravery = new JButton("BRAVERY");
	shuffle = new JButton ("SHUFFLE");
	//nextGame = new JButton ("Proceed to the next round");
	heading = new JLabel ("CARD GAME!");

	/*
	buttons = new Container();
	buttons.setLayout(new FlowLayout());
  
        //buttons.add(exitButton);
        buttons.add(wisdom);
        buttons.add(likability);
        buttons.add(enthusiasm);
        buttons.add(charisma);
        buttons.add(bravery);
	//buttons.add(heading);
	*/

	card.setIcon(new ImageIcon("CARDS/question.png", "PlayerA card"));
	enemyQM = createImageIcon("CARDS/question.png", "questionmark");
	//playcard = new JLabel(card);
	layout1 = new JPanel();
	//layout1.add(new JLabel(card));
	layout1.add(card);
	layout1.add(new JLabel(enemyQM));

	panel = new JPanel(new BorderLayout());//(new GridLayout(6,1));
	    //panel.setMaximumSize(new Dimension (100,100));
	    //exitButton.setPreferredSize(new Dimension(10,40));
	panel2 = new JPanel();
	panel2.add(exitButton);
	panel2.add(rules);
	panel2.add(heading);
	panel2.add(wisdom);
	panel2.add(likability);
	panel2.add(enthusiasm);
	panel2.add(charisma);
	panel2.add(bravery);
	panel2.add(shuffle);
	//panel2.add(nextGame);

	panel.add(panel2, BorderLayout.NORTH);

	panel.add(layout1, BorderLayout.SOUTH);
	//panel.add(playcard);
	//panel.add(playcard, BorderLayout.SOUTH);

	exitButton.addActionListener(this); 
	rules.addActionListener(this);
	wisdom.addActionListener(this);
	likability.addActionListener(this);
	enthusiasm.addActionListener(this);
	charisma.addActionListener(this);
	bravery.addActionListener(this);
	shuffle.addActionListener(this);

	pane.add(panel);

	pane.pack();
	pane.setVisible(true);
	pane.setTitle("Card Game");
	pane.setSize(850,800);
	pane.setLocation(250,100);

	Player3 Floem = new Player3();
	PlayGameGUI(Floem);

	/*JPanel gui = new JPanel(new BorderLayout());
                JPanel labels = new JPanel();
                labels.add(new JLabel("Label 1"));
                labels.add(new JLabel("Label 2"));

                gui.add(labels, BorderLayout.NORTH);
                gui.add(new JButton("Button"), BorderLayout.SOUTH);

                JOptionPane.showMessageDialog(null, gui);*/
    }
    public static void main(String[] args) {
        GuiRedo g = new GuiRedo();
    }


}
