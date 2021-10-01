package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculator {

	void add(int a, int b) {
		JOptionPane.showMessageDialog(null, a+b);
	}
	void subtract(int a, int b) {
		JOptionPane.showMessageDialog(null, a-b);
	}
	void multiply(int a, int b) {
		JOptionPane.showMessageDialog(null, a*b);
	}
	void divide(int a, int b) {
		JOptionPane.showMessageDialog(null, a/b);
	}
	JFrame frame = new JFrame();
	JTextField fieldA = new JTextField();
	JTextField fieldB = new JTextField();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JLabel answer = new JLabel();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
