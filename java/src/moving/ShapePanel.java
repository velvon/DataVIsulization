package moving;


import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.fillRect(75, 300, (int)getWidth()/40, (int)(getHeight()/5));
		window.fillRect(getWidth()-75, 300, (int)getWidth()/40, (int)(getHeight()/5));
		window.setColor(Color.YELLOW);
		window.fillOval(300, 300, 20, 20);
		window.setColor(Color.BLACK);
		window.drawString("0", 100, 75);
		window.drawString("0", getWidth()-100, 75);


		//make a Shape
		//draw the Shape
	}
}