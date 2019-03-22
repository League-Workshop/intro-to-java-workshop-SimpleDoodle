package section3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	System.out.println("Welcome");
	String name=JOptionPane.showInputDialog("What is your name?");
	
	
	JOptionPane.showMessageDialog(null, name + " is legendary");
	String color=JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, color + " is the best color");
	String animal=JOptionPane.showInputDialog("What is your favorite animal?");
	JOptionPane.showMessageDialog(null, color + " is the only color");
	JOptionPane.showMessageDialog(null, "The best animal is the " + animal);
	
}
}
