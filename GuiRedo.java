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
    }


}