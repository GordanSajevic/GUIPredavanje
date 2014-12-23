package lab30;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rectangle {
	
	public static void main(String[] args)
	{
		RepaintListener listener = new RepaintListener();
			
		Canvas canvasPanel = new Canvas();
		canvasPanel.addMouseListener(listener);
		JFrame mainWindow = new JFrame("Šareni pravougaonik.");
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setVisible(true);
		mainWindow.setSize(300, 200);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static class RepaintListener implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			Component source = (Component) e.getSource();
			source.repaint();
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static class Canvas extends JPanel{
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			float a = (float)Math.random();
			float b = (float)Math.random();
			float c = (float)Math.random();
			g.setColor(new Color(a, b, c));
			g.fillRect(10, 10, getWidth() - 20, getHeight() - 20);
		}
	}

}
