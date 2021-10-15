package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	int add(int a, int b) {
		return a+b;
	}
	int subtract(int a, int b) {
		return a-b;
	}
	int multiply(int a, int b) {
		return a*b;
	}
	int divide(int a, int b) {
		return a/b;
	}
	JFrame frame = new JFrame();
	JTextField fieldA = new JTextField(10);
	JTextField fieldB = new JTextField(10);
	JButton add = new JButton("add");
	JButton sub = new JButton("subtract");
	JButton mul = new JButton("multiply");
	JButton div = new JButton("divide");
	JLabel answer = new JLabel();
	JPanel panel = new JPanel();
	
	Calculator(){
		panel.add(add);
		panel.add(sub);
		panel.add(div);
		panel.add(mul);
		panel.add(fieldA);
		panel.add(fieldB);
		panel.add(answer);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String u1 = fieldA.getText();
		int i1 = Integer.parseInt(u1);
		String u2 = fieldB.getText();
		int i2 = Integer.parseInt(u2);
		if (e.getSource()==add) {
			int sum = add(i1, i2);
			answer.setText(sum+"");
			frame.pack();
		}
		if (e.getSource()==sub) {
			int min = subtract(i1, i2);
			answer.setText(min+"");
			frame.pack();
		}
		if (e.getSource()==mul) {
			int mult = multiply(i1, i2);
			answer.setText(mult+"");
			frame.pack();
		}
		if (e.getSource()==div) {
			int divi = divide(i1, i2);
			answer.setText(divi+"");
			frame.pack();
		}
	}
	
	

	
	
	
}
