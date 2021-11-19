package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
Date start = new Date();
void drawButtons () {
	frame.dispose();
	frame = new JFrame();
	 panel = new JPanel();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.setLayout(new GridLayout(8, 3));	
	Random ran = new Random();
	int r = ran.nextInt(24);
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


private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}

private void playSound(String fileName) { 
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}







Random dom = new Random();
int  decide = dom.nextInt(5);
int missed = (0);
int whacked = (0);
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	drawButtons();
	JButton b = (JButton)e.getSource();
	String t = b.getText();
	if (t.equals(" ")) {
	missed+=1;
	}
	if (t.equals(" ") && decide==1) {
		speak("You missed");
		}
	if (t.equals(" ") && decide==2) {
		speak("Wow you missed");
		}
	if (t.equals(" ") && decide==3) {
		speak("You missed. Could not be me.");
		}
	if (t.equals(" ") && decide==4) {
		speak("You missed");
		}
	if (missed==5) {
		endGame(start, missed);
	}
	JButton j = (JButton)e.getSource();
	String l = j.getText();
	if (l.equals("Mole")) {
		whacked+=1;
		playSound("pineapple.wav");
	}
	if (whacked==10) {
		endGame(start, whacked);
	}
	
}
	
	
	
	
	
}
