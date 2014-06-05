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
    private JButton exitButton, wisdom, likability, enthusiasm, charisma, bravery;
    private JLabel heading;
    private JTextArea ta;
    private JPanel panel;

    private class myKeyListener implements KeyListener {
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {  
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

    public GuiRedo(){
	pane = new JFrame();
	pane.getContentPane().setLayout(new FlowLayout());
	pane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	exitButton = new JButton("QUIT");
	wisdom = new JButton("WISDOM");
	likability = new JButton("LIKABILITY");
	enthusiasm = new JButton("ENTHUSIASM");
	charisma = new JButton("CHARISMA");
	bravery = new JButton("BRAVERY");
	heading = new JLabel ("CARD GAME!");

	buttons = new Container();
	buttons.setLayout(new FlowLayout());
  
        //buttons.add(exitButton);
        buttons.add(wisdom);
        buttons.add(likability);
        buttons.add(enthusiasm);
        buttons.add(charisma);
        buttons.add(bravery);
	//buttons.add(heading);

	panel = new JPanel();
	panel.add(exitButton);
	panel.add(heading);
	panel.add(buttons);

	exitButton.addActionListener(this); 
	wisdom.addActionListener(this);
	likability.addActionListener(this);
	enthusiasm.addActionListener(this);
	charisma.addActionListener(this);
	bravery.addActionListener(this);

	pane.add(panel);

	pane.pack();
	pane.setVisible(true);
	pane.setTitle("Card Game");
	pane.setSize(750,500);
	pane.setLocation(250,100);
    }
    public static void main(String[] args) {
        GuiRedo g = new GuiRedo();
    }


}
