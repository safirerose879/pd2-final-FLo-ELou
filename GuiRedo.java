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
    private JTextArea ta;
    private JPanel panel,layout1,panel2, message;

    private Deck3 d = new Deck3();

    private int numShuffles;

    private class myKeyListener implements KeyListener {
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {  
	}
    } //SHUFFLE BUTTON = MAX 3 SHUFFLES
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitButton) {
            System.exit(0);
        } 

	if (e.getSource() == rules){
	    message = new JPanel();
	    message.add(new JLabel("Here are the rules:"));
	    JOptionPane.showMessageDialog(null, message);
	}
	if (e.getSource() == wisdom){
	    message = new JPanel();
	    FlorenceLo f = new FlorenceLo();
	    message.add(new JLabel(f.getName() + " has " + String.valueOf(f.getWisdom()) + " WISDOM points"));
	    JOptionPane.showMessageDialog(null, message);
	}
 
	if (e.getSource() == likability){
	    message = new JPanel();
	    FlorenceLo f = new FlorenceLo();
	    message.add(new JLabel(f.getName() + " has " + String.valueOf(f.getLikability()) + " LIKABILITY points"));
	    JOptionPane.showMessageDialog(null, message);
	}

	if (e.getSource() == enthusiasm){
	    message = new JPanel();
	    FlorenceLo f = new FlorenceLo();
	    message.add(new JLabel(f.getName() + " has " + String.valueOf(f.getEnthusiasm()) + " ENTHUSIASM points"));
	    JOptionPane.showMessageDialog(null, message);
	}

	if (e.getSource() == charisma){
	    message = new JPanel();
	    FlorenceLo f = new FlorenceLo();
	    message.add(new JLabel(f.getName() + " has " + String.valueOf(f.getCharisma()) + " CHARISMA points"));
	    JOptionPane.showMessageDialog(null, message);
	}

	if (e.getSource() == bravery){
	    message = new JPanel();
	    FlorenceLo f = new FlorenceLo();
	    message.add(new JLabel(f.getName() + " has " + String.valueOf(f.getBravery()) + " BRAVERY points"));
	    JOptionPane.showMessageDialog(null, message);
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

	ImageIcon card = createImageIcon("CARDS/FlorenceLo.png", "florence card");
	ImageIcon enemyQM = createImageIcon("CARDS/question.png", "questionmark");
	//playcard = new JLabel(card);
	layout1 = new JPanel();
	layout1.add(new JLabel(card));
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
