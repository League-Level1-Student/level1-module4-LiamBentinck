package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
ChuckleClicker chuck = new ChuckleClicker();
chuck.makeButtons();
	
	
	
	
	
}
void makeButtons() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
	button1.setText("joke");
	button1.addActionListener(this);
	button2.setText("punchline");
	button2.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button1) {
		JOptionPane.showMessageDialog(null, "why did the chicken cross the road");
	}
	else if (e.getSource()==button2) {
		JOptionPane.showMessageDialog(null, "i dont know");
		
	}
}
}
