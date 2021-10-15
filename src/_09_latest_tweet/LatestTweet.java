package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(8);
	JButton button = new JButton("Search the Twitterverse");
	LatestTweet(){
		button.addActionListener(this);
		panel.add(text);
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			System.out.println("Tweet, Tweet");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
