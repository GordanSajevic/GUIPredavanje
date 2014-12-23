package lab30;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NoviGUI {
	
	public static void main(String[] args) {
		JFrame gui101 = new JFrame();
		gui101.setVisible(true);
		gui101.setSize(300, 300);
		gui101.setTitle("GUI101");
		gui101.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = new Dimension();
		Dimension d = new Dimension();
		d.setSize(450, 450);
		dim.setSize(500, 500);
		gui101.setMaximumSize(dim);
		JPanel panel = new JPanel();
		panel.setSize(d);
		JButton button1 = new JButton("PRVO DUGME");
		panel.add(button1);
		JButton button2 = new JButton("DRUGO DUGME");
		panel.add(button2);
		gui101.add(panel);
		ButtonHandler listener = new ButtonHandler();
		button1.addActionListener(listener);
	}
	
	static private class ButtonHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Click!");
			JButton b = (JButton)e.getSource();
			b.setText("Kliknuto!");
			
		}
		
	}
}
