import java.util.*;
import java.io.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Gui extends JFrame implements ActionListener {
    
    private Container buttons;
    private JFrame pane;
    private JButton exitButton, wisdom, likability, enthusiasm, charisma, bravery, shuffle, nextGame;
    private JLabel heading, obstacle; 
    private JPanel panel;
    private JTextArea ta;


    private class myKeyListener implements KeyListener {
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {  
	}
    }
    private class TextAreaOutputStream extends OutputStream {
	 private final JTextArea textArea;
	 private final StringBuilder sb = new StringBuilder();

	public TextAreaOutputStream(final JTextArea textArea){
	    this.textArea = textArea;
	}

	public void flush(){
	}
	public void close(){
	}
	public void write (int b) throws IOException {
	    if (b == '\r'){
		return;
	    }
	    if (b == '\n') {
		final String text = sb.toString() + "\n";
		textArea.append(text);
		sb.setLength(0);
	    }
	    else {
		sb.append((char)b);
	    }
	}

	}

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitButton) {
            System.exit(0);
        } 
	if (e.getSource() == wisdom){
	    ta = new JTextArea ("wisdom");
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


    public Gui(){
	pane = new JFrame();
	//wisdom, likability, enthusiasm, charisma, bravery;
       
	pane.getContentPane().setLayout(new FlowLayout());
	pane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	ta = new JTextArea(450, 20);
	ta.setEditable(false);
	//System.setOut(new PrintStream(new TextAreaOutputStream(ta)));

	//radioButtons = new ButtonGroup();	

	exitButton = new JButton("QUIT");
	wisdom = new JButton("WISDOM");
	likability = new JButton("LIKABILITY");
	enthusiasm = new JButton("ENTHUSIASM");
	charisma = new JButton("CHARISMA");
	bravery = new JButton("BRAVERY");
	shuffle = new JButton("SHUFFLE");
	nextGame = new JButton("Next Game");
	heading = new JLabel ("CARD GAME!");

	buttons = new Container();
	buttons.setLayout(new FlowLayout());
  
        buttons.add(exitButton);
        buttons.add(wisdom);
        buttons.add(likability);
        buttons.add(enthusiasm);
        buttons.add(charisma);
        buttons.add(bravery);
        buttons.add(heading);
	buttons.add(shuffle);
	buttons.add(nextGame);
		

	heading.setFont(new Font("Broadway", Font.BOLD, 20));

	panel = new JPanel();
	panel.add(buttons);
	panel.add(ta);

	pane.add(panel);

	//pane.add(new JScrollPane(ta));
	JScrollPane sp = new JScrollPane(ta); 
	pane.add(sp);
	pane.pack();
	pane.setVisible(true);	

	exitButton.addActionListener(this); 
	wisdom.addActionListener(this);
	likability.addActionListener(this);
	enthusiasm.addActionListener(this);
	charisma.addActionListener(this);
	bravery.addActionListener(this);
	shuffle.addActionListener(this);
	nextGame.addActionListener(this);

	pane.setTitle("Card Game");
	//panel.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
	pane.setSize(750,400);
	pane.setLocation(250,150);	
	pane.setVisible(true); 
    }

 public static void main(String[] args) {
        Gui g = new Gui();
	//TextAreaOutputStream taos = new TextAreaOutputStream (ta);
    }
}