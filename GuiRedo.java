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
    private JLabel heading,test,playcard;
    private JTextArea ta;
    private JPanel panel,layout1,panel2, message;

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
	//playcard = new JLabel(card);
	layout1 = new JPanel();
	layout1.add(new JLabel(card));

	panel = new JPanel(new BorderLayout());//(new GridLayout(6,1));
	    //panel.setMaximumSize(new Dimension (100,100));
	    //exitButton.setPreferredSize(new Dimension(10,40));
	panel2 = new JPanel();
	panel2.add(exitButton);
	panel2.add(heading);
	panel2.add(wisdom);
	panel2.add(likability);
	panel2.add(enthusiasm);
	panel2.add(charisma);
	panel2.add(bravery);

	panel.add(panel2, BorderLayout.NORTH);

	panel.add(layout1, BorderLayout.SOUTH);
	//panel.add(playcard);
	//panel.add(playcard, BorderLayout.SOUTH);

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
	pane.setSize(750,800);
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
