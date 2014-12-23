package lab30;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Circle {
	
	public static void main(String[] args)
	{

		CreateCircle listener = new CreateCircle();
		
		Canvas canvasPanel = new Canvas();
		float a = (float)Math.random();
		float b = (float)Math.random();
		float c = (float)Math.random();
		canvasPanel.setBackground(new Color(a, b, c));
		canvasPanel.addMouseListener(listener);
		canvasPanel.addMouseMotionListener(listener);
		JFrame mainWindow = new JFrame("Kružić");
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setVisible(true);
		mainWindow.setSize(500, 500);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static class CreateCircle implements MouseListener, MouseMotionListener
	{
		private Color selectedColor = Color.RED;

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int colorPickerSize = 30;
			Component source = (Component)e.getSource();
			Graphics g = source.getGraphics();
			if (e.getY() >= source.getHeight() - colorPickerSize)
			{
				if (e.getX() >= colorPickerSize && e.getX() < colorPickerSize)
				{
					selectedColor = Color.RED;
				}
				else if (e.getX() < colorPickerSize * 2)
				{
					selectedColor = Color.GREEN;
				}
				else if(e.getX() < colorPickerSize*3)
				{
					selectedColor = Color.BLUE;
				}
			}
			
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

		@Override
		public void mouseDragged(MouseEvent e) {
			Component source = (Component)e.getSource();
			Graphics g = source.getGraphics();
			g.setColor(selectedColor);
			int ovalDiameter = 50;
			g.fillOval(e.getX()-ovalDiameter/2, e.getY()-ovalDiameter/2, ovalDiameter, ovalDiameter);
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}
	public static class Canvas extends JPanel{
		@Override
		public void paintComponent(Graphics g)
		{
			int colorPickerSize = 30;
			
			g.setColor(Color.RED);
			g.fillRect(colorPickerSize * 0, getHeight() - colorPickerSize, colorPickerSize, colorPickerSize);
			
			g.setColor(Color.GREEN);
			g.fillRect(colorPickerSize * 1, getHeight() - colorPickerSize, colorPickerSize, colorPickerSize);
			
			g.setColor(Color.BLUE);
			g.fillRect(colorPickerSize * 2, getHeight() - colorPickerSize, colorPickerSize, colorPickerSize);
		}
	}
	
}
