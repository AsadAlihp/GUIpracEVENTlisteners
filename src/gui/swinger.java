package gui;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//-------------------------------------------

//HEADER FOR JFRAME---
import javax.swing.*;

public class swinger {

	public static void main(String[] args) {
		// THIS IS FRAME STUFF:

		final JFrame fr = new JFrame("this is test");
		fr.setVisible(true);
		fr.setSize(450, 300);

		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// NOW CREATING JPANEL IN WHICH THEN WE CAN ADD OTHER SUFF LIKE BUTTONS
		// LEBALS ETC
		JPanel pan = new JPanel();
		fr.add(pan);

		// Now we can add buttons text fields etc
		final JLabel l = new JLabel("Hello asad this is all yours (JLabel)");
		pan.add(l);

		// TEXT AREA:-----
		final TextArea ta = new TextArea();
		ta.setSize(450, 30);

		pan.add(ta);

		// LWTS ADD SOME BUTTONS RIGHT IN HERE...
		JLabel l2 = new JLabel("hit this button to see scroll bar");
		JButton b = new JButton("Hi! Click me");

		// ADDING TESTFEILD IN THE FRAM SO L ETS PUT SOME TEXT F EILDS
		TextField tf = new TextField();
		pan.add(tf);

		b.addActionListener(new ActionListener() {
			// BUTTON ACTION
			public void actionPerformed(ActionEvent arg0) {
				ta.setText(ta.getText()
						+ "\nWow !!! finaly you hit that button!!!");
			}
		});
		pan.add(l2);
		pan.add(b);

		// ANOTHER BUTTON FOR ACTION LESTENING
		JButton b2 = new JButton("Exit???");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// display/center the jdialog when the button is pressed
				// ADDING JOPTION PANE + conform Box:
				JOptionPane jo = new JOptionPane();
				int yn = JOptionPane.YES_NO_OPTION;

				if (JOptionPane.showConfirmDialog(jo,
						"You Want to leave or not??", "Are you sure?", yn) != JOptionPane.NO_OPTION) {
					System.exit(0);
				}
			}
		});
pan.add(new JButton("I'm demostrating borderlayout"), BorderLayout.CENTER);
		pan.add(b2);
	}

}
