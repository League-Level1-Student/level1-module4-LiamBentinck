import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	String cherry = "/_12_slot_machine/Cherry.jpeg";
	String lime = "/_12_slot_machine/Lime.jpeg";
	String orange = "/_12_slot_machine/Orange.jpeg";
	JLabel label1;
	JLabel label2;
	JLabel label3;

	SlotMachine() {
		frame.setVisible(true);
		frame.add(panel);
		try {
			label1 = createLabelImage(cherry);
			panel.add(label1);
			label2 = createLabelImage(lime);
			panel.add(label2);
			label3 = createLabelImage(orange);
			panel.add(label3);
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);

			frame.pack();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Random gen = new Random();
			int num = gen.nextInt(3);
			panel.remove(label1);
			if (num==0) {
				label1 = createLabelImage(cherry);
			} 
			else if(num==1) {
				label1 = createLabelImage(lime);
			}
			else if(num==2) {
				label1=createLabelImage(orange);
			}
			
			panel.add(label1);
			
		frame.pack();

		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
