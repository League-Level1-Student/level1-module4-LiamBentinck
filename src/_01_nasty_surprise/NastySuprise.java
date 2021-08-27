package _01_nasty_surprise;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	JButton trick = new JButton();
	JButton treat = new JButton();
	void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		trick.setText("trick");
		treat.setText("Treat");
		trick.addActionListener(this);
		treat.addActionListener(this);
		panel.add(trick);
		panel.add(treat);
		frame.pack();
	}
	
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==trick) {
		showPictureFromTheInternet("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg");	
		}
		else if (e.getSource()==treat) {
			showPictureFromTheInternet("https://i.pinimg.com/originals/67/34/e0/6734e009f05a78a6c4c9ecf3cf2d19bc.png");
		}
	}
}
