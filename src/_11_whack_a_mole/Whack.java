package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whack implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
void drawButtons () {
	 frame = new JFrame();
	 panel = new JPanel();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.setLayout(new GridLayout(8, 3));	
	Random ran = new Random();
	int r = ran.nextInt(25);
	for (int i = 0; i < 24; i++) {
		JButton button = new JButton(" ");
		if (i==r) {
			button.setText("Mole");
		}
		button.addActionListener(this);
		panel.add(button);
	}
	frame.pack();
}
Whack() {
 drawButtons();
	
	
}
static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	drawButtons();
	JButton b = (JButton)e.getSource();
	String t = b.getText();
	if (t.equals(" ")) {
	speak("You missed");
	}
}
	
	
	
	
	
}
