package lab30;

//Samostalni rad

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ButtonHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Dobrodošao u klub");
	}
}

class ButtonHandler2 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Ćao");
	}
}

public class Window {

	public static void main(String[] args) {
		JButton yesButton = new JButton("Da");
		JButton noButton = new JButton("Ne");
		ButtonHandler listener = new ButtonHandler();
		yesButton.addActionListener(listener);
		ButtonHandler2 listener2 = new ButtonHandler2();
		noButton.addActionListener(listener2);
		JPanel content = new JPanel();
		JLabel label = new JLabel();
		label.setText("Da li imate preko 18 godina?");
		content.setLayout(new BorderLayout());

		content.add(noButton, BorderLayout.EAST);
		content.add(yesButton, BorderLayout.WEST);
		content.add(label, BorderLayout.CENTER);
		JFrame window = new JFrame("Neki prozor");
		window.setContentPane(content);
		window.setSize(350, 100);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
